package com.cinekj.service;

import com.cinekj.domain.Reporte;
import java.util.List;

public interface ReporteService {

    
    public List<Reporte> getReportes(); 
    public Reporte getReporte(Reporte reporte);
    public void save(Reporte reporte);
    public void delete(Reporte reporte);
}
