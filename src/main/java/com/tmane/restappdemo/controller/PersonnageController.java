package com.tmane.restappdemo.controller;

import com.tmane.restappdemo.entiy.Personnage;
import com.tmane.restappdemo.service.PersonnageService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personages")
@AllArgsConstructor
public class PersonnageController {
    private PersonnageService personnageService;

    @GetMapping
    public List<Personnage> getAllPersonnages() {
        return personnageService.getAllPersonnages();
    }

    @GetMapping("/pages")
    public Page<Personnage> getAllPaginatedPersonnages(@RequestParam(defaultValue = "0") int page,
                                                       @RequestParam(defaultValue = "10") int size) {
        return personnageService.findPaginated(page, size);
    }

    @PostMapping
    public Personnage savePersonnage(@RequestBody Personnage personnage) {
        return personnageService.savePersonnage(personnage);
    }

    @PutMapping("/{id}")
    public Personnage updatePersonnage(@RequestBody Personnage personnage, @PathVariable("id") Long id) {

        Personnage personnageData = personnageService.getPersonnageById(id);

        personnageData.setFirstName(personnage.getFirstName());
        personnageData.setLastName(personnage.getLastName());
        personnageData.setBirthDate(personnage.getBirthDate());
        personnageData.setDeceaseDate(personnage.getDeceaseDate());
        personnageData.setNationality(personnage.getNationality());
        personnageData.setOccupation(personnage.getOccupation());
        personnageData.setReligion(personnage.getReligion());
        personnageData.setContribution(personnage.getContribution());
        personnageData.setQuotes(personnage.getQuotes());
        personnageData.setBiographie(personnage.getBiographie());

        return personnageService.updatePersonnage(personnageData);
    }

    @DeleteMapping("/{id}")
    public void deletePersonnage(@PathVariable("id") Long id) {
        personnageService.deletePersonnageById(id);
    }

    @GetMapping("/{id}")
    public Personnage getPersonnageById(@PathVariable("id") Long id) {
        return personnageService.getPersonnageById(id);
    }
}
