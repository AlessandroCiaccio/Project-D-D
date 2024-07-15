package com.alessandrociaccio.ProjectDandD.features.character;

import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.Characteristic;
import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.Classe;
import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.Race;
import com.alessandrociaccio.ProjectDandD.features.character.objectProperties.Attack;
import com.alessandrociaccio.ProjectDandD.features.character.objectProperties.Details;
import com.alessandrociaccio.ProjectDandD.features.character.objectProperties.Training;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/v1/character")
public class CharacterController {
    private final CharacterServiceImpl characterService;

    @PostMapping(path = "/create")
    public ResponseEntity<?> createCharacter(@RequestBody CharacterDto characterDto) {
        return characterService.createCharacter(characterDto);
    }

    @GetMapping()
    public ResponseEntity<?> getAllCharacter() {
        return characterService.getAllCharacter();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getCharacter(@PathVariable Long id) {
        return characterService.getCharacter(id);
    }

    @PatchMapping(path = "/{id}/name")
    public ResponseEntity<?> updateName(@PathVariable Long id, @RequestParam String name) {
        return characterService.updateName(id, name);
    }

    @PatchMapping(path = "/{id}/details")
    public ResponseEntity<?> updateDetails(@PathVariable Long id, @RequestBody Details details) {
        return characterService.updateDetails(id, details);
    }

    @PatchMapping(path = "/{id}/class")
    public ResponseEntity<?> updateClasse(@PathVariable Long id, @RequestParam Classe classe) {
        return characterService.updateClasse(id, classe);
    }

    @PatchMapping(path = "/{id}/race")
    public ResponseEntity<?> updateRace(@PathVariable Long id, @RequestParam Race race) {
        return characterService.updateRace(id, race);
    }

    @PatchMapping(path = "/{id}/characteristic")
    public ResponseEntity<?> updateCharacteristicPoints(@PathVariable Long id, @RequestParam String characteristic, @RequestParam Integer points) {
        return characterService.updateCharacteristicPoints(id, characteristic, points);
    }

    @PatchMapping(path = "/{id}/skill")
    public ResponseEntity<?> updateSkillsPoints(@PathVariable Long id, @RequestParam String skill, @RequestParam Integer points) {
        return characterService.updateSkillPoints(id, skill, points);
    }

    @PatchMapping(path = "/{id}/maxhp")
    public ResponseEntity<?> updateMaxHp(@PathVariable Long id, @RequestParam Integer maxHp) {
        return characterService.updateMaxHp(id, maxHp);
    }

    @PatchMapping(path = "/{id}/currenthp")
    public ResponseEntity<?> updateCurrentHp(@PathVariable Long id, @RequestParam Integer CurrentHp) {
        return characterService.updateCurrentHp(id, CurrentHp);
    }

    @PatchMapping(path = "/{id}/deathSaveFailures")
    public ResponseEntity<?> updateDeathSaveFailures(@PathVariable Long id, @RequestParam Integer deathSaveFailures) {
        return characterService.updateDeathSaveFailures(id, deathSaveFailures);
    }

    @PatchMapping(path = "/{id}/speed")
    public ResponseEntity<?> updateSpeed(@PathVariable Long id, @RequestParam Integer speed) {
        return characterService.updateSpeed(id, speed);
    }

    @PatchMapping(path = "/{id}/experience")
    public ResponseEntity<?> updateExperience(@PathVariable Long id, @RequestParam Integer experience) {
        return characterService.updateExperience(id, experience);
    }

    @PatchMapping(path = "/{id}/training")
    public ResponseEntity<?> updateTraining(@PathVariable Long id, @RequestParam Training training) {
        return characterService.updateTraining(id, training);
    }

    @PatchMapping(path = "/{id}/fate")
    public ResponseEntity<?> updateFate(@PathVariable Long id, @RequestParam Integer fate) {
        return characterService.updateFate(id, fate);
    }

    @PatchMapping(path = "/{id}/inspiration")
    public ResponseEntity<?> updateInspiration(@PathVariable Long id, @RequestParam Integer inspiration) {
        return characterService.updateInspiration(id, inspiration);
    }

    @PatchMapping(path = "/{id}/spellCastingAbility")
    public ResponseEntity<?> updateSpellCastingAbility(@PathVariable Long id, @RequestParam Integer spellCastingAbility) {
        return characterService.updateSpellCastingAbility(id, spellCastingAbility);
    }

    @PatchMapping(path = "/{id}/spellSaveDc")
    public ResponseEntity<?> updateSpellSaveDc(@PathVariable Long id, @RequestParam Integer spellSaveDc) {
        return characterService.updateSpellSaveDc(id, spellSaveDc);
    }

    @PatchMapping(path = "/{id}/spellAttackBonus")
    public ResponseEntity<?> updateSpellAttackBonus(@PathVariable Long id, @RequestParam Integer spellAttackBonus) {
        return characterService.updateSpellAttackBonus(id, spellAttackBonus);
    }

    @PatchMapping(path = "/{id}/action")
    public ResponseEntity<?> updateActions(@PathVariable Long id, @RequestParam String action, @RequestParam String type) {
        return characterService.updateAction(id, action, type);
    }

    @PatchMapping(path = "/{id}/name")
    public ResponseEntity<?> updateAttack(@PathVariable Long id, @RequestBody Attack attack) {
        return characterService.updateAttack(id, attack);
    }
//
//    @PatchMapping(path = "/{id}/name")
//    public ResponseEntity<?> updateName(@PathVariable Long id, @RequestParam String name) {
//        return characterService.updateName(id, name);
//    }
//
//    @PatchMapping(path = "/{id}/name")
//    public ResponseEntity<?> updateName(@PathVariable Long id, @RequestParam String name) {
//        return characterService.updateName(id, name);
//    }
//
//    @PatchMapping(path = "/{id}/name")
//    public ResponseEntity<?> updateName(@PathVariable Long id, @RequestParam String name) {
//        return characterService.updateName(id, name);
//    }
//
//    @PatchMapping(path = "/{id}/name")
//    public ResponseEntity<?> updateName(@PathVariable Long id, @RequestParam String name) {
//        return characterService.updateName(id, name);
//    }
//
//    @PatchMapping(path = "/{id}/name")
//    public ResponseEntity<?> updateName(@PathVariable Long id, @RequestParam String name) {
//        return characterService.updateName(id, name);
//    }
//
//    @PatchMapping(path = "/{id}/name")
//    public ResponseEntity<?> updateName(@PathVariable Long id, @RequestParam String name) {
//        return characterService.updateName(id, name);
//    }
//
//    @PatchMapping(path = "/{id}/name")
//    public ResponseEntity<?> updateName(@PathVariable Long id, @RequestParam String name) {
//        return characterService.updateName(id, name);
//    }
//
//    @PatchMapping(path = "/{id}/name")
//    public ResponseEntity<?> updateName(@PathVariable Long id, @RequestParam String name) {
//        return characterService.updateName(id, name);
//    }

    @DeleteMapping(path = "/{id}")
    public Boolean deleteCharacter(@PathVariable Long id) {
        return characterService.deleteCharacter(id);
    }

}
