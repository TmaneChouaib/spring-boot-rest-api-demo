package com.tmane.restappdemo.service.Impl;

import com.tmane.restappdemo.dto.CharacterDTO;
import com.tmane.restappdemo.entiy.Character;
import com.tmane.restappdemo.exeption.CharacterNoSuchElementException;
import com.tmane.restappdemo.mapper.CharacterMapper;
import com.tmane.restappdemo.repository.CharacterRepository;
import com.tmane.restappdemo.service.CharacterService;
import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class CharacterServiceImpl implements CharacterService {
    private MessageSource messageSource;
    private CharacterRepository characterRepository;
    private CharacterMapper characterMapper;

    @Override
    public List<CharacterDTO> findAll() {
        return characterMapper.mapToCharacterDTOs(characterRepository.findAll());
    }

    @Override
    public Page<CharacterDTO> findPaginated(int pageNum, int pageSize) {
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        Page<Character> page = characterRepository.findAll(pageable);
        return page.map(characterMapper::mapToCharacterDTO);
    }

    @Override
    public Page<CharacterDTO> searchCharacter(String query, Pageable pageable) {

        Page<Character> page = characterRepository.findByFirstNameContaining(query, pageable);
        return page.map(characterMapper::mapToCharacterDTO);
    }

    @Override
    public CharacterDTO saveCharacter(CharacterDTO characterDTO) {

        Character character = characterMapper.mapToCharacter(characterDTO);
        characterRepository.save(character);

        return characterMapper.mapToCharacterDTO(character);
    }

    @Override
    public CharacterDTO updateCharacter(CharacterDTO characterDTO, Long id) {
        Character characterData = characterRepository.findById(id).get();

        characterData.setFirstName(characterDTO.getFirstName());
        characterData.setLastName(characterDTO.getLastName());
        characterData.setBirthDate(characterDTO.getBirthDate());
        characterData.setDeceaseDate(characterDTO.getDeceaseDate());
        characterData.setNationality(characterDTO.getNationality());
        characterData.setOccupation(characterDTO.getOccupation());
        characterData.setReligion(characterDTO.getReligion());
        characterData.setContribution(characterDTO.getContribution());
        characterData.setQuotes(characterDTO.getQuotes());
        characterData.setBiographie(characterDTO.getBiographie());

        characterRepository.save(characterData);

        return characterMapper.mapToCharacterDTO(characterData);
    }

    @Override
    public void deleteCharacterById(Long id) {
        characterRepository.deleteById(id);
    }

    @Override
    public CharacterDTO getCharacterById(Long id) {
        try {
            Character character = characterRepository.findById(id).get();
            return characterMapper.mapToCharacterDTO(character);
        } catch (NoSuchElementException e) {
            String message = messageSource.getMessage("character.notfound", new Object[]{id}, Locale.getDefault());
            throw new CharacterNoSuchElementException(message, id);
        }
    }

    @Override
    public long count() {
        return characterRepository.count();
    }
}
