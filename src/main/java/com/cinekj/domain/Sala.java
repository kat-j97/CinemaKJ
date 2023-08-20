package com.cinekj.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //Permite crear los Set and Getters
@Entity
@Table(name = "sala")
public class Sala implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sala")
    private Long idSala;
    private int numsala;
    private int estado;
    private int peliculaid;
    private int tandaid;
    
    
    public Sala() {
    }

    public Sala(int numsala, int estado, int peliculaid, int tandaid) {
        this.numsala = numsala;
        this.estado = estado;
        this.peliculaid = peliculaid;
        this.tandaid = tandaid;
    }
        
}