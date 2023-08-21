package com.cinekj.service.impl;

import com.cinekj.domain.Boleto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cinekj.dao.BoletoDao;
import com.cinekj.service.BoletoService;

@Service
public class BoletoServiceImpl implements BoletoService{
    
    @Autowired 
    private BoletoDao boletoDao;

    @Transactional(readOnly = true) 
    @Override
    public List<Boleto> getBoletos() {
        List<Boleto> lista = boletoDao.findAll();

        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Boleto getBoleto(Boleto boleto) {
        return boletoDao.findById(boleto.getIdBoleto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Boleto boleto) {
        boletoDao.save(boleto);
    }

    @Override
    @Transactional
    public void delete(Boleto boleto) {
        boletoDao.delete(boleto);
    }
    
}
