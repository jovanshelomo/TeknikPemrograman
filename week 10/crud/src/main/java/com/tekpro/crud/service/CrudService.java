package com.tekpro.crud.service;

import com.google.firebase.database.FirebaseDatabase;
import java.util.List;

public interface CrudService<T, ID> {

    final FirebaseDatabase database = FirebaseDatabase.getInstance();

    List<T> getAll();

    T getById(ID id);

    String save(T object);

    String saveMultiple(String JSONString);

    String delete(ID id);

    String update(T object);
    
    String updateMultiple(String JSONString);
}
