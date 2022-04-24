package com.tekpro.crud.service;

import com.google.api.core.ApiFuture;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tekpro.crud.entity.Cinema;
import com.tekpro.crud.entity.Ticket;
import static com.tekpro.crud.service.CrudService.database;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class TicketService implements CrudService<Ticket, String> {

    @Override
    public List<Ticket> getAll() {
        CompletableFuture<List<Ticket>> future = new CompletableFuture<>();

        DatabaseReference ref = database.getReference("tickets");
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                List<Ticket> converted = new ArrayList<>(((Map<String, Ticket>) dataSnapshot.getValue()).values());
                future.complete(converted);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("data gagal didapatkan");
                future.complete(new ArrayList<>());
            }
        });

        try {
            return future.get();
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(TicketService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Ticket getById(String id) {
        CompletableFuture<Ticket> future = new CompletableFuture<>();

        DatabaseReference ref = database.getReference("tickets");
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                GenericTypeIndicator<HashMap<String, Ticket>> t = new GenericTypeIndicator<HashMap<String, Ticket>>() {
                };
                for (DataSnapshot child : dataSnapshot.getChildren()) {
                    if (child.getKey().equals(id)) {
                        future.complete(child.getValue(Ticket.class));
                        return;
                    }
                }
                System.out.println("data tidak ditemukan");
                future.complete(null);
                throw new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "entity not found"
                );

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("data gagal didapatkan");
                future.complete(null);
            }
        }
        );

        try {
            Ticket c = future.get();
            return c;
        } catch (InterruptedException | ExecutionException ex) {
            Logger.getLogger(TicketService.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String save(Ticket c) {
        if (c.getId() != null) {
            DatabaseReference ref = database.getReference("tickets");
            ApiFuture<Void> future = ref.child(c.getId()).setValueAsync(c);
            return "success save data with id: " + c.getId();
        } else {
            return "failed to save without id";
        }
    }

    @Override
    public String saveMultiple(String JSONString) {
        try {
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            DatabaseReference ref = database.getReference("tickets");
            Type listType = new TypeToken<ArrayList<Ticket>>() {
            }.getType();
            Map<String, Object> tickets = new HashMap<>();
            for (Ticket i : (List<Ticket>) gson.fromJson(JSONString, listType)) {
                tickets.put(i.getId(), i);
            }
            ApiFuture<Void> future = ref.updateChildrenAsync(tickets);
            return "success save multiple data";
        } catch (JsonSyntaxException e) {
            return "failed to save data: JSON string not valid";
        } catch (Exception e) {
            return "failed to save data: Unknown reason";
        }
    }

    @Override
    public String delete(String id) {
        DatabaseReference ref = database.getReference("tickets");
        ApiFuture<Void> future = ref.child(id).setValueAsync(null);
        return "success deleted data with id: " + id;
    }

    @Override
    public String update(Ticket c) {
        if (c.getId() != null) {
            DatabaseReference ref = database.getReference("tickets");
            Map<String, Object> data = new HashMap<>();
            if (c.getTitle() != null) {
                data.put(c.getId() + "/title", c.getTitle());
            }
            if (c.getPrice() > 0) {
                data.put(c.getId() + "/price", c.getPrice());
            }
            ApiFuture<Void> future = ref.updateChildrenAsync(data);
            return "success update data with id: " + c.getId();
        } else {
            return "failed to update data without id";
        }
    }

    @Override
    public String updateMultiple(String JSONString) {
        try {
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            DatabaseReference ref = database.getReference("tickets");
            Type listType = new TypeToken<ArrayList<Ticket>>() {
            }.getType();
            Map<String, Object> updates = new HashMap<>();
            for (Ticket i : (List<Ticket>) gson.fromJson(JSONString, listType)) {
                if (i.getTitle()!= null) {
                    updates.put(i.getId() + "/title", i.getTitle());
                }
                if (i.getPrice() > 0) {
                    updates.put(i.getId() + "/price", i.getPrice());
                }
            }
            ApiFuture<Void> future = ref.updateChildrenAsync(updates);
            return "success save multiple data";
        } catch (JsonSyntaxException e) {
            return "failed to save data: JSON string not valid";
        } catch (Exception e) {
            return "failed to save data: Unknown reason";
        }
    }
}
