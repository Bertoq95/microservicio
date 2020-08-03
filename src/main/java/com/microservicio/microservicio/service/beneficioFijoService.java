package com.microservicio.microservicio.service;

import com.microservicio.microservicio.entity.beneficioFijo;

import java.util.List;

public interface beneficioFijoService {
    //Lista todos los beneficios fijos
    public List<beneficioFijo> listAllFijos();
    //obtiene el beneficioFijo
    public beneficioFijo getFijo (Long id);
    //borra el beneficioFijo
    public beneficioFijo deleteFijo (Long id);
    //crea un beneficioFijo
    public beneficioFijo createFijo (beneficioFijo fijo);
    //updatea un beneficioFij
    public beneficioFijo updateFijo (beneficioFijo fijo);
}
