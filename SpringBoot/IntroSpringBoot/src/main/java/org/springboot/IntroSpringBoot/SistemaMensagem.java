package org.springboot.IntroSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class SistemaMensagem implements CommandLineRunner {
    @Autowired
    Remetente remetente;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + remetente.getNome()
        + "\n Email: " + remetente.getEmail()
        + "\n Telefones para contato: " + remetente.getTelefones());
    }
}
