package com.cinekj.controller;

import com.cinekj.domain.Usuario;
import com.cinekj.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/registro")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping("/usuario")
    public String inicio(Model model) {
      List<Usuario> usuarios = usuarioService.getUsuarios();
            model.addAttribute("usuarios", usuarios);
            model.addAttribute("totalUsuarios", usuarios.size());
        return "/registro/registroGeneral";
    }
    
    @PostMapping("/guardar")
    public String usuarioGuardar(Usuario usuario) {
        usuarioService.save(usuario);
        return "redirect:/registro/usuario";
    }
    
 
    
}
