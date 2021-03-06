package org.celebino.extras;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;

@Configuration
// Procura por componentes a partir desse pacote.
@ComponentScan(basePackages = "org.celebino")
// Ativa o Spring Data JPA
@EnableJpaRepositories("org.celebino.persistence.dao")
public class Config {

}