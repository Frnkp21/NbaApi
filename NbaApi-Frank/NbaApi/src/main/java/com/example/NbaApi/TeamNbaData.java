package com.example.NbaApi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record TeamNbaData(
        @JsonProperty("id") int id,
        @JsonProperty("abbreviation") String abbreviation,
        @JsonProperty("city") String city,
        @JsonProperty("conference") String conference,
        @JsonProperty("division") String division,
        @JsonProperty("full_name") String full_name,
        @JsonProperty("name") String name
) {}
