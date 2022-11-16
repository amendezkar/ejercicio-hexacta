package ej_hex.model;

import ej_hex.db.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Setter
@Getter
@Entity
public class Persona extends Persistente {

    private String nombre;
    private String apellido;

    public Persona(){};

    public Persona(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
