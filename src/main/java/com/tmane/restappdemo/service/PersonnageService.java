package com.tmane.restappdemo.service;


import com.tmane.restappdemo.dto.PersonnageDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonnageService {
    Page<PersonnageDTO> findPaginated(int pageNum, int pageSize);

    Page<PersonnageDTO> searchPersonnage(String query, Pageable pageable);

    List<PersonnageDTO> getAllPersonnages();

    PersonnageDTO savePersonnage(PersonnageDTO personnageDTO);

    PersonnageDTO updatePersonnage(PersonnageDTO personnageDTO, Long id);

    void deletePersonnageById(Long id);

    PersonnageDTO getPersonnageById(Long id);

    long count();
}
