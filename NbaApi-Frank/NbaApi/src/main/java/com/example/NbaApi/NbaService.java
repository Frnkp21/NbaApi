package com.example.NbaApi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NbaService {

    private final String NBA_API_URL = "https://free-nba.p.rapidapi.com/teams";
    private final RestTemplate restTemplate;

    public NbaService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public NbaResponse getTeamsNba() {
        return restTemplate.getForObject(NBA_API_URL, NbaResponse.class);
    }
}