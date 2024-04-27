package edu.unicesar.repositories;

import edu.unicesar.entitites.Persona;
import io.micronaut.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {
}
