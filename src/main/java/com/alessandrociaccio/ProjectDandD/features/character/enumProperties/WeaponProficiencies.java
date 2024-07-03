package com.alessandrociaccio.ProjectDandD.features.character.enumProperties;

public enum WeaponProficiencies {
    SIMPLE("Simple"),
    MARTIAL("Martial");
    private final String weaponProficiencies;

    WeaponProficiencies(String a) {
        this.weaponProficiencies = a;
    }

    public static boolean isValidWeaponProficiencies(String str) {
        try {
            WeaponProficiencies.valueOf(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return weaponProficiencies;
    }
}

