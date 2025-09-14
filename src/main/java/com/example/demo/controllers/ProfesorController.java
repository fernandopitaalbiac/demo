package com.example.demo.controllers;


import com.example.demo.entities.ProfesorEntity;
import com.example.demo.services.ProfesorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/profesores")
public class ProfesorController {

    private final ProfesorService profesorService;

    public ProfesorController(ProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("profesores", profesorService.getAll());
        return "profesores/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("profesor", new ProfesorEntity());
        return "profesores/form";
    }

    @PostMapping
    public String guardar(@ModelAttribute ProfesorEntity profesor) {
        profesorService.save(profesor);
        return "redirect:/profesores";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("profesor", profesorService.getById(id));
        return "profesores/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        profesorService.delete(id);
        return "redirect:/profesores";
    }
}