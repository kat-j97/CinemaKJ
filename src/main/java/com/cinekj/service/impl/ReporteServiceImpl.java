package com.cinekj.service.impl;

import com.cinekj.dao.ReporteDao;
import com.cinekj.domain.Reporte;
import com.cinekj.service.ReporteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReporteServiceImpl implements ReporteService {

    @Autowired 
    private ReporteDao reporteDao;

    @Override
    @Transactional(readOnly = true) 
    public List<Reporte> getReportes() {
        List<Reporte> lista = reporteDao.findAll();

        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Reporte getReporte(Reporte reporte) {
        return reporteDao.findById(reporte.getIdReporte()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Reporte reporte) {
        reporteDao.save(reporte);
    }

    @Override
    @Transactional
    public void delete(Reporte reporte) {
        reporteDao.delete(reporte);
    }
}
