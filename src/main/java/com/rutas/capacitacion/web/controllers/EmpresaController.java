package com.rutas.capacitacion.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rutas.capacitacion.web.DTO.EmpresaRegistroDTO;
import com.rutas.capacitacion.web.entity.Empresa;
import com.rutas.capacitacion.web.security.jwt.JwtUtils;
import com.rutas.capacitacion.web.service.impl.EmpresaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/empresas")
public class EmpresaController extends BaseControllerImpl<Empresa, EmpresaServiceImpl>{

    @Autowired
    private EmpresaServiceImpl empresaService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtils jwtUtils;

    @Override
    public ResponseEntity<?> save(Empresa entity) {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body("{\"error\":\"Error 69, Prohibido.\"}");
    }
    
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody EmpresaRegistroDTO empresaRegistroDTO){
        try {
            Empresa empresa = Empresa.builder()
                                     .nit(empresaRegistroDTO.getNit())
                                     .razon_social(empresaRegistroDTO.getRazon_social())
                                     .direccion(empresaRegistroDTO.getDireccion())
                                     .telefono(empresaRegistroDTO.getTelefono())
                                     .username(empresaRegistroDTO.getUsername())
                                     .password(passwordEncoder.encode(empresaRegistroDTO.getPassword()))
                                     .build();

            return ResponseEntity.status(HttpStatus.OK).body(servicio.save(empresa));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error 69, Por favor intente mas tarde: " + e + " .\"}");
        }
    }
}
