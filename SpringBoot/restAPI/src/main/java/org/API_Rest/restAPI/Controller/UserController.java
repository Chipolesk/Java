package org.API_Rest.restAPI.Controller;

import org.API_Rest.restAPI.handler.BusinessException;
import org.API_Rest.restAPI.model.Users;
import org.API_Rest.restAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping()
    public List<Users> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{username}")
    public ResponseEntity<Users> getOne(@PathVariable("username") String username) {
        Optional<Users> user = Optional.ofNullable(userRepository.findByUsername(username));
        if (user.isEmpty()) {
            throw new BusinessException("Usuário não encontrado: " + username);
        }
        return new ResponseEntity<>(user.get(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id) {
        Optional<Users> user = Optional.ofNullable(userRepository.findById(id));
        if (user.isEmpty()) {
            throw new BusinessException("Usuário não encontrado para exclusão: ID " + id);
        } else {
            userRepository.deleteById(id);
            return new ResponseEntity<>("Usuário deletado com sucesso", HttpStatus.OK);
        }
    }

    @PostMapping()
    public ResponseEntity<String> postUser(@RequestBody Users user) {
        userRepository.save(user);
        return new ResponseEntity<>("Usuário criado com sucesso", HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<String> putUser(@RequestBody Users user) {
        userRepository.save(user);
        return new ResponseEntity<>("Usuário atualizado com sucesso", HttpStatus.OK);
    }
}
