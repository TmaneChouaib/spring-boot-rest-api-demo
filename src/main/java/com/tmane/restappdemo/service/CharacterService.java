package com.tmane.restappdemo.service;


import com.tmane.restappdemo.dto.CharacterDTO;
import com.tmane.restappdemo.exeption.CharacterNoSuchElementException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CharacterService {
    List<CharacterDTO> findAll();
    Page<CharacterDTO> findPaginated(int pageNum, int pageSize);

    Page<CharacterDTO> searchCharacter(String query, Pageable pageable);

    CharacterDTO saveCharacter(CharacterDTO characterDTO);

    CharacterDTO updateCharacter(CharacterDTO characterDTO, Long id);

    void deleteCharacterById(Long id);

    CharacterDTO getCharacterById(Long id) throws CharacterNoSuchElementException;

    long count();
}
