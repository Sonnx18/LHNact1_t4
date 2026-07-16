package com.noel.spring.app1.springboot_aplications.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    
    public String info(Model model){

        model.addAttribute("Titulo", "Servidor en linea");
        model.addAttribute("Servidor", "Bienvenido a la aplicacion de Spring Boot");
        model.addAttribute("Ip", "192.168.1.1");

        return "detalles_info";
    }

}
