package daniel.desafioProjeto;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = {@Server(url = "/", description = "DEFAULT SERVER URL")})
@SpringBootApplication
public class DesafioProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioProjetoApplication.class, args);
	}

}
