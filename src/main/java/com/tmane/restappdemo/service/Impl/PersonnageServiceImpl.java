package com.tmane.restappdemo.service.Impl;

import com.tmane.restappdemo.dto.PersonnageDTO;
import com.tmane.restappdemo.entiy.Personnage;
import com.tmane.restappdemo.exeption.PersonnageNoSuchElementException;
import com.tmane.restappdemo.mapper.PersonnageMapper;
import com.tmane.restappdemo.repository.PersonnageRepository;
import com.tmane.restappdemo.service.PersonnageService;
import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class PersonnageServiceImpl implements PersonnageService {
    private MessageSource messageSource;
    private PersonnageRepository personnageRepository;
    private PersonnageMapper personnageMapper;

    @Override
    public Page<PersonnageDTO> findPaginated(int pageNum, int pageSize) {
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        Page<Personnage> page = personnageRepository.findAll(pageable);
        return page.map(personnageMapper::mapToPersonnageDTO);
    }

    @Override
    public Page<PersonnageDTO> searchPersonnage(String query, Pageable pageable) {

        Page<Personnage> page = personnageRepository.findByFirstNameContaining(query, pageable);
        return page.map(personnageMapper::mapToPersonnageDTO);
    }

    @Override
    public PersonnageDTO savePersonnage(PersonnageDTO personnageDTO) {

        Personnage personnage = personnageMapper.mapToPersonnage(personnageDTO);
        personnageRepository.save(personnage);

        return personnageMapper.mapToPersonnageDTO(personnage);
    }

    @Override
    public PersonnageDTO updatePersonnage(PersonnageDTO personnageDTO, Long id) {
        Personnage personnageData = personnageRepository.findById(id).get();

        personnageData.setFirstName(personnageDTO.getFirstName());
        personnageData.setLastName(personnageDTO.getLastName());
        personnageData.setBirthDate(personnageDTO.getBirthDate());
        personnageData.setDeceaseDate(personnageDTO.getDeceaseDate());
        personnageData.setNationality(personnageDTO.getNationality());
        personnageData.setOccupation(personnageDTO.getOccupation());
        personnageData.setReligion(personnageDTO.getReligion());
        personnageData.setContribution(personnageDTO.getContribution());
        personnageData.setQuotes(personnageDTO.getQuotes());
        personnageData.setBiographie(personnageDTO.getBiographie());

        personnageRepository.save(personnageData);

        return personnageMapper.mapToPersonnageDTO(personnageData);
    }

    @Override
    public void deletePersonnageById(Long id) {
        personnageRepository.deleteById(id);
    }

    @Override
    public PersonnageDTO getPersonnageById(Long id) {
        try {
            Personnage personnage = personnageRepository.findById(id).get();
            return personnageMapper.mapToPersonnageDTO(personnage);
        } catch (NoSuchElementException e) {
            String message = messageSource.getMessage("personnage.notfound", new Object[]{id}, Locale.getDefault());
            throw new PersonnageNoSuchElementException(message, id);
        }
    }

    @Override
    public long count() {
        return personnageRepository.count();
    }
}
