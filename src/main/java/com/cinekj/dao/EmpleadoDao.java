
package com.cinekj.dao;

import com.cinekj.domain.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpleadoDao extends JpaRepository<Empleado,Long>{
    
}
