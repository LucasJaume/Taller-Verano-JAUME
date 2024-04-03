package com.nivelacion.taller.services;

import java.util.List;



import com.nivelacion.taller.dtos.CompetidorDTO;
import com.nivelacion.taller.models.Competidor;



public interface CompetidorService {
    
    Competidor getCompetidor (String nombre);

    List<Competidor> getCompetidor();

    Competidor saveCompetidor (Competidor competidor);

    Competidor updateCompetidor (Competidor competidor, CompetidorDTO competidorDTO);

    


    CompetidorDTO registerUserLoginDTO(CompetidorDTO competidorDTO);
}
