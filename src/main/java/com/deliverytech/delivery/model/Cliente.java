package com.deliverytech.delivery.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private String telefone;
  private String endereco;

  @Column(unique = true)
  private String email;

  @Builder.Default
  private Boolean ativo = true;

  @Builder.Default
  private LocalDateTime dataCriacao = LocalDateTime.now();

  public void inativar() {
    this.ativo = false;
  }

  // Comentário mantido para referência futura
  /*
   * @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
   * private List<Pedido> pedidos;
   */
}