package com.deliverytech.delivery.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import java.time.LocalDateTime;

// Define the Role enum if it does not exist elsewhere
enum Role {
    ADMIN,
    USER
}

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;
    private String senha;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Role role;
    private Boolean ativo = true;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private Long restauranteId;
}