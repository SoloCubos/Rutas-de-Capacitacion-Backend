package com.rutas.capacitacion.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rutas.capacitacion.web.entity.Capacitacion;
import com.rutas.capacitacion.web.service.impl.CapacitacionServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/capacitaciones")
public class CapacitacionController extends BaseControllerImpl<Capacitacion, CapacitacionServiceImpl>{
    
    @Autowired
    private CapacitacionServiceImpl capacitacionService;
}
