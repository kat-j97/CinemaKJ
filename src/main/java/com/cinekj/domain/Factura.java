package com.cinekj.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import lombok.Data;

@Data
@Entity
@Table(name = "factura")
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Long idFactura;
    private Date fecha;
    private double total;
    private int estado;

    public Factura() {
    }

    public Factura(Date fecha, double total, int estado) {
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

}
