package com.cinekj.controller;

import com.cinekj.domain.Reporte;
import com.cinekj.service.ReporteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/reporte")
public class ReporteController {
    
    @Autowired
    ReporteService reporteService;
    
    @GetMapping("/empleado")
    public String inicio(Model model) {
      List<Reporte> reportes = reporteService.getReportes();
            model.addAttribute("reportes", reportes);
            model.addAttribute("totalReportes", reportes.size());
        return "/reportes/reporteEmpleado";
    }
    
    @GetMapping("/nuevo")
    public String reporteNuevo(Reporte reporte) {
        return "modificaEmp";
    }


    @PostMapping("/guardar")
    public String reporteGuardar(Reporte reporte) {
        reporteService.save(reporte);
        return "redirect:/reporte/empleado";
    }

 
    @GetMapping("/eliminar/{idReporte}")
    public String reporteEliminar(Reporte reporte) {
        reporteService.delete(reporte);
        return "redirect:/empleado/reporte";
    }

    @GetMapping("/modificar/{idReporte}")
    public String reporteModificar(Reporte reporte, Model model) {
        reporte = reporteService.getReporte(reporte);
        model.addAttribute("reporte", reporte);
        return "modificaEmp";
    }
    
}
