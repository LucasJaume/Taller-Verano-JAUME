package com.nivelacion.taller.models;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Table(name = "partido")
public class Partido{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "goles_local")
    private int goles_local;
    public int getGoles_local() {
        return goles_local;
    }
    public void setGoles_local(int goles_local) {
        this.goles_local = goles_local;
    }

    @Column(name = "goles_visitante")
    private int goles_visitante;
    public int getGoles_visitante() {
        return goles_visitante;
    }
    public void setGoles_visitante(int goles_visitante) {
        this.goles_visitante = goles_visitante;
    }

    @Column(name = "fecha_realizacion")
    @DateTimeFormat (pattern = "dd-MM-YYY HH_mm_ss")
    private LocalDateTime fecha_realizacion;
    public LocalDateTime getFecha_realizacion() {
        return fecha_realizacion;
    }
    public void setFecha_realizacion(LocalDateTime fecha_realizacion) {
        this.fecha_realizacion = fecha_realizacion;
    }
    @Column(name = "fecha_baja")
    @DateTimeFormat (pattern = "dd-MM-YYY HH_mm_ss")
    private LocalDateTime fecha_baja;
    public LocalDateTime getFecha_baja() {
        return fecha_baja;
    }
    public void setFecha_baja(LocalDateTime fecha_baja) {
        this.fecha_baja = fecha_baja;
    }
    
    
    



}
