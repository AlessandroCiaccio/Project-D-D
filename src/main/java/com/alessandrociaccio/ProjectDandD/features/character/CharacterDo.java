package com.alessandrociaccio.ProjectDandD.features.character;

import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.Characteristic;
import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.Classe;
import com.alessandrociaccio.ProjectDandD.features.character.objectProperties.Details;
import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.Race;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
    private Details details;
    @Column(nullable = false)
    private Classe classe;
    private Race race;
    private Characteristic characteristics;
    private List<String> skills;
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
