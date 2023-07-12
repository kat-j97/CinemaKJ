
package com.cinekj.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Blob;
import lombok.Data;

@Data //Permite crear los Set and Getters
@Entity
@Table(name="empleado")
public class Empleado implements Serializable{
    
    private static final long serialVersionUID = 1L; //Version de Serializacion
    //Aqui llamamos los atributos de la tabla vs Java
    @Id //Asie s como sale en la tabla SQL y llamarlo 
    @GeneratedValue( strategy = GenerationType.IDENTITY) //Hay que asignarle una estrategia al ID
    @Column(name="id_empleado")
    private Long idEmpleado; //Se transforma en id_Arbol
    private String nombre;
    private String apellidos;
    private int edad;
    private String puesto;
    private Blob contrasena;

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, int edad, String puesto, Blob contrasena) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.puesto = puesto;
        this.contrasena = contrasena;
    }     
}


