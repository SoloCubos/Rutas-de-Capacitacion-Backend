package com.rutas.capacitacion.web.service.impl;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rutas.capacitacion.web.entity.Empresa;
import com.rutas.capacitacion.web.repository.EmpresaRepository;

@Service
public class UserDetailsServiceImlp implements UserDetailsService{

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Empresa usuario = empresaRepository.findByUsername(username)
                                                   .orElseThrow(() -> new UsernameNotFoundException("El usuario " +  username + " no Existe."));
        

        return new User(usuario.getUsername(), usuario.getPassword(), Collections.emptyList());
    }
    
}
