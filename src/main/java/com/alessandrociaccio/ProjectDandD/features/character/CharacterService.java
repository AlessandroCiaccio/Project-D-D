package com.alessandrociaccio.ProjectDandD.features.character;

import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.Classe;
import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.Race;
import com.alessandrociaccio.ProjectDandD.features.character.objectProperties.Action;
import com.alessandrociaccio.ProjectDandD.features.character.objectProperties.Attack;
import com.alessandrociaccio.ProjectDandD.features.character.objectProperties.Details;
import com.alessandrociaccio.ProjectDandD.features.character.objectProperties.Training;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface CharacterService {
    ResponseEntity<?> createCharacter(CharacterDto characterDto);

    ResponseEntity<?> getAllCharacter();

    ResponseEntity<?> getCharacter(Long id);

    ResponseEntity<?> updateName(Long id, String name);

    ResponseEntity<?> updateDetails(Long id, Details details);

    ResponseEntity<?> updateClasse(Long id, Classe classe);

    ResponseEntity<?> updateRace(Long id, Race race);

    ResponseEntity<?> updateCharacteristicPoints(Long id, String characteristic, Integer points);

    ResponseEntity<?> updateSkillPoints(Long id, String skill, Integer points);

    ResponseEntity<?> updateMaxHp(Long id, Integer maxHp);

    ResponseEntity<?> updateCurrentHp(Long id, Integer currentHp);

    ResponseEntity<?> updateDeathSaveFailures(Long id, Integer deathSaveFailures);

    ResponseEntity<?> updateSpeed(Long id, Integer speed);

    ResponseEntity<?> updateExperience(Long id, Integer experience);

    ResponseEntity<?> updateTraining(Long id, Training training);

    ResponseEntity<?> updateFate(Long id, Integer fate);

    ResponseEntity<?> updateInspiration(Long id, Integer inspiration);

    ResponseEntity<?> updateSpellCastingAbility(Long id, Integer spellCastingAbility);

    ResponseEntity<?> updateSpellSaveDc(Long id, Integer spellSaveDc);

    ResponseEntity<?> updateSpellAttackBonus(Long id, Integer spellAttackBonus);

    ResponseEntity<?> updateAction(Long id, Action action);

    ResponseEntity<?> updateAttack(Long id, Attack attack);

    Boolean deleteCharacter(Long id);


}
