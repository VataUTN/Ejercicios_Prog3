# Ejercicios de Programación 3

Este repositorio contiene dos ejercicios relacionados con el uso de Spring Boot y bases de datos. A continuación, se proporciona una breve descripción de cada ejercicio y cómo ejecutarlos.

## Ejercicio 1

### Descripción
El Ejercicio 1 es una aplicación de Spring Boot que muestra cómo crear una entidad de Persona y guardarla en una base de datos. Además, demuestra cómo recuperar esta entidad de la base de datos y mostrar sus detalles.

### Ejecución
Para ejecutar este ejercicio, sigue estos pasos:

1. Asegúrate de tener configurada una base de datos compatible con Spring Boot, como MySQL o H2. Puedes ajustar la configuración en `src/main/resources/application.properties`.

2. Ejecuta la clase principal `Ej1Application.java` ubicada en el paquete `ej1`. Esto iniciará la aplicación Spring Boot.

3. La aplicación creará automáticamente una tabla para la entidad Persona en la base de datos y guardará una instancia de Persona con nombre, apellido y edad.

4. Luego, recuperará esta instancia de Persona y mostrará sus detalles en la consola.

## Ejercicio 2

### Descripción
El Ejercicio 2 es similar al Ejercicio 1, pero introduce un campo adicional, "Domicilio", en la entidad Persona. Además de guardar y recuperar detalles básicos de la Persona, este ejercicio también muestra cómo trabajar con un campo adicional.

### Ejecución
Para ejecutar este ejercicio, sigue estos pasos:

1. Asegúrate de tener configurada una base de datos compatible con Spring Boot, como MySQL o H2. Puedes ajustar la configuración en `src/main/resources/application.properties`.

2. Ejecuta la clase principal `Ej2Application.java` ubicada en el paquete `ej2`. Esto iniciará la aplicación Spring Boot.

3. La aplicación creará automáticamente una tabla para la entidad Persona en la base de datos y guardará una instancia de Persona con nombre, apellido, edad y domicilio.

4. Luego, recuperará esta instancia de Persona y mostrará todos sus detalles en la consola.
