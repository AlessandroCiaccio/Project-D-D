package com.alessandrociaccio.ProjectDandD.features.character;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CharacterMapper {
    private final ModelMapper modelMapper;

    public CharacterDo convertCharacterDtoToDo(CharacterDto characterDto) {
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setMatchingStrategy(MatchingStrategies.LOOSE)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
        return modelMapper.map(characterDto, CharacterDo.class);
    }

    public CharacterDto convertCharacterDoToDto(CharacterDo characterDo) {
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setMatchingStrategy(MatchingStrategies.LOOSE)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
        return modelMapper.map(characterDo, CharacterDto.class);
    }
}
