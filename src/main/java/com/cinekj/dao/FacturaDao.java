package com.cinekj.dao;

import com.cinekj.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FacturaDao  extends JpaRepository <Factura,Long>{
    
}
