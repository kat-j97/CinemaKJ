package com.cinekj.service.impl;

import com.cinekj.dao.AdminDao;
import com.cinekj.domain.Admin;
import com.cinekj.service.AdminService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminServiceImpl implements AdminService{
    
    @Autowired 
    private AdminDao adminDao;

    @Transactional(readOnly = true) 
    public List<Admin> getAdmins() {
        List<Admin> lista = adminDao.findAll();

        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Admin getAdmin(Admin admin) {
        return adminDao.findById(admin.getIdAdmin()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Admin admin) {
        adminDao.save(admin);
    }

    @Override
    @Transactional
    public void delete(Admin admin) {
        adminDao.delete(admin);
    }
    
}
