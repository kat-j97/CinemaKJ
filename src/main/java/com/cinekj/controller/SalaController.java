package com.cinekj.controller;

import com.cinekj.domain.Sala;
import com.cinekj.service.SalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/sala")
public class SalaController {
    
    @Autowired
    SalaService salaService;
    
    @GetMapping("/admin")
    public String inicio(Model model) {
      List<Sala> salas = salaService.getSalas();
            model.addAttribute("salas", salas);
            model.addAttribute("totalSalas", salas.size());
        return "/admin/adminSala";
    }
    
    @GetMapping("/nuevo")
    public String salaNuevo(Sala sala) {
        return "/admin/modificaSala";
    }


    @PostMapping("/guardar")
    public String salaGuardar(Sala sala) {
        salaService.save(sala);
        return "redirect:/sala/admin";
    }

 
    @GetMapping("/eliminar/{idSala}")
    public String salaEliminar(Sala sala) {
        salaService.delete(sala);
        return "redirect:/sala/admin";
    }

    @GetMapping("/modificar/{idSala}")
    public String salaModificar(Sala sala, Model model) {
        sala = salaService.getSala(sala);
        model.addAttribute("sala", sala);
        return "/admin/modificaSala";
    }
    
}
