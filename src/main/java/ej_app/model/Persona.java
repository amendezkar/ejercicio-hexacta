package ej_app.model;

import ej_app.db.Persistente;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;
import java.time.Period;

import static ej_app.model.Categoria.*;

@Setter
@Getter
@Entity
public class Persona extends Persistente {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "fechaDeNacimiento", columnDefinition = "DATE")
    private LocalDate fechaNacimiento;

    @Enumerated(EnumType.STRING)
    @Column(name = "categoria")
    private Categoria categoria;

    public Persona(){};

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.categorizar();
    }

    public void categorizar(){

        LocalDate hoy = LocalDate.now();

        int edad = Period.between(fechaNacimiento, hoy).getYears();

        if(edad < 11){

            this.setCategoria(NINIO);
        }else{

            if(edad < 18){

                this.setCategoria(ADOLESCENTE);
            }else{

                if(edad < 80){

                    this.setCategoria(ADULTO);
                }else{

                    this.setCategoria(OCTOGENARIO);
                }
            }
        }
    }
}
