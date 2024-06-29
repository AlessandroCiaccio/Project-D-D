package com.alessandrociaccio.ProjectDandD.features.character;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/v1/character")
public class CharacterController {
    @Autowired
    private CharacterService characterService;
    @PostMapping(path = "/create")
    public ResponseEntity<?> createCharacter(@RequestBody CharacterDto characterDto){
        return null;
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getCharacter(@RequestParam Long id){
        return null;
    }

}
