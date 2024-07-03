package com.alessandrociaccio.ProjectDandD.features.character.objectProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeatureTrait {
    private Integer level;
    private String name;
    private String details;
}
