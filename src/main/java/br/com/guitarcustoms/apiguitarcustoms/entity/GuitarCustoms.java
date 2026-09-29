package br.com.guitarcustoms.apiguitarcustoms.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Audited;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "guitarra")
@Getter @Setter
public class GuitarCustoms {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private BigDecimal valor;
    private String modelo;
    private String marca;
    private String cor;
}


