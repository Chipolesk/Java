package daniel.desafioProjeto.domain.service.implement;

import daniel.desafioProjeto.domain.model.User;
import daniel.desafioProjeto.domain.repository.UserRepository;
import daniel.desafioProjeto.domain.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("THIS ACCOUNT NUMBER ALREADY EXISTS");
        }
        return userRepository.save(userToCreate);
    }
}
