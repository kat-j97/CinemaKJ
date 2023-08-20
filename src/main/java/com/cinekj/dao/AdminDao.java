package com.cinekj.dao;

import com.cinekj.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<Admin, Long> {

}
