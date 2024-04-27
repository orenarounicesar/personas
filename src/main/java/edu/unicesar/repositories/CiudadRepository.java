package edu.unicesar.repositories;

import edu.unicesar.entitites.Ciudad;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface CiudadRepository extends CrudRepository<Ciudad, Integer> {
}
