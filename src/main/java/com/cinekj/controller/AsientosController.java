package com.cinekj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AsientosController {
    
    @RequestMapping("/asientos")
    public String page(Model model) {
        //model.addAttribute("attribute", "value");
        return "asientos";
    }
    
}
