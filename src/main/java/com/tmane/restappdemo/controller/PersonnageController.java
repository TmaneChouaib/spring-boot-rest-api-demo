package com.tmane.restappdemo.controller;

import com.tmane.restappdemo.dto.PersonnageDTO;
import com.tmane.restappdemo.service.PersonnageService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personnages")
@AllArgsConstructor
public class PersonnageController {
    private PersonnageService personnageService;
    private static final String DEFAULT_PAGE_NUMBER = "0";
    private static final String DEFAULT_PAGE_SIZE = "10";

    @GetMapping
    public Page<PersonnageDTO> getAllPersonnages(@RequestParam(defaultValue = "" + DEFAULT_PAGE_NUMBER) int page,
                                                 @RequestParam(defaultValue = "" + DEFAULT_PAGE_SIZE) int size) {
        return personnageService.findPaginated(page, size);
    }

    @GetMapping("/search")
    public Page<PersonnageDTO> searchPersonnages(@RequestParam(defaultValue = "") String keyword,
                                                @RequestParam(defaultValue = "" + DEFAULT_PAGE_NUMBER) int page,
                                                @RequestParam(defaultValue = "" + DEFAULT_PAGE_SIZE) int size) {
        Pageable pageable = PageRequest.of(page, size);
        return personnageService.searchPersonnage(keyword, pageable);
    }

    @GetMapping("/{id}")
    public PersonnageDTO getPersonnageById(@PathVariable("id") Long id) {
        return personnageService.getPersonnageById(id);
    }

    @PostMapping
    public PersonnageDTO savePersonnage(@RequestBody PersonnageDTO personnageDTO) {
        return personnageService.savePersonnage(personnageDTO);
    }

    @PutMapping("/{id}")
    public PersonnageDTO updatePersonnage(@RequestBody PersonnageDTO personnageDTO, @PathVariable("id") Long id) {

        return personnageService.updatePersonnage(personnageDTO, id);
    }

    @DeleteMapping("/{id}")
    public void deletePersonnage(@PathVariable("id") Long id) {
        personnageService.deletePersonnageById(id);
    }

}
