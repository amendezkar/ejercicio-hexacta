package ej_test.testExceptions;

import ej_app.model.Categoria;
import ej_app.model.Persona;

public class NoTieneLaCategoriaEsperadaException extends RuntimeException{

    public NoTieneLaCategoriaEsperadaException(Categoria categoriaEsperada, Persona persona){
        super("Se esperaba que " + persona.getNombre() + " " + persona.getApellido() + " tuviera la categoria " + categoriaEsperada + " pero obtuvo la categoria " + persona.getCategoria());
    }
}
