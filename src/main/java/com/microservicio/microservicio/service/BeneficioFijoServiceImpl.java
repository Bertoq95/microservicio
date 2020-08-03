package com.microservicio.microservicio.service;

import com.microservicio.microservicio.entity.beneficioFijo;
import com.microservicio.microservicio.repository.beneficioFijoRepository;
import lombok.AllArgsConstructor;

import java.util.List;
@AllArgsConstructor
public class BeneficioFijoServiceImpl implements beneficioFijoService {
    //@Autowired
    private final beneficioFijoRepository beneficiofijoRepository;

    @Override
    public List<beneficioFijo> listAllFijos() {
        return beneficiofijoRepository.findAll();
    }

    @Override
    public beneficioFijo getFijo(Long id) {
        return beneficiofijoRepository.findById(id).orElse(null);
    }

    @Override
    public beneficioFijo deleteFijo(Long id) {
        beneficioFijo fijoDB = getFijo(id);
        if (null == fijoDB){
            return null;
        }
        return beneficiofijoRepository.save(fijoDB);
    }

    @Override
    public beneficioFijo createFijo(beneficioFijo fijo) {
        return beneficiofijoRepository.save(fijo);
    }

    @Override
    public beneficioFijo updateFijo(beneficioFijo fijo) {
        return null;
    }
}


