package com.example.demo.services;



import com.example.demo.entities.AlumnoEntity;
import java.util.List;

public interface AlumnoService {
    List<AlumnoEntity> getAll();
    AlumnoEntity getById(Long id);
    AlumnoEntity save(AlumnoEntity alumno);
    void delete(Long id);
}
