package com.alessandrociaccio.ProjectDandD.features.character.enumProperties;

public enum Dice {
    D2("D2"),
    D4("D4"),
    D6("D6"),
    D8("D8"),
    D10("D10"),
    D12("D12"),
    D20("D20"),
    D100("D100");
    private final String dice;

    Dice(String a) {
        this.dice = a;
    }

    public static boolean isValidDice(String str) {
        try {
            Dice.valueOf(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return dice;
    }
}

