package com.cinekj.controller;

import com.cinekj.domain.Admin;
import com.cinekj.service.AdminService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class AdminController {
    
    @Autowired
    AdminService adminService;
    
    @GetMapping("/admin")
    public String inicio(Model model) {
      List<Admin> admins = adminService.getAdmins();
            model.addAttribute("admins", admins);
            model.addAttribute("totalAdmins", admins.size());
        return "/admin/adminPerfiles";
    }
    
    @GetMapping("/nuevo")
    public String adminNuevo(Admin admin) {
        return "/admin/modificaAdmin";
    }


    @PostMapping("/guardar")
    public String adminGuardar(Admin admin) {
        adminService.save(admin);
        return "redirect:/admin/admin";
    }

 
    @GetMapping("/eliminar/{idAdmin}")
    public String adminEliminar(Admin admin) {
        adminService.delete(admin);
        return "redirect:/admin/admin";
    }

    @GetMapping("/modificar/{idAdmin}")
    public String adminModificar(Admin admin, Model model) {
        admin = adminService.getAdmin(admin);
        model.addAttribute("admin", admin);
        return "/admin/modificaAdmin";
    }
    
}
