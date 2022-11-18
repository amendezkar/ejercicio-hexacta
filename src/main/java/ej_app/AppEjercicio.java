package ej_app;

import ej_app.app.RepoPersonaJPA;
import ej_app.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class AppEjercicio {

    @Autowired
    RepositoryRestConfiguration config;

    public static void main(String[] args) {

        SpringApplication.run(AppEjercicio.class, args);
    }

    @Bean
    public CommandLineRunner init(RepoPersonaJPA repoPersona){

        config.exposeIdsFor(Persona.class);

        return(cosas) -> {
            repoPersona.save(new Persona("Ricardo", "Perez", LocalDate.of(2012, 05, 18)));
            repoPersona.save(new Persona("Agustin", "Mendez", LocalDate.of(2011, 11, 15)));
            repoPersona.save(new Persona("Tomas", "Gomez", LocalDate.of(2005, 05, 19)));
            repoPersona.save(new Persona("Lucia", "Rodriguez", LocalDate.of(2004, 11, 05)));
            repoPersona.save(new Persona("Fabiana", "Garcia", LocalDate.of(1942, 12, 28)));
            repoPersona.save(new Persona("Carolina", "Saraza", LocalDate.of(1942, 11, 9)));

            repoPersona.save(new Persona("Ricardo", "Gomez", LocalDate.of(2012, 05, 18)));
            repoPersona.save(new Persona("Lucia", "Perez", LocalDate.of(2012, 05, 18)));
        };
    }
}
