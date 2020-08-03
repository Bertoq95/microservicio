package com.microservicio.microservicio.service;

import com.microservicio.microservicio.entity.Beneficio;
import com.microservicio.microservicio.repository.BeneficioRepository;
import lombok.AllArgsConstructor;

import java.util.List;
@AllArgsConstructor
public class BeneficioServiceImpl implements BeneficioService{
    //@Autowired
    private  final BeneficioRepository beneficioRepository;

    @Override
    public List<Beneficio> listAllbeneficios() {
        return beneficioRepository.findAll();
    }

    @Override
    public Beneficio getBeneficio(Long id) {
        return beneficioRepository.findById(id).orElse(null);
    }

    @Override
    public Beneficio deleteBeneficio(Long id) {
        Beneficio beneficioDB = getBeneficio(id);
        if (null == beneficioDB) {
            return null;
        }

        return beneficioRepository.save(beneficioDB);
    }

    @Override
    public Beneficio createBeneficio(Beneficio beneficio) {
        return beneficioRepository.save(beneficio);
    }

    @Override
    public Beneficio updateBeneficio(Beneficio beneficio) {
        Beneficio beneficioDB = getBeneficio(beneficio.getId());
        if (null == beneficioDB) {
            return null;
        }
        return beneficioDB;
    }

    @Override
    public List<Beneficio> findByid(Long id) {
        return null;
    }
}
