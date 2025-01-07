package com.tmane.restappdemo.mapper;

import com.tmane.restappdemo.dto.CharacterDTO;
import com.tmane.restappdemo.entiy.Character;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CharacterMapper {
    ModelMapper modelMapper = new ModelMapper();

    public CharacterDTO mapToCharacterDTO(Character character) {
        return modelMapper.map(character, CharacterDTO.class);
    }

    public Character mapToCharacter(CharacterDTO characterDTO) {
        return modelMapper.map(characterDTO, Character.class);
    }

    public List<CharacterDTO> mapToCharacterDTOs(List<Character> characters) {
        return characters.stream().map(this::mapToCharacterDTO).toList();
    }

    public List<Character> mapToCharacters(List<CharacterDTO> characterDTOS) {
        return characterDTOS.stream().map(this::mapToCharacter).toList();
    }
}
