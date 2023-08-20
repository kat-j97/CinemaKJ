
package com.cinekj.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //Permite crear los Set and Getters
@Entity
@Table(name = "comida")
public class Comida implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comida")
    private Long idComida;
    private String tipoComida;
    private double precio;

    public Comida() {
    }

    public Comida(String tipoComida, double precio) {
        this.tipoComida = tipoComida;
        this.precio = precio;
    }

}
