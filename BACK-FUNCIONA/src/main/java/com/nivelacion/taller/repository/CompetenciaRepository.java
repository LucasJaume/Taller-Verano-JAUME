package com.nivelacion.taller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nivelacion.taller.models.Competencia;

@Repository
public interface CompetenciaRepository extends JpaRepository<Competencia, Long> {

}
