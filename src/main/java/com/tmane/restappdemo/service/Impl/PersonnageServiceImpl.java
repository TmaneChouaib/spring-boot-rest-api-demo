package com.tmane.restappdemo.service.Impl;

import com.tmane.restappdemo.entiy.Personnage;
import com.tmane.restappdemo.repository.PersonnageRepository;
import com.tmane.restappdemo.service.PersonnageService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonnageServiceImpl implements PersonnageService {
    private PersonnageRepository personnageRepository;

    @Override
    public Page<Personnage> findPaginated(int pageNum, int pageSize) {
        Pageable pageable = PageRequest.of(pageNum - 1, pageSize);
        return personnageRepository.findAll(pageable);
    }

    @Override
    public Page<Personnage> searchPersonnage(String query, Pageable pageable) {
        return personnageRepository.findByFirstNameContaining(query, pageable);
    }

    @Override
    public List<Personnage> getAllPersonnages() {
        return personnageRepository.findAll();
    }

    @Override
    public Personnage savePersonnage(Personnage personnage) {
        return personnageRepository.save(personnage);
    }

    @Override
    public Personnage updatePersonnage(Personnage personnage) {
        return personnageRepository.save(personnage);
    }

    @Override
    public void deletePersonnageById(Long id) {
        personnageRepository.deleteById(id);
    }

    @Override
    public Personnage getPersonnageById(Long id) {
        return personnageRepository.findById(id).get();
    }

    @Override
    public long count() {
        return personnageRepository.count();
    }
}
