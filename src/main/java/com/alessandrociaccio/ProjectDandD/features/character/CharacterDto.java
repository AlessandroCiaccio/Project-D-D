package com.alessandrociaccio.ProjectDandD.features.character;

import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.ArmorProficiencies;
import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.Classe;
import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.Race;
import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.WeaponProficiencies;
import com.alessandrociaccio.ProjectDandD.features.character.objectProperties.*;
import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CharacterDto {
    private String name;
    private Details details;
    private Classe classe;
    private Race race;
    private Map<String, Integer> characteristics;
    private Map<String, Integer> skill;
    private Integer armorClass;
    private Integer maxHp;
    private Integer currentHp = getMaxHp();
    private Integer deathSaveFailures = 0;
    private Integer initiative;
    private Integer speed;
    private Integer experience;
    private Training training;
    private Integer fate;
    private Integer inspiration;
    private Integer spellCastingAbility;
    private Integer spellSaveDc;
    private Integer spellAttackBonus;
    private List<Action> actions;
    private List<Attack> attacks;
    private List<Spell> spells;
    private List<String> proficiencies;
    private List<String> languages;
    private ArmorProficiencies armorProficiencies;
    private WeaponProficiencies weaponsProficiencies;
    private Integer passivePerception;
    private List<String> senses;
    private List<String> resistances;
    private List<String> immunities;
    private List<FeatureTrait> featuresAndTraits;
    private String background;
    private List<String> personalTraits;
    private List<String> bonds;
    private List<String> ideals;
    private List<String> flaws;
    private List<Item> item;
    private Float money;
    private Integer rations;
    private Integer waterSkin;

}
