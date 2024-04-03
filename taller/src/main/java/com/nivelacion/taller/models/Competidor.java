package com.nivelacion.taller.models;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "competidor")


public class Competidor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "trofeos")
    private String trofeos;

    @Column(name = "colores")
    private String colores;

    @Column(name = "fecha_baja")
    @DateTimeFormat(pattern = "dd-MM-YYYY HH:mm:ss")
    private LocalDateTime fechaBaja;

    public Competidor(String nombre, String trofeos, String colores, LocalDateTime fecha_baja){
        this.nombre = nombre;
        this.trofeos = trofeos;
        this.colores=colores;
        this.fechaBaja=fecha_baja;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTrofeos() {
        return this.trofeos;
    }

    public void setTrofeos(String trofeos) {
        this.trofeos = trofeos;
    }

    public String getColores() {
        return this.colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public LocalDateTime getFechaBaja() {
        return this.fechaBaja;
    }

    public void setFechaBaja(LocalDateTime fecha_baja) {
        this.fechaBaja = fecha_baja;
    }

}