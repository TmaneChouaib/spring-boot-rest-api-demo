package com.tmane.restappdemo.controller;

import com.tmane.restappdemo.dto.CharacterDTO;
import com.tmane.restappdemo.service.CharacterService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/characters")
@AllArgsConstructor
public class CharacterController {
    private CharacterService characterService;
    private static final String DEFAULT_PAGE_NUMBER = "0";
    private static final String DEFAULT_PAGE_SIZE = "10";

    @GetMapping("/all")
    public List<CharacterDTO> getAllCharacters() {
        return characterService.findAll();
    }

    @GetMapping
    public Page<CharacterDTO> getAllPaginated(@RequestParam(defaultValue = "" + DEFAULT_PAGE_NUMBER) int page,
                                              @RequestParam(defaultValue = "" + DEFAULT_PAGE_SIZE) int size) {
        return characterService.findPaginated(page, size);
    }

    @GetMapping("/search")
    public Page<CharacterDTO> searchCharacter(@RequestParam(defaultValue = "") String keyword,
                                               @RequestParam(defaultValue = "" + DEFAULT_PAGE_NUMBER) int page,
                                               @RequestParam(defaultValue = "" + DEFAULT_PAGE_SIZE) int size) {
        Pageable pageable = PageRequest.of(page, size);
        return characterService.searchCharacter(keyword, pageable);
    }

    @GetMapping("/{id}")
    public CharacterDTO getCharacterById(@PathVariable("id") Long id) {
        return characterService.getCharacterById(id);
    }

    @PostMapping
    public CharacterDTO saveCharacter(@RequestBody CharacterDTO characterDTO) {
        return characterService.saveCharacter(characterDTO);
    }

    @PutMapping("/{id}")
    public CharacterDTO updateCharacter(@RequestBody CharacterDTO characterDTO, @PathVariable("id") Long id) {

        return characterService.updateCharacter(characterDTO, id);
    }

    @DeleteMapping("/{id}")
    public void deleteCharacter(@PathVariable("id") Long id) {
        characterService.deleteCharacterById(id);
    }

    @GetMapping("/count")
    public long count() {
        return characterService.count();
    }
}
