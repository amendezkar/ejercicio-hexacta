package ej_app.model.dtos;

import ej_app.model.Categoria;
import ej_app.model.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;

@Projection(name="persona1", types = {Persona.class})
public interface DTOPersona {

    @Value("#{target.nombre} #{target.apellido}")
    String getNombreCompleto();

    @Value("#{target.fechaNacimiento}")
    LocalDate getFechaNacimiento();

    @Value("#{target.categoria}")
    Categoria getCategoria();
}
