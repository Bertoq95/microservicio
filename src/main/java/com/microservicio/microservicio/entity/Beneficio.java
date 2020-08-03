package com.microservicio.microservicio.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "beneficio.beneficio")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beneficio {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String usuario;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaExp;

    private double montoMinimo;
    private double montoDescuento;
    private double montoMaximo;
    private double porcentajeDescuento;
    private double presupuesto;
    private int cantidadItems;
    private String tipo;
    private String estado;
    private String nombre;
    private String descripcion;
    private double saldoDisponible;
    private long codigoBeneficio;
    private String campania;
}
