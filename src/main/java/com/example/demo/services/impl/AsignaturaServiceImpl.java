package com.example.demo.services.impl;


import com.example.demo.entities.AsignaturaEntity;
import com.example.demo.repositories.AsignaturaRepository;
import com.example.demo.services.AsignaturaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturaServiceImpl implements AsignaturaService {

    private final AsignaturaRepository asignaturaRepository;

    public AsignaturaServiceImpl(AsignaturaRepository asignaturaRepository) {
        this.asignaturaRepository = asignaturaRepository;
    }

    @Override
    public List<AsignaturaEntity> getAll() {
        return asignaturaRepository.findAll();
    }

    @Override
    public AsignaturaEntity getById(Long id) {
        return asignaturaRepository.findById(id).orElse(null);
    }

    @Override
    public AsignaturaEntity save(AsignaturaEntity asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    @Override
    public void delete(Long id) {
        asignaturaRepository.deleteById(id);
    }
}