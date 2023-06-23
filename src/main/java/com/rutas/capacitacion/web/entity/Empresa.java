package com.rutas.capacitacion.web.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.envers.Audited;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
@Table(name = "empresa")
@Entity
public class Empresa extends BaseEntity{

    @Column(name = "nit", nullable = false)    
    private Integer nit;

    @Column(name = "razon_social", nullable = false)
    private String razonSocial;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "telefono", nullable = false, length = 10)
    private String telefono;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, targetEntity = Capacitacion.class, cascade = CascadeType.PERSIST)
    @JoinTable(name = "empresa_capacitacion", 
               joinColumns = @JoinColumn(name = "empresa_id"), 
               inverseJoinColumns = @JoinColumn(name = "capacitacion_id"))
    List<Capacitacion> capacitaciones = new ArrayList<>();

}
