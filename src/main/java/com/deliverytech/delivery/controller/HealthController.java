package com.deliverytech.delivery.controller;

//  Implementar endpoint /health que retorna status da aplicação
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
            "status", "UP",
            "timestamp", LocalDateTime.now().toString(),
            "service", "Delivery API",
            "javaVersion", System.getProperty("java.version")
        );
    }
    //  Implementar endpoint /info que retorna status da aplicação
    @GetMapping("/info")
    public AppInfo info() {
      return new AppInfo(
          "Delivery Tech API",
          "1.0.0",
          "Alan Gonçalves",
          "JDK 21",
          "Spring Boot 3.2.x");
    }
    
        // Record para demonstrar recurso do Java 14+ (disponível no JDK 21)
    public record AppInfo(
        String application,
        String version,
        String developer,
        String javaVersion,
        String framework
    ) {}
}
