package mintic.misiontic.usa.ciclo3.grupo5.equipo2.SistemaHotelesAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SistemaHotelesApiApplication /*extends WebSecurityConfigurerAdapter*/ {

    public static void main(String[] args) {
        SpringApplication.run(SistemaHotelesApiApplication.class, args);
    }
    /*
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(a -> a
                .antMatchers("/", "/css/**", "/js/**", "/img/**", "/slick/**", "/webfonts/**", "/error", "/api/**").permitAll()
                .anyRequest().authenticated()
                )
                .exceptionHandling(e -> e
                .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
                )
                .oauth2Login();
        http.cors().and().csrf().disable();
    }

    @GetMapping("/user")
    public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
        return Collections.singletonMap("name", principal.getAttribute("name"));
    }*/
}
    
