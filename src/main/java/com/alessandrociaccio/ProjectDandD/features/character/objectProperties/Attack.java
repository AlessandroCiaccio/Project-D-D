package com.alessandrociaccio.ProjectDandD.features.character.objectProperties;

import com.alessandrociaccio.ProjectDandD.features.character.objectProperties.DiceToThrow;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Attack {
    private String name;
    private Integer toHit;
    private DiceToThrow damage;
    private String type;
}
