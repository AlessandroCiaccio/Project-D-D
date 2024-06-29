package com.alessandrociaccio.ProjectDandD.features.character;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CharacterDto {
    private String name;
    private Integer age;
    private String classe;
    private String race;
}
