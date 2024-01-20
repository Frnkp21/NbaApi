package com.example.NbaApi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record NbaResponse(
        List<TeamInfo> data
) {}

@JsonIgnoreProperties(ignoreUnknown = true)
record TeamInfo(
        int id,
        String abbreviation,
        String city,
        String conference,
        String division,
        String full_name,
        String name
) {}


