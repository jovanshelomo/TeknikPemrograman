package com.tekpro.crud.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tekpro.crud.entity.Cinema;
import com.tekpro.crud.service.CinemaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CinemaController implements BaseController<Cinema, String> {

    @Autowired

    CinemaService cinemaService;

    @Override
    @GetMapping(value = "/cinema")
    public List<Cinema> getAll() {
        return cinemaService.getAll();
    }

    @Override
    @GetMapping(value = "/cinema", params = "id")
    public Cinema getById(@RequestParam String id) {
        return cinemaService.getById(id);
    }

    @Override
    @PostMapping(value = "/cinema")
    public String save(@RequestBody Cinema c) {
        return cinemaService.save(c);
    }

    @Override
    @PostMapping(value = "/cinema", params = "type")
    public String saveMultiple(@RequestBody String s, @RequestParam String type) {
        if (type.equals("multi")) {
            return cinemaService.saveMultiple(s);
        } else {
            return "Unknown param";
        }
    }

    @Override
    @DeleteMapping(value = "/cinema")
    public String delete(@RequestParam String id) {
        return cinemaService.delete(id);
    }

    @Override
    @PatchMapping(value = "/cinema")
    public String update(@RequestBody Cinema c) {
        return cinemaService.update(c);
    }

    @Override
    @PatchMapping(value = "/cinema", params = "type")
    public String updateMultiple(@RequestBody String s, @RequestParam String type) {
        if (type.equals("multi")) {
            return cinemaService.updateMultiple(s);
        } else {
            return "Unknown param";
        }
    }
}
