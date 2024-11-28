package mate.academy.rickandmorty.dto.internal;

import java.util.List;
import java.util.Map;
import lombok.Data;
import mate.academy.rickandmorty.dto.external.CharacterExternalDto;

@Data
public class CharacterResponseDto {
    private Map<String, Object> info;
    private List<CharacterExternalDto> results;
}
