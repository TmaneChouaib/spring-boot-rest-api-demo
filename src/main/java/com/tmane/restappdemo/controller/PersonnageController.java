package com.tmane.restappdemo.controller;

import com.tmane.restappdemo.entiy.Personnage;
import com.tmane.restappdemo.service.PersonnageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personages")
@AllArgsConstructor
public class PersonnageController {
    private PersonnageService personnageService;

    @GetMapping
    public List<Personnage> getAllPersonages() {
        return personnageService.getAllPersonnages();
    }
}
