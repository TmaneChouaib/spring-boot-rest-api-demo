package com.tmane.restappdemo.service;


import com.tmane.restappdemo.entiy.Personnage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonnageService {
    Page<Personnage> findPaginated(int page, int pageSize);

    Page<Personnage> searchPersonnage(String query, Pageable pageable);

    List<Personnage> getAllPersonnages();

    Personnage savePersonnage(Personnage personnage);

    Personnage updatePersonnage(Personnage personnage);

    void deletePersonnageById(Long id);

    Personnage getPersonnageById(Long id);

    long count();
}