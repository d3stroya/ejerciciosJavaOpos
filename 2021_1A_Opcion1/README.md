# Ejercicio 1:
Diseñar una aplicación Java o C++ que permita gestionar una colección de trabajadores en
memoria. Los trabajadores pueden ser asalariados y voluntarios.

De cada trabajador se guardan una serie de atributos comunes, como son id, apellidos, nombre y
teléfono y otros específicos:
- de los asalariados, se necesita salario y puesto de trabajo
- de los voluntarios, su turno y una descripción de la función que desempeñan.
  Se pide:
1. diseñar un sistema de clases para la gestión de estos trabajadores.
2. crear una colección con un número indefinido de elementos que permita almacenar
   trabajadores. El acceso a los datos de la colección se llevará a cabo a través de los
   métodos que trabajan con la misma.
   
Métodos que trabajan con la colección:
3. añadir trabajadores a esta colección
4. obtener una lista de los trabajadores de un tipo que se pasará como parámetro.
5. obtener una lista de los trabajadores (asalariados) con un salario superior a una cantidad
   pasada.
6. obtener el valor medio de los salarios de los trabajadores (asalariados).
7. volcar en un archivo de texto los datos de los trabajadores de un tipo que será pasado
   como parámetro. Este archivo tendrá el nombre “archivo_trabajadores_XXX.txt”, donde
   XXX será el tipo de trabajador asociado al archivo. Ejemplo,
   “archivo_trabajadores_asalariados.txt”.
   Cada línea del archivo contendrá los atributos comunes y específicos de cada trabajador.
   Un ejemplo de línea sería el siguiente:
   1000;Ramos Salva;Ana;622123999;2300:Jefa Sección
8. crear algún mecanismo que obligue a que los métodos citados sean desarrollados.

## SOLUCIÓN
1. Creamos una clase Trabajador, que sea padre de:
   * TrabajadoresAsalariados
   * TrabajadoresVoluntarios
2. Añadimos los atributos indicados en cada clase.
3. Incluimos sus getters y setters y el método toString.
4. Creamos una interfaz con los métodos que nos piden.
5. Creamos una clase Colección que implemente la interfaz.
6. Agregamos un Main donde crear objetos trabajadores y probar los métodos.

