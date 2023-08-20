
package com.cinekj.service.impl;

import com.cinekj.dao.ComidaDao;
import com.cinekj.domain.Comida;
import com.cinekj.service.ComidaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ComidaServiceImpl implements ComidaService{
    
    @Autowired 
    private ComidaDao comidaDao;

    @Transactional(readOnly = true) 
    public List<Comida> getComidas() {
        List<Comida> lista = comidaDao.findAll();

        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Comida getComida(Comida comida) {
        return comidaDao.findById(comida.getIdComida()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Comida comida) {
        comidaDao.save(comida);
    }

    @Override
    @Transactional
    public void delete(Comida comida) {
        comidaDao.delete(comida);
    }
    
}