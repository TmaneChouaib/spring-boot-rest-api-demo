package com.tmane.restappdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonnageResponseDTO {
    private Long Id;
    private String firstName;
    private String LastName;
    private LocalDate birthDate;
    private LocalDate deceaseDate;
    private String nationality;
    private String occupation;
    private String religion;
    private String contribution;
    private String quotes;
    private String biographie;
}
