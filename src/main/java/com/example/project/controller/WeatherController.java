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

    // Endpoint para obter o clima via GET
    @GetMapping
    public JsonNode getWeather(@RequestParam String city) {
        return weatherService.getWeatherData(city);
    }

    // Endpoint para enviar o nome da cidade via POST e obter o clima
    @PostMapping
    public JsonNode postWeather(@RequestBody String city) throws JsonProcessingException {
        // Exemplo do corpo JSON: {"city": "São Paulo"}
        JsonNode jsonNode = new ObjectMapper().readTree(city);
        String cityName = jsonNode.get("city").asText(); // Extraindo o nome da cidade
        return weatherService.getWeatherData(cityName);
    }

}
