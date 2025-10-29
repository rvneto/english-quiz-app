package com.rvneto.englishquizapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuração global de CORS para permitir que o frontend acesse a API.
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Mapeia todos os endpoints da API
        registry.addMapping("/api/v1/**")
                .allowedOrigins(
                        "http://localhost:3000",      // Acesso via porta 3000 (React Dev ou Nginx)
                        "http://localhost",           // Acesso via Nginx (porta 80)
                        "http://localhost:80",        // Acesso via Nginx (explícito)
                        "http://127.0.0.1:3000",      // Fallback
                        "http://127.0.0.1"            // Fallback
                        // REMOVIDA A LINHA: "*" (que causava o erro)
                )
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true); // Permitir credenciais (ex: cookies, se usar no futuro)
    }
}