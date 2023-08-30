package ej1;


import ej1.entidades.Persona;
import ej1.repositorios.RepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ej1Application {

    @Autowired
    RepositorioPersona rPersona;

    public static void main(String[] args) {
        SpringApplication.run(ej1.Ej1Application.class, args);
    }
    @Bean
    CommandLineRunner init(RepositorioPersona rPersona) {
        return args -> {
            Persona persona2 = new Persona();
            persona2.setNombre("Charlotte");
            persona2.setApellido("Vanderbilt");
            persona2.setEdad(16);

            // Guardar el objeto Persona en la base de datos
            rPersona.save(persona2);

            // Recuperar el objeto Persona desde la base de datos
            Persona personaRecuperada = rPersona.findById(persona2.getId()).orElse(null);
            if (personaRecuperada != null) {
                System.out.println("Nombre: " + personaRecuperada.getNombre());
                System.out.println("Apellido: " + personaRecuperada.getApellido());
                System.out.println("Edad: " + personaRecuperada.getEdad());
            }
        };
    }
}

