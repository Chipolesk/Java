package org.daniel.introDBA;

import org.daniel.introDBA.model.User;
import org.daniel.introDBA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("daniel");
        user.setUserName("champs");
        user.setPassword("champsDaniel");

        repository.save(user);


        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
