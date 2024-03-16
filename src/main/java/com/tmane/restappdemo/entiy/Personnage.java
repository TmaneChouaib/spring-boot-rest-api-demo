package com.tmane.restappdemo.entiy;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personnage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
