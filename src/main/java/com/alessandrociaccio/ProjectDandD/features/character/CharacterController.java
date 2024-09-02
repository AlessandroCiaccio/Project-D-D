package com.alessandrociaccio.ProjectDandD.features.character;

import ch.qos.logback.core.joran.action.ActionUtil;
import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.Classe;
import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.Dice;
import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.Race;
import com.alessandrociaccio.ProjectDandD.features.character.objectProperties.*;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

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
    public ResponseEntity<?> updateDetails(@PathVariable Long id,
                                           @RequestParam(required = false) Integer age,
                                           @RequestParam(required = false) Float height,
                                           @RequestParam(required = false) Float weight,
                                           @RequestParam(required = false) String distinguishingFeature,
                                           @RequestParam(required = false) String motivation,
                                           @RequestParam(required = false) String habit) {
        Details details = getDetails(age, height, weight, distinguishingFeature, motivation, habit);
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
    public ResponseEntity<?> updateTraining(@PathVariable Long id,
                                            @RequestParam String skillToLearn,
                                            @RequestParam Integer percentage) {
        Training training = setTraining(skillToLearn, percentage);
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
    public ResponseEntity<?> updateActions(@PathVariable Long id,
                                           @RequestParam String actionToAdd,
                                           @RequestParam String type) {
        Action action = new Action();
        action.setAction(actionToAdd);
        action.setType(type);
        return characterService.updateAction(id, action);
    }

    @PatchMapping(path = "/{id}/attack")
    public ResponseEntity<?> updateAttack(@PathVariable Long id,
                                          @RequestParam String name,
                                          @RequestParam Integer toHit,
                                          @RequestParam Integer numberOfDiceToThrow,
                                          @RequestParam Dice dice,
                                          @RequestParam String type) {
        Attack attack = getAttack(name, toHit, numberOfDiceToThrow, dice, type);
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

    private Details getDetails(Integer age, Float height, Float weight, String distinguishingFeature, String motivation, String habit) {
        Details details = new Details();
        if (age != null) {
            details.setAge(age);
        }
        if (!height.isNaN() && height != null) {
            details.setHeight(height);
        }
        if (!weight.isNaN() && weight != null) {
            details.setWeight(weight);
        }
        if (distinguishingFeature != null) {
            details.setDistinguishingFeature(distinguishingFeature);
        }
        if (motivation != null) {
            details.setMotivation(motivation);
        }
        if (habit != null) {
            details.setHabit(habit);
        }
        return details;
    }

    private Training setTraining(String skillToLearn, Integer percentage) {
        Training training = new Training();
        try {
            training.setSkillToLearn(skillToLearn);
            training.setPercentage(percentage);
        } catch (NullPointerException exception) {
            return null;
        }
        return training;
    }

    private Attack getAttack(String name, Integer toHit, Integer numberOfDiceToThrow, Dice dice, String type) {
        Attack attack = new Attack();
        attack.setName(name);
        attack.setToHit(toHit);
        attack.setDamage(getDiceToThrow(numberOfDiceToThrow, dice));
        attack.setType(type);
        return attack;
    }

    private DiceToThrow getDiceToThrow(Integer numberOfDiceToThrow, Dice dice) {
        DiceToThrow diceToThrow = new DiceToThrow();
        diceToThrow.setNumberOfDiceToThrow(numberOfDiceToThrow);
        diceToThrow.setDice(dice);
        return diceToThrow;
    }
}
