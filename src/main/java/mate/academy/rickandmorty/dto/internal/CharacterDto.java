package mate.academy.rickandmorty.dto.internal;

import lombok.Data;

@Data
public class CharacterDto {
    private Long id;
    private String externalId;
    private String name;
    private String status;
    private String gender;
}
