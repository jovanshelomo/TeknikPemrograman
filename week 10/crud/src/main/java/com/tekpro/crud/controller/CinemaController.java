package com.tekpro.crud.controller;

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
    @GetMapping(value = "/getCinema")
    public List<Cinema> getAll() {
        return cinemaService.getAll();
    }

    @Override
    @GetMapping(value = "/getCinema", params = "id")
    public Cinema getById(@RequestParam String id) {
        return cinemaService.getById(id);
    }

    @Override
    @PostMapping(value = "/addCinema")
    public String save(@RequestBody Cinema c) {
        return cinemaService.save(c);
    }

    @Override
    @DeleteMapping(value = "/deleteCinema")
    public String delete(@RequestParam String id) {
        return cinemaService.delete(id);
    }

    @Override
    @PatchMapping(value = "/updateCinema")
    public String update(@RequestBody Cinema c) {
        return cinemaService.update(c);
    }
}
