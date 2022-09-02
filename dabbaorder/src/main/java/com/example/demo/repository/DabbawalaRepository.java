package com.example.demo.repository;

import com.example.demo.model.Dabbawala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DabbawalaRepository extends JpaRepository<Dabbawala, Long> {

}
