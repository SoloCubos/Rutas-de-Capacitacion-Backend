package com.rutas.capacitacion.web.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.rutas.capacitacion.web.entity.BaseEntity;

@NoRepositoryBean
public interface BaseRepository<E extends BaseEntity, ID extends Serializable> extends JpaRepository<E, ID>{
    
    
}
