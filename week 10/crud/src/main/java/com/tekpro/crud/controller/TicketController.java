package com.tekpro.crud.controller;

import com.tekpro.crud.entity.Ticket;
import com.tekpro.crud.service.TicketService;
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
public class TicketController implements BaseController<Ticket, String> {

    @Autowired

    TicketService ticketService;

    @Override
    @GetMapping(value = "/ticket")
    public List<Ticket> getAll() {
        return ticketService.getAll();
    }

    @Override
    @GetMapping(value = "/ticket", params = "id")
    public Ticket getById(@RequestParam String id) {
        return ticketService.getById(id);
    }

    @Override
    @PostMapping(value = "/ticket")
    public String save(@RequestBody Ticket c) {
        return ticketService.save(c);
    }

    @Override
    @PostMapping(value = "/ticket", params = "type")
    public String saveMultiple(@RequestBody String s, @RequestParam String type) {
        if (type.equals("multi")) {
            return ticketService.saveMultiple(s);
        } else {
            return "Unknown param";
        }
    }

    @Override
    @DeleteMapping(value = "/ticket")
    public String delete(@RequestParam String id) {
        return ticketService.delete(id);
    }

    @Override
    @PatchMapping(value = "/ticket")
    public String update(@RequestBody Ticket c) {
        return ticketService.update(c);
    }

    @Override
    @PatchMapping(value = "/ticket", params = "type")
    public String updateMultiple(@RequestBody String s, @RequestParam String type) {
        if (type.equals("multi")) {
            return ticketService.updateMultiple(s);
        } else {
            return "Unknown param";
        }
    }
}
