package com.nivelacion.taller.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nivelacion.taller.models.Competidor;


public interface CompetidorRepository extends JpaRepository<Competidor, Long>{
    
}
