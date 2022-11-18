package ej_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ej_app.model.Categoria;
import ej_app.model.Persona;
import ej_test.testExceptions.NoTieneLaCategoriaEsperadaException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TestCategoriaEdad {

    @Test
    public void testPersonaEsNinio() throws NoTieneLaCategoriaEsperadaException {

        Categoria categoriaEsperada = Categoria.NINIO;
        Persona ricardo = new Persona("Ricardo", "Perez", LocalDate.of(2012, 05, 18));

        try {Assertions.assertEquals(categoriaEsperada, ricardo.getCategoria());}
        catch (org.opentest4j.AssertionFailedError error)
        {throw new NoTieneLaCategoriaEsperadaException(categoriaEsperada, ricardo);}
    }

    @Test
    public void testPersonaEsAdolescenteCaso1() throws NoTieneLaCategoriaEsperadaException {

        Categoria categoriaEsperada = Categoria.ADOLESCENTE;
        Persona agustin = new Persona("Agustin", "Mendez", LocalDate.of(2011, 11, 15));

        try {Assertions.assertEquals(categoriaEsperada, agustin.getCategoria());}
        catch (org.opentest4j.AssertionFailedError error)
        {throw new NoTieneLaCategoriaEsperadaException(categoriaEsperada, agustin);}
    }

    @Test
    public void testPersonaEsAdolescenteCaso2() throws NoTieneLaCategoriaEsperadaException {

        Categoria categoriaEsperada = Categoria.ADOLESCENTE;
        Persona tomas = new Persona("Tomas", "Gomez", LocalDate.of(2005, 05, 19));

        try {Assertions.assertEquals(categoriaEsperada, tomas.getCategoria());}
        catch (org.opentest4j.AssertionFailedError error)
        {throw new NoTieneLaCategoriaEsperadaException(categoriaEsperada, tomas);}
    }

    @Test
    public void testPersonaEsAdultoCaso1() throws NoTieneLaCategoriaEsperadaException {

        Categoria categoriaEsperada = Categoria.ADULTO;
        Persona lucia = new Persona("Lucia", "Rodriguez", LocalDate.of(2004, 11, 05));

        try {Assertions.assertEquals(categoriaEsperada, lucia.getCategoria());}
        catch (org.opentest4j.AssertionFailedError error)
        {throw new NoTieneLaCategoriaEsperadaException(categoriaEsperada, lucia);}
    }

    @Test
    public void testPersonaEsAdultoCaso2() throws NoTieneLaCategoriaEsperadaException {

        Categoria categoriaEsperada = Categoria.ADULTO;
        Persona fabiana = new Persona("Fabiana", "Garcia", LocalDate.of(1942, 12, 28));

        try {Assertions.assertEquals(categoriaEsperada, fabiana.getCategoria());}
        catch (org.opentest4j.AssertionFailedError error)
        {throw new NoTieneLaCategoriaEsperadaException(categoriaEsperada, fabiana);}
    }

    @Test
    public void testPersonaEsOctogenario() throws NoTieneLaCategoriaEsperadaException {

        Categoria categoriaEsperada = Categoria.OCTOGENARIO;
        Persona carolina = new Persona("Carolina", "Saraza", LocalDate.of(1942, 11, 9));

        try {Assertions.assertEquals(categoriaEsperada, carolina.getCategoria());}
        catch (org.opentest4j.AssertionFailedError error)
        {throw new NoTieneLaCategoriaEsperadaException(categoriaEsperada, carolina);}
    }
}
