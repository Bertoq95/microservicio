package com.microservicio.microservicio.controller;

import com.microservicio.microservicio.entity.Beneficio;
import com.microservicio.microservicio.service.BeneficioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/Beneficio")
public class BeneficioController {

    @Autowired
    private BeneficioService beneficioService;

    @GetMapping(value="/{id}")
    public ResponseEntity<Beneficio> getBeneficio(Long id){
        Beneficio beneficio = beneficioService.getBeneficio(id);
        if (beneficio == null){
            return ResponseEntity.notFound().build();

        }
        return ResponseEntity.ok(beneficio);

    }




    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Beneficio> delete (@PathVariable("id") Long id){
        Beneficio beneficioDelete = beneficioService.deleteBeneficio(id);

        if (beneficioDelete == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(beneficioDelete);
    }


}

