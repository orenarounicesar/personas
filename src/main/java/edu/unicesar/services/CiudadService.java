package edu.unicesar.services;

import edu.unicesar.entitites.Ciudad;
import edu.unicesar.repositories.CiudadRepository;
import io.micronaut.core.annotation.Introspected;
import jakarta.inject.Singleton;

import java.util.List;
import java.util.Optional;

@Singleton
@Introspected
public class CiudadService {
    private final CiudadRepository ciudadRepository;
    public CiudadService(CiudadRepository ciudadRepository) {
        this.ciudadRepository = ciudadRepository;
    }

    public List<Ciudad> findAll() {
        return ciudadRepository.findAll();
    }

    public Optional<Ciudad> findById(Integer id) {
        return ciudadRepository.findById(id);
    }

    public Ciudad citySave(Ciudad ciudad) {
        return ciudadRepository.save(ciudad);
    }
}
