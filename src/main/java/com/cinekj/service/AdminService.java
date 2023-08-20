package com.cinekj.service;

import com.cinekj.domain.Admin;
import java.util.List;


public interface AdminService {
    
   public List<Admin> getAdmins(); 
    public Admin getAdmin(Admin comida);
    public void save(Admin comida);
    public void delete(Admin comida); 
}
