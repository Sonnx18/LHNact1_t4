package com.noel.spring.app1.springboot_aplications.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

@RestController
public class TareaRestController {

    // Endpoint A: Identificación 
    @GetMapping("/identificacion")
    public Map<String, String> obtenerIdentificacion() {
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("proyecto", "YIN soluciones");
        respuesta.put("alumno", "Noel López Herrera"); 
        respuesta.put("iniciales", "NLH"); 
        return respuesta;
    }

    // Endpoint B: Información o lista simulada 
    @GetMapping("/mis_datos")
    public Map<String, Object> obtenerDatosPersonales() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("nombre", "Noel");
        respuesta.put("materia", "Programación Web");
        respuesta.put("materias_cursando", Arrays.asList("Conmutación y Enrutamiento de Redes", "Programación Web"));
        return respuesta;
    }
}