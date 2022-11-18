package ej_app.app;

import ej_app.model.Persona;
import ej_app.model.dtos.DTOPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RepositoryRestController
public class PersonasControllerComplement {

    @Autowired
    RepoPersonaJPA repoPersona;

    @GetMapping("/personas")
    @ResponseBody
    public Page<Persona> traerPorNombre(@RequestParam String nombre, Pageable pageable) {

        return repoPersona.findPersonaByNombre(nombre, pageable);
    }

    /*@GetMapping("/personas")
    @ResponseBody
    public Page<Persona> traerPorApellido(@RequestParam String apellido, Pageable pageable) {

        return repoPersona.findPersonaByApellido(apellido, pageable);
    }*/
}
