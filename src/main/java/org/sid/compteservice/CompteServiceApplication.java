package org.sid.compteservice;

import org.sid.compteservice.entities.Compte;
import org.sid.compteservice.enums.TypeCompe;
import org.sid.compteservice.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class CompteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompteServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CompteRepository compteRepository){
        return args->{
            compteRepository.save(new Compte(null,90870,new Date(), TypeCompe.COURANT));
            compteRepository.save(new Compte(null,74945,new Date(), TypeCompe.EPARGNE));
            compteRepository.save(new Compte(null,90,new Date(), TypeCompe.COURANT));
            compteRepository.findAll().forEach(cp->{
                System.out.println(cp.getType());
                System.out.println(cp.getSolde());
            });
        };
    }
}
