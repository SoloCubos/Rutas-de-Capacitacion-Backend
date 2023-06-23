package com.rutas.capacitacion.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rutas.capacitacion.web.entity.Capacitacion;
import com.rutas.capacitacion.web.repository.BaseRepository;
import com.rutas.capacitacion.web.repository.CapacitacionRepository;
import com.rutas.capacitacion.web.service.CapacitacionService;

@Service
public class CapacitacionServiceImpl extends BaseServiceImpl<Capacitacion, Integer> implements CapacitacionService{

    @Autowired
    private CapacitacionRepository capacitacionRepository;

    public CapacitacionServiceImpl(BaseRepository<Capacitacion, Integer> baseRepository) {
        super(baseRepository);
    }

    
    
}
