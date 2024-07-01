package com.alessandrociaccio.ProjectDandD.features.character;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/v1/character")
public class CharacterController {
    private final CharacterServiceImpl characterService;

    @PostMapping(path = "/create")
    public ResponseEntity<?> createCharacter(@RequestBody CharacterDto characterDto) {
        return characterService.createCharacter(characterDto);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getCharacter(@PathVariable Long id) {
        return characterService.getCharacter(id);
    }

    @PostMapping(path = "/{id}/name")
    public ResponseEntity<?> changeName(@PathVariable Long id, @RequestParam String name) {
        return characterService.changeName(id, name);
    }

    @DeleteMapping(path = "/{id}")
    public Boolean deleteCharacter(@PathVariable Long id) {
        return characterService.deleteCharacter(id);
    }

}
