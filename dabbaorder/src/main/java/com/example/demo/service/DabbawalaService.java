package com.example.demo.service;

import com.example.demo.exception.DabbawalaNotFoundException;
import com.example.demo.model.Dabbawala;

public interface DabbawalaService {
    String saveDabba(Dabbawala dabbawala);

    String updateDabba(Dabbawala dabbawala) throws DabbawalaNotFoundException;

    Dabbawala getDabba(Long dabbaId) throws DabbawalaNotFoundException;
}
