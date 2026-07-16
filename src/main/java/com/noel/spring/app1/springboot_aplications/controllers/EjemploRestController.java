package com.noel.spring.app1.springboot_aplications.controllers;
import java.util.Map;
import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EjemploRestController {

    @GetMapping("/detalles_info2")
    
    public Map<String, Object> detalles_info2(){
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Titulo", "Servidor en linea");
        respuesta.put("Servidor", "Bienvenido a la aplicacion de Spring Boot");
        respuesta.put("Ip", "192.168.1.1");

        return respuesta;
    }

}
