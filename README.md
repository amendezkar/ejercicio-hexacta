# Ejercicio:

2.           Crear una aplicación integradora usando:
a.           Frontend: Angular + HTML
b.           Backend: Java (spring boot)
c.            Base de datos: a elección

Esta aplicación deberá contener una tabla de base de datos (ej Persona, que modele a una persona, 3 o 4 columnas). El backend deberá exponer un servicio rest que liste todas las personas de la base de datos. El frontend deberá consumir el servicio rest y mostrar los datos en una tabla.

Tratar de usar una arquitectura en capas.

A nivel back tienen que estar claras 3 capas al menos.

Aplicar inyección de dependencias.

Parte B: Agregar a la pantalla 2 filtros (ej: Nombre, Apellido) y que la api rest soporte esos filtros de modo que esos filtros lleguen al backend y se deleguen a la BD para filtrar los datos en usando el motor de base de datos.

Pensar que diferencia hay entre eso y hacer el filtro en frontend sin resolverlo a nivel BD. Explicar esto con sus palabras.

Parte C: Formulario para alta de Personas con validaciones de campos.

Pregunta: que tipos de validaciones puede tener un sistema? donde se debieran implementar?

Parte D: La personas tendrán que tener un campo autocalculado que se persista en la BD, que dependiendo la fecha de nacimiento categorice a las personas como: Niños < 11, Adolescentes >=11 & < 18, Adultos >=18 & < 80, Octogenario >= 80. 

Implementar test unitarios para esta logica.

Tratar de identificar/aplicar 2 o 3 patrones de diseño en el backend.
