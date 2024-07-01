package com.alessandrociaccio.ProjectDandD.features.character;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharacterServiceImpl implements CharacterService {


    @Override
    public ResponseEntity<?> createCharacter(CharacterDto characterDto) {
        return null;
    }

    @Override
    public ResponseEntity<?> getCharacter(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<?> changeName(Long id, String name) {
        return null;
    }

    @Override
    public Boolean deleteCharacter(Long id) {
        return null;
    }
}
