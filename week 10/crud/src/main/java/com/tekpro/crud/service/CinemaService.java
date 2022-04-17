package com.tekpro.crud.service;

import com.google.api.core.ApiFuture;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import com.tekpro.crud.entity.Cinema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

@Service
public class CinemaService implements CrudService<Cinema, String> {

    @Override
    public List<Cinema> getAll() {
        //untuk menampung hasil yang akan didapatkan
        //menggunakan CompletableFuture yang menggunakan variable generic List yang menggunakan variable generic Cinema
        CompletableFuture<List<Cinema>> future = new CompletableFuture<>();

        //db ref dari firebase
        DatabaseReference ref = database.getReference("cinemas");
        //dikarenakan menggunakan realtime DB, sehingga cara untuk mendapatkan data
        //yang hanya sekali adalah dengan menggunakan addListenerForSingleValueEvent
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                List<Cinema> converted = new ArrayList<>(((Map<String, Cinema>) dataSnapshot.getValue()).values());
                //ketika data sudah diterima, maka future akan selesai dan akan dilanjutkan kepada return
                future.complete(converted);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("data gagal didapatkan");
                future.complete(new ArrayList<>());
            }
        });

        try {
            //future.get() akan berhasil didapatkan jika future.complete sudah dipanggil
            return future.get();
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(CinemaService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Cinema getById(String id) {
        CompletableFuture<Cinema> future = new CompletableFuture<>();

        DatabaseReference ref = database.getReference("cinemas");
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                GenericTypeIndicator<HashMap<String, Cinema>> t = new GenericTypeIndicator<HashMap<String, Cinema>>() {
                };
                //mencari apakah ada id yang dicari, jika ada kembalikan
                for (DataSnapshot child : dataSnapshot.getChildren()) {
                    if (child.getKey().equals(id)) {
                        future.complete(child.getValue(Cinema.class));
                        return;
                    }
                }
                System.out.println("data tidak ditemukan");
                future.complete(null);
            }

            @Override

            public void onCancelled(DatabaseError databaseError) {
                System.out.println("data gagal didapatkan");
                future.complete(null);
            }
        }
        );

        try {
            Cinema c = future.get();
            return c;
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(CinemaService.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String save(Cinema c) {
        if (c.getId() != null) {
            DatabaseReference ref = database.getReference("cinemas");
            ApiFuture<Void> future = ref.child(c.getId()).setValueAsync(c);
            return "success save data with id: " + c.getId();
        } else {
            return "failed to save without id";
        }
    }

    @Override
    public String delete(String id) {
        DatabaseReference ref = database.getReference("cinemas");
        ApiFuture<Void> future = ref.child(id).setValueAsync(null);
        return "success deleted data with id: " + id;
    }

    @Override
    public String update(Cinema c) {
        if (c.getId() != null) {
            DatabaseReference ref = database.getReference("cinemas");
            Map<String, Object> data = new HashMap<>();
            if (c.getAddress() != null) {
                data.put(c.getId() + "/address", c.getAddress());
            }
            if (c.getName() != null) {
                data.put(c.getId() + "/name", c.getName());
            }
            ApiFuture<Void> future = ref.updateChildrenAsync(data);
            return "success update data with id: " + c.getId();
        } else {
            return "failed to update data without id";
        }
    }

}
