package com.alessandrociaccio.ProjectDandD.features.character.enumProperties;

public enum Race {
    DRAGONBORN("Dragonborn"),
    DWARF("Dwarf"),
    ELF("Elf"),
    GNOME("Gnome"),
    HALFELF("Half-elf"),
    HALFLING("Halfling"),
    HALFORC("Half-orc"),
    HUMAN("Human"),
    TIEFLING("Tiefling");
    private final String race;

    Race(String a) {
        this.race = a;
    }

    public static boolean isValidRace(String str) {
        try {
            Race.valueOf(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return race;
    }
}
