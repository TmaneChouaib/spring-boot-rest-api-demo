package com.tmane.restappdemo.mapper;

import com.tmane.restappdemo.dto.PersonnageDTO;
import com.tmane.restappdemo.entiy.Personnage;
import org.springframework.stereotype.Component;

@Component
public class PersonnageMapper {

    public PersonnageDTO mapToPersonnageDTO(Personnage personnage) {
        PersonnageDTO personnageDTO = new PersonnageDTO();
        personnageDTO.setId(personnage.getId());
        personnageDTO.setFirstName(personnage.getFirstName());
        personnageDTO.setLastName(personnage.getLastName());
        personnageDTO.setBirthDate(personnage.getBirthDate());
        personnageDTO.setDeceaseDate(personnage.getDeceaseDate());
        personnageDTO.setNationality(personnage.getNationality());
        personnageDTO.setOccupation(personnage.getOccupation());
        personnageDTO.setReligion(personnage.getReligion());
        personnageDTO.setContribution(personnage.getContribution());
        personnageDTO.setQuotes(personnage.getQuotes());
        personnageDTO.setBiographie(personnage.getBiographie());

        return personnageDTO;
    }

    public Personnage mapToPersonnage(PersonnageDTO personnageDTO) {
        Personnage personnage = new Personnage();

        personnage.setFirstName(personnageDTO.getFirstName());
        personnage.setLastName(personnageDTO.getLastName());
        personnage.setBirthDate(personnageDTO.getBirthDate());
        personnage.setDeceaseDate(personnageDTO.getDeceaseDate());
        personnage.setNationality(personnageDTO.getNationality());
        personnage.setOccupation(personnageDTO.getOccupation());
        personnage.setReligion(personnageDTO.getReligion());
        personnage.setContribution(personnageDTO.getContribution());
        personnage.setQuotes(personnageDTO.getQuotes());
        personnage.setBiographie(personnageDTO.getBiographie());

        return personnage;
    }

}
