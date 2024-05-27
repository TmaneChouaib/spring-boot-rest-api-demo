package com.tmane.restappdemo.mapper;

import com.tmane.restappdemo.dto.PersonnageDTO;
import com.tmane.restappdemo.entiy.Personnage;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonnageMapper {
    ModelMapper modelMapper = new ModelMapper();

    public PersonnageDTO mapToPersonnageDTO(Personnage personnage) {
        return modelMapper.map(personnage, PersonnageDTO.class);
    }

    public Personnage mapToPersonnage(PersonnageDTO personnageDTO) {
        return modelMapper.map(personnageDTO, Personnage.class);
    }

    public List<PersonnageDTO> mapToPersonnageDTOs(List<Personnage> personnages) {
        return personnages.stream().map(this::mapToPersonnageDTO).toList();
    }

    public List<Personnage> mapToPersonnages(List<PersonnageDTO> personnageDTOs) {
        return personnageDTOs.stream().map(this::mapToPersonnage).toList();
    }
}
