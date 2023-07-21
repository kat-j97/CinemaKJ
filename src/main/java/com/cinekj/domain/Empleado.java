
package com.cinekj.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //Permite crear los Set and Getters
@Entity
@Table(name="empleado")
public class Empleado implements Serializable{
    
    private static final long serialVersionUID = 1L; 
    
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name="id_empleado")
    private Long idEmpleado; 
    private String nombre;
    private String apellidos;
    private int edad;
    private String puesto;
    private String contrasena;

    public Empleado() {
    }

    public Empleado(String nombre, String apellidos, int edad, String puesto, String contrasena) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.puesto = puesto;
        this.contrasena = contrasena;
    }     
}


