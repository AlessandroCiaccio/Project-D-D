package com.alessandrociaccio.ProjectDandD.features.character.enumProperties;

public enum Classe {
    BARBARIAN("Barbarian"),
    BARD("Bard"),
    CLERIC("Cleric"),
    DRUID("Druid"),
    FIGHTER("Fighter"),
    MONK("Monk"),
    PALADIN("Paladin"),
    RANGER("Ranger"),
    ROGUE("Rogue"),
    MAGICIAN("Magician"),
    WARLOCK("Warlock"),
    WIZARD("Wizard"),
    ARTIFICIER("Artificier");
    private final String classe;

    Classe(String a) {
        this.classe = a;
    }

    public static boolean isValidClasse(String str) {
        try {
            Classe.valueOf(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return classe;
    }
}

