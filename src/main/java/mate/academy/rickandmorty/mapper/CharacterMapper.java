package mate.academy.rickandmorty.mapper;

import mate.academy.rickandmorty.config.MapperConfig;
import mate.academy.rickandmorty.dto.external.CharacterExternalDto;
import mate.academy.rickandmorty.dto.internal.CharacterDto;
import mate.academy.rickandmorty.model.RickAndMortyCharacter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = MapperConfig.class)
public interface CharacterMapper {

    CharacterDto toDto(RickAndMortyCharacter character);

    @Mapping(target = "externalId",
            expression = "java(String.valueOf(characterResponseDto.getId()))")
    RickAndMortyCharacter toEntity(CharacterExternalDto characterResponseDto);

    default Long setExternalId(CharacterExternalDto characterExternalDto) {
        return characterExternalDto.getId();
    }
}
