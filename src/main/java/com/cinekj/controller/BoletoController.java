package com.cinekj.controller;

import com.cinekj.domain.Boleto;
import com.cinekj.service.BoletoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/boleto")
public class BoletoController {
    
    @Autowired
    BoletoService boletoService;
    
    @GetMapping("/boleto")
    public String inicio(Model model) {
      List<Boleto> boletos = boletoService.getBoletos();
            model.addAttribute("boletos", boletos);
            model.addAttribute("totalBoletos", boletos.size());
        return "/empleados/empleadoVerificar";
    }
    
    @GetMapping("/verificar/{idBoleto}")
    public String boletoEliminar(Boleto boleto) {
        boletoService.delete(boleto);
        return "redirect:/boleto/boleto";
    }
    
    @PostMapping("/guardar")
    public String usuarioGuardar(Boleto boleto) {
        boletoService.save(boleto);
        return "/acciones/panel";
    }

    
    
}
