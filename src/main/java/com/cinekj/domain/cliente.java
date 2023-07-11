package com.cinekj.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //Permite crear los Set and Getters
@Entity
@Table(name="cliente")
public class cliente implements Serializable{
    
    private static final long serialVersionUID = 1L; //Version de Serializacion
    //Aqui llamamos los atributos de la tabla vs Java
    @Id //Asie s como sale en la tabla SQL y llamarlo 
    @GeneratedValue( strategy = GenerationType.IDENTITY) //Hay que asignarle una estrategia al ID
    @Column(name="id_cliente")
    private Long idCliente; //Se transforma en id_Arbol
    private String nombreUsuario;
    private String nombre;
    private String apellidos;
    private int edad;
    private String contrasena;

    public cliente() {
    }

    public cliente(String nombreUsuario, String nombre, String apellidos, int edad, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.contrasena = contrasena;
    }   
}
