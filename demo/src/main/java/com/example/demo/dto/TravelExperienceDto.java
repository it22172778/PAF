package com.example.demo.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class TravelExperienceDto {
    private String title;
    private String location;
    private String description;
    private LocalDate dateVisited;
    private List<String> mediaUrls;
    private String culturalInsights;
}
