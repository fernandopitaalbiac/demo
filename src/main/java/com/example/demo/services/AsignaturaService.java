package com.example.demo.services;


import com.example.demo.entities.AsignaturaEntity;
import java.util.List;

public interface AsignaturaService {
    List<AsignaturaEntity> getAll();
    AsignaturaEntity getById(Long id);
    AsignaturaEntity save(AsignaturaEntity asignatura);
    void delete(Long id);
}
