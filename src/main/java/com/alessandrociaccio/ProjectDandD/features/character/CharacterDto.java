package com.alessandrociaccio.ProjectDandD.features.character;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CharacterDto {
    private Long id;
    private String name;
    private String details;
    private String classe;
    private String race;
    private String characteristics;
    private String ability;
    private Integer armorClass;
    private Integer maxHp;
    private Integer currentHp;
    private Integer deathSaveFailures;
    private Integer initiative;
    private Integer speed;
    private Integer experience;
    private Integer training;
    private Integer fate;
    private Integer inspiration;
    private Integer spellCastingAbility;
    private Integer spellSaveDc;
    private Integer spellAttackBonus;
    private List<String> actions;
    private List<String> attacks;
    private List<String> spells;
    private List<String> proficiencies;
    private List<String> languages;
    private List<String> armorProficiencies;
    private List<String> weaponsProficiencies;
    private List<String> passivePerception;
    private List<String> senses;
    private List<String> resistances;
    private List<String> immunities;
    private List<String> featuresAndTraits;
    private String background;
    private List<String> personalTraits;
    private List<String> bonds;
    private List<String> ideals;
    private List<String> flaws;
    private List<String> item;
    private Float money;
    private Integer rations;
    private Integer waterSkin;

}
