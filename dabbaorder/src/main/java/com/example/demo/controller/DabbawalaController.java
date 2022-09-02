package com.example.demo.controller;

import com.example.demo.exception.DabbawalaNotFoundException;
import com.example.demo.model.Dabbawala;
import com.example.demo.service.DabbawalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dabba")
public class DabbawalaController {

    @Autowired
    private DabbawalaService dabbawalaService;

    @PostMapping("/addDabba")
    public String saveDabba(@RequestBody Dabbawala dabbawala){
        return dabbawalaService.saveDabba(dabbawala);
    }

    @PutMapping("/updateDabba/{dabbaId}")
    public String updateDabba(@RequestBody Dabbawala dabbawala) throws DabbawalaNotFoundException{
        return dabbawalaService.updateDabba(dabbawala);
    }

    @GetMapping("/getDabba/{dabbaId}")
    public Dabbawala getDabba(@PathVariable("dabbaId") Long dabbaId) throws DabbawalaNotFoundException {
        return dabbawalaService.getDabba(dabbaId);
    }
}
