package com.cinekj.dao;

import com.cinekj.domain.Comida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComidaDao extends JpaRepository<Comida, Long> {

}
