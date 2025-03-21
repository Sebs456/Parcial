package com.example.biblioteca;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.biblioteca")
public class AppConfig {
}
/**
 * @Component: Se usa para marcar una clase como un componente de Spring.
 * Ejemplos: @Service, @Repository, @Controller.
 *
 * @Configuration: Se usa para definir clases de configuración que contienen
 * métodos anotados con @Bean. Estas clases son procesadas por Spring para
 * generar beans.
 */