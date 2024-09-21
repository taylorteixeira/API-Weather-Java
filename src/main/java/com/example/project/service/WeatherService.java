package com.example.project.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import com.fasterxml.jackson.databind.JsonNode;

@Service
public class WeatherService {

    private static final String API_KEY = "38cb59894405041082288956a35f24e8";
    private static final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric";

    public JsonNode getWeatherData(String city) {
        String url = String.format(BASE_URL, city, API_KEY);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<JsonNode> response = restTemplate.getForEntity(url, JsonNode.class);
        return response.getBody();
    }
}
