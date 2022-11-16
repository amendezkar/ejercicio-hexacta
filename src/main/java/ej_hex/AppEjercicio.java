package ej_hex;

import ej_hex.app.RepoPersonaJPA;
import ej_hex.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

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
            repoPersona.save(new Persona("Ricardo", "Perez"));
        };
    }
}
