package com.tmane.restappdemo.repository;

import com.tmane.restappdemo.entiy.Personnage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonnageRepository extends JpaRepository<Personnage, Long> {
    Page<Personnage> findByNameContaining(String query, Pageable pageable);
}
