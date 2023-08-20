package com.cinekj.service;

import java.util.List;
import com.cinekj.domain.Verificacion;

public interface VerificacionService {

    public List<Verificacion> getVerificaciones();

    public Verificacion getVerificacion(Verificacion verificacion);

    public void save(Verificacion verificacion);

    public void delete(Verificacion verificacion);

}
