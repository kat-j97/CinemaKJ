
package com.cinekj.service;

import com.cinekj.domain.Comida;
import java.util.List;


public interface ComidaService {
    
   public List<Comida> getComidas(); 
    public Comida getComida(Comida comida);
    public void save(Comida comida);
    public void delete(Comida comida); 
}
