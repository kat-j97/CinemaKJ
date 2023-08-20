package com.cinekj.controller;

import com.cinekj.domain.Pelicula;
import com.cinekj.service.PeliculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/pelicula")
public class PeliculaAdminController {
    
    @Autowired
    PeliculaService peliculaService;
    
    @GetMapping("/admin")
    public String inicio(Model model) {
      List<Pelicula> peliculas = peliculaService.getPeliculas();
            model.addAttribute("peliculas", peliculas);
            model.addAttribute("totalPeliculas", peliculas.size());
        return "/admin/adminPelicula";
    }
    
    @GetMapping("/nuevo")
    public String peliculaNuevo(Pelicula pelicula) {
        return "/admin/modificaPelicula";
    }


    @PostMapping("/guardar")
    public String peliculaGuardar(Pelicula pelicula) {
        peliculaService.save(pelicula);
        return "redirect:/pelicula/admin";
    }

 
    @GetMapping("/eliminar/{idPelicula}")
    public String peliculaEliminar(Pelicula pelicula) {
        peliculaService.delete(pelicula);
        return "redirect:/pelicula/admin";
    }

    @GetMapping("/modificar/{idPelicula}")
    public String peliculaModificar(Pelicula pelicula, Model model) {
        pelicula = peliculaService.getPelicula(pelicula);
        model.addAttribute("pelicula", pelicula);
        return "/admin/modificaPelicula";
    }
    
}
