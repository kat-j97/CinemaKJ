package com.cinekj.service;

import com.cinekj.domain.Empleado;
import java.util.List;

public interface EmpleadoService {

    //Método que retorna la lista de Categoria
    public List<Empleado> getEmpleados(); //Siempre es plural porque devuelve listas
    
    // Se obtiene un Categoria, a partir del id de un categoria
    public Empleado getEmpleado(Empleado empleado);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Empleado empleado);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Empleado empleado);
}
