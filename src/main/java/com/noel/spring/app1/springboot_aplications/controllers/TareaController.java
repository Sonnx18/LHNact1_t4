package com.noel.spring.app1.springboot_aplications.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TareaController {

    // Endpoint C: Vista HTML con Thymeleaf
    @GetMapping("/tarea_vista")
    public String verVistaTarea(Model model) {
        model.addAttribute("Titulo", "Actividad1. Introducción a Spring Boot");
        model.addAttribute("Nombre", "Noel López Herrera");
        model.addAttribute("Grupo", "7SC");
        model.addAttribute("Descripcion","Este es el tercer EndPoint");
        
        return "detalles_tarea"; 
    }
}