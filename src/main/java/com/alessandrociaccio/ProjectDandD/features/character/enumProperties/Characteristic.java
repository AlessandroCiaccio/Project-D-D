package com.alessandrociaccio.ProjectDandD.features.character.enumProperties;

public enum Characteristic {
    STRENGTH("Strength"),
    DEXTERITY("Dexterity"),
    CONSTITUTION("Constitution"),
    INTELLIGENCE("Intelligence"),
    WISDOM("Wisdom"),
    CHARISMA("Charisma");

    private final String characteristic;
    Characteristic (String a){
        this.characteristic=a;
    }
    @Override
    public String toString(){
        return characteristic;
    }
}
