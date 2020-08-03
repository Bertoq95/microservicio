package com.microservicio.microservicio.repository;


import com.microservicio.microservicio.entity.beneficioFijo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface beneficioFijoRepository extends JpaRepository<beneficioFijo, Long> {

    public List<beneficioFijo> findAllByBeneficioId(long id);
    public void deleteAllByBeneficioId(Long beneficioId);
}
