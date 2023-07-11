package com.cinekj.service.impl;

import com.cinekj.dao.EmpleadoDao;
import com.cinekj.domain.Empleado;
import com.cinekj.service.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service //Siempre poner esta anotación
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired //Crear una variable sin instancia + conecta a la base de datos
    private EmpleadoDao EmpleadoDao;

    @Override
    @Transactional(readOnly = true) //Springframework (Es unicamente para lectura)
    public List<Empleado> getEmpleados() {
        List<Empleado> lista = EmpleadoDao.findAll();

        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado getEmpleado(Empleado empleado) {
        return EmpleadoDao.findById(empleado.getIdEmpleado()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Empleado empleado) {
        EmpleadoDao.save(empleado);
    }

    @Override
    @Transactional
    public void delete(Empleado empleado) {
        EmpleadoDao.delete(empleado);
    }
}
