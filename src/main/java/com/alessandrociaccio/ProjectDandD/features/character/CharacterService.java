package com.alessandrociaccio.ProjectDandD.features.character;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface CharacterService {
    ResponseEntity<?> createCharacter(CharacterDto characterDto);

    ResponseEntity<?> getCharacter(Long id);

    ResponseEntity<?> changeName(Long id, String name);

    Boolean deleteCharacter(Long id);
}
