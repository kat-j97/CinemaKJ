package com.cinekj.service;

import com.cinekj.domain.Pelicula;
import java.util.List;


public interface PeliculaService {
    
   public List<Pelicula> getPeliculas(); 
    public Pelicula getPelicula(Pelicula pelicula);
    public void save(Pelicula pelicula);
    public void delete(Pelicula pelicula); 
}
