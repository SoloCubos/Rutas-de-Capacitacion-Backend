package com.rutas.capacitacion.web.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rutas.capacitacion.web.entity.Empresa;

@Repository
public interface EmpresaRepository extends BaseRepository<Empresa, Integer>{

    Optional<Empresa> findByUsername(String username);

    @Query(value = "Select from empresa where username = :username", nativeQuery = true)
    Optional<Empresa> getRazonSocial(@Param("username") String username);
}
    

