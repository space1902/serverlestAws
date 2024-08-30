package com.enlace.hijo.controller;


import com.enlace.layer.models.Persona;
import com.enlace.layer.services.Suma;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PruebController {

    @GetMapping(path = "/algo", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> ping() {
        Map<String, String> pong = new HashMap<>();
        Persona persona = new Persona();
        persona.setNombre("Victor");
        persona.setApellido("Ortiz");

        Suma suma = new Suma();

        System.out.println("Arranco la lambda y llamo a " + persona + " y su sueldo es: " + suma.calculaValor());
        pong.put("Arranco la lambda y llamo a " + persona, " y su sueldo es: " + suma.calculaValor());
        return pong;
    }
}
