package com.rutas.capacitacion.web.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaRegistroDTO {
  
    private String nit;
    private String razon_social;
    private String direccion;
    private String telefono;
    private String username;
    private String password;
}
