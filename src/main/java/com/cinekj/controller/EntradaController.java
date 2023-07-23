package com.cinekj.controller;


import com.cinekj.domain.Entrada;
import com.cinekj.service.EntradaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/entrada")
public class EntradaController {

    @Autowired
    EntradaService entradaService;

    @GetMapping("/adminEntrada")
    public String inicio(Model model) {
        List<Entrada> entradas = entradaService.getEntradas();
        model.addAttribute("entradas", entradas);
        model.addAttribute("totalEntradas", entradas.size());
        return "admin/admin-entrada";
    }

    @GetMapping("/nuevo")
    public String entradaNuevo(Entrada entrada) {
        return "admin/modificaEntrada";
    }

    @PostMapping("/guardar")
    public String entradaGuardar(Entrada entrada) {
        entradaService.save(entrada);
        return "redirect:/entrada/adminEntrada";
    }

    @GetMapping("/eliminar/{idEntrada}")
    public String entradaEliminar(Entrada entrada) {
        entradaService.delete(entrada);
        return "redirect:/entrada/adminEntrada";
    }

    @GetMapping("/modificar/{idEntrada}")
    public String entradaModificar(Entrada entrada, Model model) {
        entrada = entradaService.getEntrada(entrada);
        model.addAttribute("entrada", entrada);
        return "admin/modificaEntrada";
    }
}
