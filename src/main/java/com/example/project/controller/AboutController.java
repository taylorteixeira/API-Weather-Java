package com.example.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/sobre")
public class AboutController {

    // Endpoint que retorna informações sobre o projeto
    @GetMapping
    public HashMap<String, String> getAboutInfo() {
        HashMap<String, String> aboutInfo = new HashMap<>();
        aboutInfo.put("projeto", "Clima");
        aboutInfo.put("descricao", "Este projeto fornece informações sobre o clima em várias cidades.");
        aboutInfo.put("tecnologias", "Java, Spring Boot, API externa para dados de clima.");
        aboutInfo.put("versao", "1.0.0");
        return aboutInfo;
    }
}
