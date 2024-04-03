package com.nivelacion.taller.dtos;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class CompetidorDTO {
    
    private Long id;

    @NotNull (message = "Ingrese un nombre")
    @Size(min = 1)
    private String nombre;

    @NotNull(message = "ingrese un color")
    @Size(min = 1)
    private String color;

    @NotNull(message = "ingrese una fecha de baja")
    @Size(min = 1)
    private LocalDateTime fechaBaja;

    public CompetidorDTO(Long id, @NotNull(message = "Ingrese un nombre") @Size(min = 1) String nombre,
            @NotNull(message = "ingrese un color") @Size(min = 1) String color,
            @NotNull(message = "ingrese una fecha de baja") @Size(min = 1) LocalDateTime fechaBaja) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.fechaBaja = fechaBaja;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColores() {
        return color;
    }

    public void setColores(String color) {
        this.color = color;
    }

    public LocalDateTime getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDateTime fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public Object getTrofeos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTrofeos'");
    }

    public void setTrofeos(Object trofeos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTrofeos'");
    }
    
    
}
