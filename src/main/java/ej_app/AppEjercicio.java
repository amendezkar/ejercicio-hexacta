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
            repoPersona.save(new Persona("Ricardo", "Perez", LocalDate.of(2000, 01, 01)));
        };
    }
}
