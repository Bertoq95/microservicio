package com.microservicio.microservicio.service;

import com.microservicio.microservicio.entity.Beneficio;

import java.util.List;

public interface BeneficioService {
    public List<Beneficio> listAllbeneficios();
    public Beneficio getBeneficio (Long id);
    public Beneficio deleteBeneficio (Long id);
    public Beneficio createBeneficio (Beneficio beneficio);
    public Beneficio updateBeneficio (Beneficio beneficio);
    public List<Beneficio> findByid(Long id);
}
