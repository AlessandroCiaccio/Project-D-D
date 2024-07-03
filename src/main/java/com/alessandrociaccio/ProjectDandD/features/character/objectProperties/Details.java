package com.alessandrociaccio.ProjectDandD.features.character.objectProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Details {
    private Integer age;
    private Float height;
    private Float weight;
    private String distinguishingFeature;
    private String motivation;
    private String habit;
}
