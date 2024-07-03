package com.alessandrociaccio.ProjectDandD.features.character.enumProperties;

public enum ArmorProficiencies {
    LIGHT("Light"),
    MEDIUM("Medium"),
    HEAVY("Heavy"),
    SHIELD("Shield");
    private final String armorProficiencies;

    ArmorProficiencies(String a) {
        this.armorProficiencies = a;
    }

    public static boolean isValidArmorProficiencies(String str) {
        try {
            ArmorProficiencies.valueOf(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return armorProficiencies;
    }
}

