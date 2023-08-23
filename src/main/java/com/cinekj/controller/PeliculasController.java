
package com.cinekj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PeliculasController {
    
    @RequestMapping("/peliculas")
    public String page(Model model) {
        //model.addAttribute("attribute", "value");
        return "/cartelera/peliculas";
    }
    
}
