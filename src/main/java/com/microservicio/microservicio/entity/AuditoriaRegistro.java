package com.microservicio.microservicio.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "general.auditoria_registro")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditoriaRegistro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "benficioFijo", referencedColumnName = "id")
    private  Long id_beneficio_fijo;

    private String estado_beneficio;
    private String registro_baja;


}
