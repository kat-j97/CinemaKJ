package com.cinekj.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //Permite crear los Set and Getters
@Entity
@Table(name = "entrada")
public class Entrada implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrada")
    private Long idEntrada;
    private double precio;
    private String tipo;

    public Entrada() {
    }

    public Entrada(double precio, String tipo) {
        this.precio = precio;
        this.tipo = tipo;
    }

}
