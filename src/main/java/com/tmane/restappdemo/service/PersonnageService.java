package com.tmane.restappdemo.service;


import com.tmane.restappdemo.dto.PersonnageDTO;
import com.tmane.restappdemo.exeption.PersonnageNoSuchElementException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonnageService {
    List<PersonnageDTO> findAll();
    Page<PersonnageDTO> findPaginated(int pageNum, int pageSize);

    Page<PersonnageDTO> searchPersonnage(String query, Pageable pageable);

    PersonnageDTO savePersonnage(PersonnageDTO personnageDTO);

    PersonnageDTO updatePersonnage(PersonnageDTO personnageDTO, Long id);

    void deletePersonnageById(Long id);

    PersonnageDTO getPersonnageById(Long id) throws PersonnageNoSuchElementException;

    long count();
}
