package com.rutas.capacitacion.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rutas.capacitacion.web.entity.Empresa;
import com.rutas.capacitacion.web.repository.BaseRepository;
import com.rutas.capacitacion.web.repository.EmpresaRepository;
import com.rutas.capacitacion.web.service.EmpresaService;

@Service
public class EmpresaServiceImpl extends BaseServiceImpl<Empresa, Integer> implements EmpresaService{
    
    @Autowired
    private EmpresaRepository empresaRepository;

    public EmpresaServiceImpl(BaseRepository<Empresa, Integer> baseRepository) {
        super(baseRepository);
    }

}
