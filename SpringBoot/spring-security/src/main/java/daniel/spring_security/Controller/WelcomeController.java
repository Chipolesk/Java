package daniel.spring_security.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcome(){
        return "BEM VINDO À MINHA APLICAÇÃO SPRING BOOT WEB API";
    }
    @GetMapping("/users")
    @PreAuthorize("hasAnyRole('MANAGERS','USERS')")
    public String users(){
        return "AUTHORIZED USER";
    }

    @GetMapping("/managers")
    @PreAuthorize("hasRole('MANAGERS')")
    public String manager(){
        return "AUTHORIZED MANAGER";
    }
}
