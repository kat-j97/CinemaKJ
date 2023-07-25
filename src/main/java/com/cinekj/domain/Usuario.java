
package com.cinekj.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;
    private String usuario;
    private String correo;
    private String contrasena;
    private String nombre;
    private String apellidos;
    private int edad;

    public Usuario() {
    }

    public Usuario(String usuario, String correo, String contrasena, String nombre, String apellidos, int edad) {
        this.usuario = usuario;
        this.correo = correo;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

}
