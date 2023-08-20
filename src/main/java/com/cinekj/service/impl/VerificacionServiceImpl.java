package com.cinekj.service.impl;

import com.cinekj.dao.VerificacionDao;
import com.cinekj.domain.Verificacion;
import com.cinekj.service.VerificacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VerificacionServiceImpl implements VerificacionService{
    
    @Autowired 
    private VerificacionDao verificacionDao;

    @Transactional(readOnly = true) 
    public List<Verificacion> getVerificaciones() {
        List<Verificacion> lista = verificacionDao.findAll();

        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Verificacion getVerificacion(Verificacion verificacion) {
        return verificacionDao.findById(verificacion.getIdBoleto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Verificacion verificacion) {
        verificacionDao.save(verificacion);
    }

    @Override
    @Transactional
    public void delete(Verificacion verificacion) {
        verificacionDao.delete(verificacion);
    }
    
}
