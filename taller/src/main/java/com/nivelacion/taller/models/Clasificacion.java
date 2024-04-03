package com.nivelacion.taller.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

public class Clasificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name= "nro_empatados")
    private int nro_empatados;

    @Column(name="nro_ganados")
    private int nro_ganados;

    @Column(name = "nro_perdidos")
    private int nro_perdidos;

    @Column(name = "fecha_baja")
    @DateTimeFormat (pattern = "dd-MM-YYY HH_mm_ss")
    private LocalDateTime fecha_baja;

    public int getNro_empatados() {
        return nro_empatados;
    }
    public void setNro_empatados(int nro_empatados) {
        this.nro_empatados = nro_empatados;
    }
    public int getNro_ganados() {
        return nro_ganados;
    }
    public void setNro_ganados(int nro_ganados) {
        this.nro_ganados = nro_ganados;
    }
    public int getNro_perdidos() {
        return nro_perdidos;
    }
    public void setNro_perdidos(int nro_perdidos) {
        this.nro_perdidos = nro_perdidos;
    }
    public LocalDateTime getFecha_baja() {
        return fecha_baja;
    }
    public void setFecha_baja(LocalDateTime fecha_baja) {
        this.fecha_baja = fecha_baja;
    }

}