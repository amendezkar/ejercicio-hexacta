package ej_app.model;

//Parte D: La personas tendrán que tener un campo autocalculado que se persista en la BD,
//        que dependiendo la fecha de nacimiento categorice a las personas como:
//        Niños < 11, Adolescentes >=11 & < 18, Adultos >=18 & < 80, Octogenario >= 80.

public enum Categoria {

    NINIO,
    ADOLESCENTE,
    ADULTO,
    OCTOGENARIO
}
