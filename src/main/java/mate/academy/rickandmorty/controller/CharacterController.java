package mate.academy.rickandmorty.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.rickandmorty.dto.internal.CharacterDto;
import mate.academy.rickandmorty.service.CharacterService;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Controller for manage characters", description = "Endpoints to manage characters")
@RequiredArgsConstructor
@RestController
@RequestMapping("/characters")
public class CharacterController {
    private final CharacterService characterService;

    @Operation(summary = "Fetch a random character")
    @GetMapping()
    public CharacterDto getRandomCharacter(@ParameterObject @PageableDefault Pageable pageable) {
        return characterService.getCharacter(pageable);
    }

    @GetMapping("/{name}")
    @Operation(summary = "Get character by name")
    public List<CharacterDto> getCharacterByName(@PathVariable String name,
                                                 @ParameterObject @PageableDefault
                                                 Pageable pageable) {
        return characterService.findCharacterByName(name, pageable);
    }
}
