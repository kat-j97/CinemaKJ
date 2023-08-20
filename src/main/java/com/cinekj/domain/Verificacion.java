package com.cinekj.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //Permite crear los Set and Getters
@Entity
@Table(name="boleto")
public class Verificacion implements Serializable{
    
    private static final long serialVersionUID = 1L; //Version de Serializacion
    //Aqui llamamos los atributos de la tabla vs Java
    @Id //Asie s como sale en la tabla SQL y llamarlo 
    @GeneratedValue( strategy = GenerationType.IDENTITY) //Hay que asignarle una estrategia al ID
    @Column(name="id_boleto")
    private Long idBoleto; //Se transforma en id_Arbol
    private int numero;
    private String nombre;
    private String apellidos;
    private int pelicula;
 
    public Verificacion() {
    }

    public Verificacion(int numero, String nombre, String apellidos, int pelicula) {
        this.numero = numero;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.pelicula = pelicula;
    }
  
}
