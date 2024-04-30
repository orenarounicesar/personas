package edu.unicesar.controllers;

import edu.unicesar.entitites.Ciudad;
import edu.unicesar.services.CiudadService;
import io.micronaut.http.annotation.*;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

import java.util.List;
import java.util.Optional;

@ExecuteOn(TaskExecutors.IO)
@Controller("/api/personas/ciudades")
//@Tag(name = "Ciudades")
public class CiudadController {
    private final CiudadService ciudadService;
    public CiudadController(CiudadService ciudadService) {
        this.ciudadService = ciudadService;
    }

    @Get
    public List<Ciudad> getAllCiudades() {
        return ciudadService.findAll();
    }

    @Get("/id")
    public Optional<Ciudad> getAllCiudades(@PathVariable("id") Integer id) {
        return ciudadService.findById(id);
    }

    @Post
    public Ciudad citySave(@Body Ciudad ciudad) {
        return ciudadService.citySave(ciudad);
    }
}
