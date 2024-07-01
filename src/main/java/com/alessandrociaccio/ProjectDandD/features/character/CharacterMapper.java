package com.alessandrociaccio.ProjectDandD.features.character;

import springfox.documentation.swagger2.mappers.LicenseMapper;

public interface CharacterMapper {
    CharacterDo convertCharacterDtoToDo(CharacterDto characterDto);
}
