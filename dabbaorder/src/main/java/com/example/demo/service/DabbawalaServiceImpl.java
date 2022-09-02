package com.example.demo.service;

import com.example.demo.exception.DabbawalaNotFoundException;
import com.example.demo.model.Dabbawala;
import com.example.demo.repository.DabbawalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DabbawalaServiceImpl implements DabbawalaService{

    @Autowired
    private DabbawalaRepository dabbawalaRepository;

    @Override
    public String saveDabba(Dabbawala dabbawala) {
        dabbawalaRepository.save(dabbawala);
        return "Dabbawala has been saved Successfully";
    }

    @Override
    public String updateDabba(Dabbawala dabbawala) throws DabbawalaNotFoundException {
        Dabbawala dabba = dabbawalaRepository.findById(dabbawala.getDabbaId()).orElseThrow(()-> new DabbawalaNotFoundException());
        dabba.setDabbaType(dabbawala.getDabbaType());
        dabba.setAddress(dabbawala.getAddress());
        dabbawalaRepository.save(dabbawala);
        return "Successfully Updated Dabbawala";
    }

    @Override
    public Dabbawala getDabba(Long dabbaId) throws DabbawalaNotFoundException {
        Dabbawala dabba = dabbawalaRepository.findById(dabbaId).orElseThrow(()-> new DabbawalaNotFoundException());
        return dabba;
    }
}
