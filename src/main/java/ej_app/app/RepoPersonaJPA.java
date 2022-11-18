package ej_app.app;

import ej_app.model.Persona;
import ej_app.model.dtos.DTOPersona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "personas", excerptProjection = DTOPersona.class)
public interface RepoPersonaJPA extends JpaRepository<Persona, Integer> {

    Page<DTOPersona> findPersonaByNombre(String nombre, Pageable page);

    Page<DTOPersona> findPersonaByApellido(String apellido, Pageable page);

    Page<DTOPersona> findPersonaByNombreAndApellido(String nombre, String apellido, Pageable page);
}
