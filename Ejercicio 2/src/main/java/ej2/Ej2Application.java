package ej2;


import ej2.entidades.Persona;
import ej2.repositorios.RepositorioPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ej2Application {

    @Autowired
    RepositorioPersona rPersona;

    public static void main(String[] args) {
        SpringApplication.run(Ej2Application.class, args);
    }

    @Bean
    CommandLineRunner init(RepositorioPersona rPersona) {
        return args -> {
            System.out.println("-----------------ESTOY FUNCIONANDO---------");
            Persona persona = new Persona();
            persona.setNombre("Juan");
            persona.setApellido("Pérez");
            persona.setEdad(30);

            rPersona.save(persona);

            Persona personaRecuperada = rPersona.findById(persona.getId()).orElse(null);
            if (personaRecuperada != null) {
                System.out.println("Nombre: " + personaRecuperada.getNombre());
                System.out.println("Apellido: " + personaRecuperada.getApellido());
                System.out.println("Edad: " + personaRecuperada.getEdad());
                System.out.println("Domicilio: " + personaRecuperada.getDomicilio());

            }
        };
    }
}
