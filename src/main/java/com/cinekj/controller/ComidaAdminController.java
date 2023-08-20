
package com.cinekj.controller;

import com.cinekj.domain.Comida;
import com.cinekj.service.ComidaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/comida")
public class ComidaAdminController {
    
    @Autowired
    ComidaService comidaService;
    
    @GetMapping("/admin")
    public String inicio(Model model) {
      List<Comida> comidas = comidaService.getComidas();
            model.addAttribute("comidas", comidas);
            model.addAttribute("totalComidas", comidas.size());
        return "/admin/adminComidas";
    }
    
    @GetMapping("/nuevo")
    public String comidaNuevo(Comida comida) {
        return "/admin/modificaComida";
    }


    @PostMapping("/guardar")
    public String comidaGuardar(Comida comida) {
        comidaService.save(comida);
        return "redirect:/comida/admin";
    }

 
    @GetMapping("/eliminar/{idComida}")
    public String comidaEliminar(Comida comida) {
        comidaService.delete(comida);
        return "redirect:/comida/admin";
    }

    @GetMapping("/modificar/{idComida}")
    public String comidaModificar(Comida comida, Model model) {
        comida = comidaService.getComida(comida);
        model.addAttribute("comida", comida);
        return "/admin/modificaComida";
    }
    
}
