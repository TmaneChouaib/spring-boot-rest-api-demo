package com.tmane.restappdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CharacterDTO {
    private Long id;
    private String firstName;
    private String LastName;
    private LocalDate birthDate;
    private LocalDate deceaseDate;
    private String nationality;
    private String occupation;
    private String religion;
    private String contribution;
    private String quotes;
    private String biography;
}

