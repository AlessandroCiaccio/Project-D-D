package com.alessandrociaccio.ProjectDandD.features.character;

import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.*;
import com.alessandrociaccio.ProjectDandD.features.character.objectProperties.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

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
    @Column(columnDefinition = "hstore")
    private Map<Characteristic, Integer> characteristics;
    @Column(columnDefinition = "hstore")
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
    @Column(columnDefinition = "hstore")
    private Map<String, String> actions;
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
