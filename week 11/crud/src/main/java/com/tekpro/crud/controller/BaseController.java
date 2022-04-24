package com.tekpro.crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

public interface BaseController<T, ID> {
	List<T> getAll();
        
        T getById(@RequestParam ID id);
        
        String save(T object);
        
        String saveMultiple(String JSONString, String type);
        
        String delete(ID id);
        
        String update(T object);
        
        String updateMultiple(String JSONString, String type);
}
