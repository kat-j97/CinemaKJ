package com.cinekj.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //Permite crear los Set and Getters
@Entity
@Table(name = "pelicula")
public class Pelicula implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula")
    private Long idPelicula;
    private String nombrePelicula;
    private String descripcion;
    private String calificacion;
   

    public Pelicula() {
    }

    public Pelicula(String nombrePelicula, String descripcion, String calificacion) {
        this.nombrePelicula = nombrePelicula;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
    }

    

}
