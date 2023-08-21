package com.cinekj.controller;

import com.cinekj.service.ComidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

 

@Controller
public class TempController {

    @Autowired
    ComidaService comidaService;

    @RequestMapping("/venta")
    public String page(Model model) { 
        var listaComidas = comidaService.getComidas();
        model.addAttribute("comidas", listaComidas);
        return "/empleados/ventaComidas";
    }

}