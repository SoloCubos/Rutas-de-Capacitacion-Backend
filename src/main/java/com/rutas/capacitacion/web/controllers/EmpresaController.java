package com.rutas.capacitacion.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rutas.capacitacion.web.entity.Empresa;
import com.rutas.capacitacion.web.service.impl.EmpresaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/empresas")
public class EmpresaController extends BaseControllerImpl<Empresa, EmpresaServiceImpl>{

    @Autowired
    private EmpresaServiceImpl empresaService;
    
}
