package com.example.dgo;

import com.example.dgo.models.Usuario;
import com.example.dgo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DgoApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DgoApplication.class, args);
        System.out.println("cargado");
    }
    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public void run(String... args) throws Exception {
        Usuario user1 = new Usuario("diego", "ardila","d@gmail.com","calle");
        usuarioRepository.save(user1);
        Usuario user2 = new Usuario("roberto", "ardila","r@gmail.com","calle");
        usuarioRepository.save(user2);
        Usuario user3 = new Usuario("floro", "ardila","f@gmail.com","calle");
        usuarioRepository.save(user3);
        Usuario user4 = new Usuario("isabel", "ardila","isa@gmail.com","calle");
        usuarioRepository.save(user4);



    }
}
