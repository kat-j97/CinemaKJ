package com.cinekj.service.impl;

import com.cinekj.dao.SalaDao;
import com.cinekj.domain.Sala;
import com.cinekj.service.SalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SalaServiceImpl implements SalaService{
    
    @Autowired 
    private SalaDao salaDao;

    @Transactional(readOnly = true) 
    public List<Sala> getSalas() {
        List<Sala> lista = salaDao.findAll();

        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Sala getSala(Sala sala) {
        return salaDao.findById(sala.getIdSala()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Sala sala) {
        salaDao.save(sala);
    }

    @Override
    @Transactional
    public void delete(Sala sala) {
        salaDao.delete(sala);
    }
    
}
