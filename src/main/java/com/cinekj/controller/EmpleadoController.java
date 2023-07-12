package com.cinekj.controller;

import com.cinekj.domain.Empleado;
import com.cinekj.service.EmpleadoService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;



@Controller
@Slf4j
@RequestMapping("/empleado")
public class EmpleadoController {
    
    @Autowired
    EmpleadoService empleadoService;
    
    @GetMapping("/listado")
    public String inicio(Model model) {
        List<Empleado> empleados = empleadoService.getEmpleados();
                
        model.addAttribute("empleados", empleados);
        model.addAttribute("totalEmpleados", empleados.size());
        return "/empleado/admin-emp";
    }
    
    @GetMapping("/nuevo")
    public String EmpleadoNuevo(Empleado empleado) {
        return "/empleado/admin-emp";
    }

   /* @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;*/
    
    @PostMapping("/guardar")
    public String empleadoGuardar(Empleado empleado,
            @RequestParam("imagenFile") MultipartFile imagenFile) {        
        empleadoService.save(empleado);
        return "redirect:/empleado/admin-emp";
    }

    @GetMapping("/eliminar/{idEmpleado}")
    public String empleadoEliminar(Empleado empleado) {
        empleadoService.delete(empleado);
        return "redirect:/empleado/admin-emp";
    }

    @GetMapping("/modificar/{idEmpleado}")
    public String empleadoModificar(Empleado empleado, Model model) {
        model.addAttribute("empleado", empleado);
        return "/empleado/admin-emp";
    }

}