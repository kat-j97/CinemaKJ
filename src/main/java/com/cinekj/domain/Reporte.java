
package com.cinekj.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //Permite crear los Set and Getters
@Entity
@Table(name="reporte")
public class Reporte implements Serializable{
    
    private static final long serialVersionUID = 1L; 
    
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name="id_reporte")
    private Long idReporte; 
    private Long idSala;
    private String descripcion;

    public Reporte() {
    }

    public Reporte(Long idSala, String descripcion) {
        this.idSala = idSala;
        this.descripcion = descripcion;
    }    
}


