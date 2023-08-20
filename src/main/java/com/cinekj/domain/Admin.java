package com.cinekj.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //Permite crear los Set and Getters
@Entity
@Table(name = "administrador")
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_admin")
    private Long idAdmin;
    private String nombreUsuario;
    private String nombre;
    private String apellidos;
    private int edad;
    private String contrasena;

    public Admin() {
    }

    public Admin(String nombreUsuario, String nombre, String apellidos, int edad, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.contrasena = contrasena;
    }
}
