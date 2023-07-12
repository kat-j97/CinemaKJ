package com.cinekj.service;

import com.cinekj.domain.Empleado;
import java.util.List;

public interface EmpleadoService {

    public List<Empleado> getEmpleados();
    public Empleado getEmpleado(Empleado empleado);
    public void save(Empleado empleado);
    public void delete(Empleado empleado);
}
