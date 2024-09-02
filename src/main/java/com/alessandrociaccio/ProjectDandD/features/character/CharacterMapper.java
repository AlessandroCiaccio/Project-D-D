package com.alessandrociaccio.ProjectDandD.features.character;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
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
        TypeMap<CharacterDto, CharacterDo> propertyMapper = this.modelMapper
                .createTypeMap(CharacterDto.class, CharacterDo.class);
        propertyMapper.addMapping(CharacterDto::getCharacteristics, CharacterDo::setCharacteristics);
        propertyMapper.addMapping(CharacterDto::getSkill, CharacterDo::setSkill);
        return modelMapper.map(characterDto, CharacterDo.class);
    }

    public CharacterDto convertCharacterDoToDto(CharacterDo characterDo) {
        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setMatchingStrategy(MatchingStrategies.LOOSE)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
        TypeMap<CharacterDo, CharacterDto> propertyMapper = this.modelMapper
                .createTypeMap(CharacterDo.class, CharacterDto.class);

        propertyMapper.addMapping(CharacterDo::getCharacteristics, CharacterDto::setCharacteristics);
        propertyMapper.addMapping(CharacterDo::getSkill, CharacterDto::setSkill);
        return modelMapper.map(characterDo, CharacterDto.class);
    }
}
