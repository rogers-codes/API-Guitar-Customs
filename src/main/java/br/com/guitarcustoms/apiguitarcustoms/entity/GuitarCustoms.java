package br.com.guitarcustoms.apiguitarcustoms.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Length;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "guitarra")
@Getter @Setter
public class GuitarCustoms {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(length = 50, nullable = false)
    private String modelo;
    @Column(length = 50,nullable = false)
    private String marca;
    @Column(nullable = false)
    private BigDecimal valor;
    @Column(length = 10,nullable = false)
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




