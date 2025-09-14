package com.example.demo.controllers;


import com.example.demo.entities.AsignaturaEntity;
import com.example.demo.entities.ProfesorEntity;
import com.example.demo.services.AsignaturaService;
import com.example.demo.services.ProfesorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/asignaturas")
public class AsignaturaController {

    private final AsignaturaService asignaturaService;
    private final ProfesorService profesorService;

    public AsignaturaController(AsignaturaService asignaturaService, ProfesorService profesorService) {
        this.asignaturaService = asignaturaService;
        this.profesorService = profesorService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("asignaturas", asignaturaService.getAll());
        return "asignaturas/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("asignatura", new AsignaturaEntity());
        model.addAttribute("profesores", profesorService.getAll());
        return "asignaturas/form";
    }

    @PostMapping
    public String guardar(@ModelAttribute AsignaturaEntity asignatura,
                          @RequestParam(required = false) Boolean usarComoEspecialidad2) {

        if (usarComoEspecialidad2 != null && usarComoEspecialidad2 && asignatura.getProfesor() != null) {
            // Obtener el profesor completo de la base de datos para mantener sus datos
            ProfesorEntity profesorExistente = profesorService.getById(asignatura.getProfesor().getId());
            if (profesorExistente != null) {
                profesorExistente.setEspecialidad2(asignatura.getNombre());
                profesorService.save(profesorExistente);
            }
        }

        asignaturaService.save(asignatura);
        return "redirect:/asignaturas";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("asignatura", asignaturaService.getById(id));
        model.addAttribute("profesores", profesorService.getAll()); // Añadir esta línea
        return "asignaturas/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        asignaturaService.delete(id);
        return "redirect:/asignaturas";
    }
}