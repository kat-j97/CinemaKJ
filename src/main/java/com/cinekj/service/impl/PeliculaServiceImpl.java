package com.cinekj.service.impl;

import com.cinekj.dao.PeliculaDao;
import com.cinekj.domain.Pelicula;
import com.cinekj.service.PeliculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PeliculaServiceImpl implements PeliculaService{
    
    @Autowired 
    private PeliculaDao peliculaDao;

    @Transactional(readOnly = true) 
    public List<Pelicula> getPeliculas() {
        List<Pelicula> lista = peliculaDao.findAll();

        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Pelicula getPelicula(Pelicula pelicula) {
        return peliculaDao.findById(pelicula.getIdPelicula()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Pelicula pelicula) {
        peliculaDao.save(pelicula);
    }

    @Override
    @Transactional
    public void delete(Pelicula pelicula) {
        peliculaDao.delete(pelicula);
    }
    
}
