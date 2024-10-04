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
        aboutInfo.put("estudante", "Taylor Vargas Teixeira");
        aboutInfo.put("projeto", "Weather API");
        return aboutInfo;
    }
}
