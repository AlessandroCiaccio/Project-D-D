package com.alessandrociaccio.ProjectDandD.features.character.objectProperties;

import com.alessandrociaccio.ProjectDandD.features.character.enumProperties.Characteristic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CharacteristicPoints {
    private Characteristic characteristic;
    private Integer points;
}
