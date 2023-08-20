package com.cinekj.dao;

import com.cinekj.domain.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaDao extends JpaRepository<Pelicula, Long> {

}
