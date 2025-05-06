package daniel.desafioProjeto.domain.service;

import daniel.desafioProjeto.domain.model.User;

import java.util.Optional;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
