package daniel.spring_security.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig{
    @Autowired
    private SecurityDataBaseService securityDbService;

    @Autowired
    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(securityDbService).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/").permitAll()
                        .requestMatchers("/login").permitAll() // Permitir acesso sem autenticação a / e /login
                        .requestMatchers("/managers").hasRole("MANAGERS") // Acesso apenas para usuários com a role "MANAGERS"
                        .requestMatchers("/users").hasAnyRole("USERS", "MANAGERS") // Acesso para "USERS" e "MANAGERS"
                        .anyRequest().authenticated() // Todas as outras requisições requerem autenticação
                )
                .formLogin(Customizer.withDefaults()); // Usando autenticação básica HTTP (pode ser ajustado conforme a necessidade)

        return http.build();
    }
    /*
        @Bean
        public InMemoryUserDetailsManager userDetailsService(PasswordEncoder encoder) {
            UserDetails user = User.builder()
                    .username("user")
                    .password(encoder.encode("senha123"))
                    .roles("USERS")
                    .build();

            UserDetails admin = User.builder()
                    .username("admin")
                    .password(encoder.encode("master123"))
                    .roles("MANAGERS")
                    .build();

            return new InMemoryUserDetailsManager(user, admin);
        }
    */
}


