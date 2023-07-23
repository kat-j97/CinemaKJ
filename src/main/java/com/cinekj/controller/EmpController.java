package com.cinekj.controller;

import com.cinekj.domain.Empleado;
import com.cinekj.service.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/empleado")
public class EmpController {
    
    @Autowired
    EmpleadoService empleadoService;
    
    @GetMapping("/admin")
    public String inicio(Model model) {
      List<Empleado> empleados = empleadoService.getEmpleados();
            model.addAttribute("empleados", empleados);
            model.addAttribute("totalEmpleados", empleados.size());
        return "/admin/admin-empleado";
    }
    
    @GetMapping("/nuevo")
    public String empleadoNuevo(Empleado empleado) {
        return "/admin/modificaEmp";
    }


    @PostMapping("/guardar")
    public String empleadoGuardar(Empleado empleado) {
        empleadoService.save(empleado);
        return "redirect:/empleado/admin";
    }

 
    @GetMapping("/eliminar/{idEmpleado}")
    public String empleadoEliminar(Empleado empleado) {
        empleadoService.delete(empleado);
        return "redirect:/empleado/admin";
    }

    @GetMapping("/modificar/{idEmpleado}")
    public String empleadoModificar(Empleado empleado, Model model) {
        empleado = empleadoService.getEmpleado(empleado);
        model.addAttribute("empleado", empleado);
        return "/admin/modificaEmp";
    }
    
}
