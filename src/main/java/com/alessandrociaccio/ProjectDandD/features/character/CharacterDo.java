package com.alessandrociaccio.ProjectDandD.features.character;

import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.*;
import com.alessandrociaccio.ProjectDandD.features.character.objectProperties.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Table(name = "characters")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sheet_id")
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(name = "age")
    private Integer age;
    private Float height;
    private Float weight;
    private String distinguishingFeature;
    private String motivation;
    private String habit;
    @Column(nullable = false)
    private Classe classe;
    private Race race;
    private EnumMap<Characteristic, Integer> characteristics;
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Integer> skill;
    @Column(name = "armor_class")
    private Integer armorClass;
    private Integer maxHp;
    private Integer currentHp = getMaxHp();
    private Integer deathSaveFailures = 0;
    private Integer initiative;
    private Integer speed;
    private Integer experience;
    @JdbcTypeCode(SqlTypes.JSON)
    private Training training;
    private Integer fate;
    private Integer inspiration;
    private Integer spellCastingAbility;
    private Integer spellSaveDc;
    private Integer spellAttackBonus;
    @ElementCollection
    @JdbcTypeCode(SqlTypes.JSON)
    private List<Action> actions;
    @ElementCollection
    @JdbcTypeCode(SqlTypes.JSON)
    private List<Attack> attacks;
    @ElementCollection
    @JdbcTypeCode(SqlTypes.JSON)
    private List<Spell> spell;
    private List<String> proficiencies;
    private List<String> languages;
    @JdbcTypeCode(SqlTypes.JSON)
    private ArmorProficiencies armorProficiencies;
    @JdbcTypeCode(SqlTypes.JSON)
    private WeaponProficiencies weaponsProficiencies;
    private Integer passivePerception;
    private List<String> senses;
    private List<String> resistances;
    private List<String> immunities;
    @ElementCollection
    @JdbcTypeCode(SqlTypes.JSON)
    private List<FeatureTrait> featuresAndTraits;
    private String background;
    private List<String> personalTraits;
    private List<String> bonds;
    private List<String> ideals;
    private List<String> flaws;
    @ElementCollection
    @JdbcTypeCode(SqlTypes.JSON)
    private List<Item> item;
    private Float money;
    private Integer rations;
    private Integer waterSkin;
}
