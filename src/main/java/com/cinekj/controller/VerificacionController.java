package com.cinekj.controller;

import com.cinekj.domain.Verificacion;
import com.cinekj.service.VerificacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/boleto")
public class VerificacionController {
   
    
    @Autowired
    VerificacionService verificacionService;
    
    @GetMapping("/boleto")
    public String inicio(Model model) {
      List<Verificacion> verificaciones = verificacionService.getVerificaciones();
            model.addAttribute("verificacions", verificaciones);
            model.addAttribute("totalVerificacions", verificaciones.size());
        return "/empleados/empleadoVerificar";
    }

    @GetMapping("/verificar/{idBoleto}")
    public String verificacionVerificar(Verificacion verificacion) {
        verificacionService.delete(verificacion);
        return "redirect:/boleto/boleto";
    }
}
