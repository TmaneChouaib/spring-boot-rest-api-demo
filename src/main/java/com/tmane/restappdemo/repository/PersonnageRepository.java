package com.tmane.restappdemo.repository;

import com.tmane.restappdemo.entiy.Personnage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonnageRepository extends JpaRepository<Personnage, Long> {
}
