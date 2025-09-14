package com.example.demo.services.impl;



import com.example.demo.entities.ProfesorEntity;
import com.example.demo.repositories.ProfesorRepository;
import com.example.demo.services.ProfesorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorServiceImpl implements ProfesorService {

    private final ProfesorRepository profesorRepository;

    public ProfesorServiceImpl(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    @Override
    public List<ProfesorEntity> getAll() {
        return profesorRepository.findAll();
    }

    @Override
    public ProfesorEntity getById(Long id) {
        return profesorRepository.findById(id).orElse(null);
    }

    @Override
    public ProfesorEntity save(ProfesorEntity profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public void delete(Long id) {
        profesorRepository.deleteById(id);
    }
}