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

    @GetMapping
    public List<PersonnageDTO> getAllPersonnages() {
        return personnageService.getAllPersonnages();
    }

    @GetMapping("/pages")
    public Page<PersonnageDTO> getAllPaginatedPersonnages(@RequestParam(defaultValue = "0") int page,
                                                                  @RequestParam(defaultValue = "10") int size) {
        return personnageService.findPaginated(page, size);
    }

    @GetMapping("/search")
    public Page<PersonnageDTO> searchPersonages(@RequestParam(defaultValue = "0") String keyword,
                                                        @RequestParam(defaultValue = "0") int page,
                                                        @RequestParam(defaultValue = "10") int size) {
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
