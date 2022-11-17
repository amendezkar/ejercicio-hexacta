package ej_app.app;

import ej_app.model.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "personas")
public interface RepoPersonaJPA extends JpaRepository<Persona, Integer> {

    Page<Persona> findPersonaByNombre(String nombre, Pageable page);

    Page<Persona> findPersonaByApellido(String apellido, Pageable page);
}
