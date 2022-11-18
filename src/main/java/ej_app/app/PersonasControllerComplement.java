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

    @GetMapping(value = "/personas", params = "nombre")
    @ResponseBody
    public Page<DTOPersona> traerPorNombre(@RequestParam(value = "nombre", required = false) String nombre,
                                        Pageable pageable) {

            return repoPersona.findPersonaByNombre(nombre, pageable);
    }

    @GetMapping(value = "/personas", params = "apellido")
    @ResponseBody
    public Page<DTOPersona> traerPorApellido(@RequestParam(value = "apellido", required = false) String apellido,
                                          Pageable pageable) {

        return repoPersona.findPersonaByApellido(apellido, pageable);
    }

    @GetMapping(value = "/personas", params = {"nombre","apellido"})
    @ResponseBody
    public Page<DTOPersona> traerPorNombreYApellido(@RequestParam(value = "nombre", required = false) String nombre,
                                                 @RequestParam(value = "apellido", required = false) String apellido,
                                                 Pageable pageable) {

        return repoPersona.findPersonaByNombreAndApellido(nombre, apellido, pageable);
    }
}
