package com.cinekj.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Item extends Comida {

    private int cantidad;

    public Item() {
    }

    public Item(Comida comida) {
        super.setIdComida(comida.getIdComida());
        super.setTipoComida(comida.getTipoComida());
        super.setPrecio(comida.getPrecio());
        this.cantidad = 0;
    }
}
