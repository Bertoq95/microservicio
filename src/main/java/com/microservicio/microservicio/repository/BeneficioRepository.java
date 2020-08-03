package com.microservicio.microservicio.repository;


import com.microservicio.microservicio.entity.Beneficio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeneficioRepository extends JpaRepository<Beneficio,Long> {

    public List<Beneficio> findById(long id);
}
