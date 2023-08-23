package com.cinekj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class tusSalasController {

    @RequestMapping("/tusSalas")
    public String page(Model model) {
        return "tusSalas";
    }
}


