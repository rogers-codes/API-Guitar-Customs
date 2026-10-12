package br.com.guitarcustoms.apiguitarcustoms.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "guitarra")
@Getter @Setter
public class GuitarCustoms {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String modelo;
    private String marca;
    private BigDecimal valor;
    private String cor;

    @Override
    public String toString() {
        return "GuitarCustoms{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", valor=" + valor +
                ", cor='" + cor + '\'' +
                ", id=" + id +
                '}';
    }
}




