package com.microservicio.informebaja.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                // 1. Deshabilitar CSRF (Indispensable para poder hacer POST, PUT, DELETE desde
                // Postman/Frontend)
                .csrf(AbstractHttpConfigurer::disable)

                // 2. Configurar permisos de rutas
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/dependencia","/dependencia/**").permitAll()
                        .requestMatchers("/ciudad","/ciudad/**","/error").permitAll()

                        // Si estás probando y quieres abrir TODOS tus controladores temporalmente, usa
                        // esto:
                        //.anyRequest().permitAll()

                     // Si quieres que el resto pida autenticación, cambia la línea de arriba por:
                    .anyRequest().authenticated()
                );

        return http.build();

    }

}
