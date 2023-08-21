package com.cinekj.service;

import java.util.List;
import com.cinekj.domain.Boleto;

public interface BoletoService {

    public List<Boleto> getBoletos();

    public Boleto getBoleto(Boleto boleto);

    public void save(Boleto boleto);

    public void delete(Boleto boleto);

}
