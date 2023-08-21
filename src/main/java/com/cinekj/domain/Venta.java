package com.cinekj.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "venta")
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Long idVenta;
    private Long idFactura;
    private Long idComida;
    private double precio;
    private int cantidad;
    
    public Venta() {
    }

    public Venta(Long idFactura, Long idComida, double precio, int cantidad) {
        this.idFactura = idFactura;
        this.idComida = idComida;
        this.precio = precio;
        this.cantidad = cantidad;
    }

}
