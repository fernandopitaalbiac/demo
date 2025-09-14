package com.example.demo.services.impl;


import com.example.demo.entities.AlumnoEntity;
import com.example.demo.repositories.AlumnoRepository;
import com.example.demo.services.AlumnoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    private final AlumnoRepository alumnoRepository;

    public AlumnoServiceImpl(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

    @Override
    public List<AlumnoEntity> getAll() {
        return alumnoRepository.findAll();
    }

    @Override
    public AlumnoEntity getById(Long id) {
        return alumnoRepository.findById(id).orElse(null);
    }

    @Override
    public AlumnoEntity save(AlumnoEntity alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public void delete(Long id) {
        alumnoRepository.deleteById(id);
    }
}
