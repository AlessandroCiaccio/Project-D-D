package com.alessandrociaccio.ProjectDandD.features.character.objectProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkillPoints {
    private String skill;
    private Integer points;
}
