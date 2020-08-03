package com.microservicio.microservicio.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "beneficio.movimiento_saldo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovimientoSaldo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="tbl_beneficio")
    private Long id_beneficio;

    @Temporal(TemporalType.DATE)
    private Date fecha_alta;

    private String usuario;


    private Double monto_presupuestado;
    private Double saldo_reservado;
    private Double saldo_ejecutado;
}
