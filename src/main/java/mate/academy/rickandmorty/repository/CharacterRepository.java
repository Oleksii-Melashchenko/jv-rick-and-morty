package mate.academy.rickandmorty.repository;

import java.util.List;
import mate.academy.rickandmorty.model.RickAndMortyCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<RickAndMortyCharacter, Long> {

    List<RickAndMortyCharacter> searchRickAndMortyCharacterByNameContainingIgnoreCase(String name);

}
