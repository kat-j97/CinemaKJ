package com.cinekj.service;

import com.cinekj.domain.Sala;
import java.util.List;


public interface SalaService {
    
   public List<Sala> getSalas(); 
    public Sala getSala(Sala sala);
    public void save(Sala sala);
    public void delete(Sala sala); 
}
