
package com.cinekj.service.impl;

import com.cinekj.dao.EntradaDao;
import com.cinekj.domain.Entrada;
import com.cinekj.service.EntradaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EntradaServiceImpl implements EntradaService {

    @Autowired
    private EntradaDao entradaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Entrada> getEntradas() {
        List<Entrada> lista = entradaDao.findAll();

        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Entrada getEntrada(Entrada entrada) {
        return entradaDao.findById(entrada.getIdEntrada()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Entrada entrada) {
        entradaDao.save(entrada);
    }

    @Override
    @Transactional
    public void delete(Entrada entrada) {
        entradaDao.delete(entrada);
    }
}
