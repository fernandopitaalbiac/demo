package com.example.demo.services;



import com.example.demo.entities.ProfesorEntity;
import java.util.List;

public interface ProfesorService {
    List<ProfesorEntity> getAll();
    ProfesorEntity getById(Long id);
    ProfesorEntity save(ProfesorEntity profesor);
    void delete(Long id);
}
