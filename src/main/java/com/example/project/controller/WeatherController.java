package com.example.project.controller;

import com.example.project.service.WeatherService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.databind.JsonNode;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping
    public JsonNode getWeather(@RequestParam String city) {
        return weatherService.getWeatherData(city);
    }

    @PostMapping
    public JsonNode postWeather(@RequestBody String city) throws JsonProcessingException {
        // Exemplo: {"city": "São Paulo"}

        JsonNode jsonNode = new ObjectMapper().readTree(city);
        String cityName = jsonNode.get("city").asText(); // Extraindo o nome da cidade

        return weatherService.getWeatherData(cityName);
    }

    @GetMapping("/sobre")
    public HashMap<String, String> sobre(){
        
    HashMap<String, String> sobre = new HashMap<>();
        sobre.put("projeto", "Clima")
        return sobre;

    }
}
