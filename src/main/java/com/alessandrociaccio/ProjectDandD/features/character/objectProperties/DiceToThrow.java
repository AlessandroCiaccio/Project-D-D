package com.alessandrociaccio.ProjectDandD.features.character.objectProperties;

import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.Dice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiceToThrow {
    private Integer numberOfDiceToThrow;
    private Dice dice;
}
