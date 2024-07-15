package com.alessandrociaccio.ProjectDandD.features.character;

import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.Characteristic;
import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.Classe;
import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.Race;
import com.alessandrociaccio.ProjectDandD.features.character.objectProperties.Attack;
import com.alessandrociaccio.ProjectDandD.features.character.objectProperties.Details;
import com.alessandrociaccio.ProjectDandD.features.character.objectProperties.Training;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class CharacterServiceImpl implements CharacterService {

    private final CharacterMapper characterMapper;
    private final CharacterRepository characterRepository;

    @Override
    public ResponseEntity<?> createCharacter(CharacterDto characterDto) {
        CharacterDo characterDo = characterMapper.convertCharacterDtoToDo(characterDto);
        characterRepository.saveAndFlush(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> getCharacter(Long id) {
        CharacterDto characterDto = characterMapper.convertCharacterDoToDto(characterRepository.getReferenceById(id));
        return new ResponseEntity<>(characterDto, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateName(Long id, String name) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        characterDo.setName(name);
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateDetails(Long id, Details details) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        characterDo.setDetails(details);
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateClasse(Long id, Classe classe) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        characterDo.setClasse(classe);
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateRace(Long id, Race race) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        characterDo.setRace(race);
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateCharacteristicPoints(Long id, String characteristic, Integer points) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        try {
            characterDo.setCharacteristics(Map.of(Characteristic.valueOf(characteristic), points));
        } catch (IllegalArgumentException e) {
            return null;
        }
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateSkillPoints(Long id, String skill, Integer points) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        characterDo.setSkill(Map.of(skill, points));
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateMaxHp(Long id, Integer maxHp) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        characterDo.setMaxHp(maxHp);
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateCurrentHp(Long id, Integer currentHp) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        characterDo.setCurrentHp(currentHp);
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateDeathSaveFailures(Long id, Integer deathSaveFailures) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        characterDo.setDeathSaveFailures(deathSaveFailures);
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateSpeed(Long id, Integer speed) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        characterDo.setSpeed(speed);
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateExperience(Long id, Integer experience) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        characterDo.setExperience(experience);
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateTraining(Long id, Training training) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        characterDo.setTraining(training);
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateFate(Long id, Integer fate) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        characterDo.setFate(fate);
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateInspiration(Long id, Integer inspiration) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        characterDo.setInspiration(inspiration);
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateSpellCastingAbility(Long id, Integer spellCastingAbility) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        characterDo.setSpellCastingAbility(spellCastingAbility);
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateSpellSaveDc(Long id, Integer spellSaveDc) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        characterDo.setSpellSaveDc(spellSaveDc);
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateSpellAttackBonus(Long id, Integer spellAttackBonus) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        characterDo.setSpellAttackBonus(spellAttackBonus);
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateAction(Long id, String action, String type) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        characterDo.setActions(Map.of(action, type));
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> updateAttack(Long id, Attack attack) {
        CharacterDo characterDo = characterRepository.getReferenceById(id);
        characterDo.getAttacks().add(attack);
        characterRepository.save(characterDo);
        return new ResponseEntity<>(characterMapper.convertCharacterDoToDto(characterDo), HttpStatus.OK);
    }

    @Override
    public Boolean deleteCharacter(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<?> getAllCharacter() {
        return null;
    }


}
