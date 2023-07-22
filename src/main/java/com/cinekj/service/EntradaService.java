package com.cinekj.service;

import com.cinekj.domain.Entrada;
import java.util.List;

public interface EntradaService {

    public List<Entrada> getEntradas();
    public Entrada getEntrada(Entrada entrada);
    public void save(Entrada entrada);
    public void delete(Entrada entrada);

}
