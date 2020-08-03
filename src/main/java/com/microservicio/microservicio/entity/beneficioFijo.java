package com.microservicio.microservicio.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "beneficio.fijo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class beneficioFijo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;

    @ManyToOne
    @JoinColumn(name="tbl_beneficio")
    private Long id_beneficio;

    @Temporal(TemporalType.DATE)
    private Date fechaalta;

    private String usuario;

    @Temporal(TemporalType.DATE)
    private Date fecha_expiracion;

    private Long secuencia;
    private Long cuponcodigo;
    private String estado;
    private Long token;
    private Double monto_descuento;
}
