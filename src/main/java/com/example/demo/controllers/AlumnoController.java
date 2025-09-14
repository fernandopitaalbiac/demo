package com.example.demo.controllers;


import com.example.demo.entities.AlumnoEntity;
import com.example.demo.services.AlumnoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {

    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("alumnos", alumnoService.getAll());
        return "alumnos/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("alumno", new AlumnoEntity());
        return "alumnos/form";
    }

    @PostMapping
    public String guardar(@ModelAttribute AlumnoEntity alumno) {
        alumnoService.save(alumno);
        return "redirect:/alumnos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("alumno", alumnoService.getById(id));
        return "alumnos/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        alumnoService.delete(id);
        return "redirect:/alumnos";
    }
}
