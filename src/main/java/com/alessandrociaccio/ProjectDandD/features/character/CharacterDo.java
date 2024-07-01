package com.alessandrociaccio.ProjectDandD.features.character;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "character")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "character_id")
    private Long id;
    @Column(nullable = false)
    private String name;
    private String details;
    @Column(nullable = false)
    private String classe;
    private String race;
    private String characteristics;
    private String ability;
    private String armorClass;
    private String maxHp;
    private String hitPoints;
    private String deathSaveFailures;
    private String initiative;
    private String speed;
    private String experience;
    private String training;
    private String fate;
    private String inspiration;
    private String spellCastingAbility;
    private String spellSaveDc;
    private String spellAttackBonus;
    private String actions;
    private String attacks;
    private String spells;
    private String proficiencies;
    private String languages;
    private String armorProficiencies;
    private String weaponsProficiencies;
    private String passivePerception;
    private String senses;
    private String resistances;
    private String immunities;
    private String featuresAndTraits;
    private String background;
    private String personalTraits;
    private String bonds;
    private String ideals;
    private String flaws;
    private String item;
    private String money;
    private String rations;
    private String waterSkin;
}
