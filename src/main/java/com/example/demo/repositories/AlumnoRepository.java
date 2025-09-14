package com.example.demo.repositories;


import com.example.demo.entities.AlumnoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<AlumnoEntity, Long> {}
