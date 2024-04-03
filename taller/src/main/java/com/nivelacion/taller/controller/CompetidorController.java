package com.nivelacion.taller.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nivelacion.taller.dtos.CompetidorDTO;
import com.nivelacion.taller.exceptions.ModelNotFoundException;
import com.nivelacion.taller.models.Competidor;

import com.nivelacion.taller.repository.CompetidorRepository;
import com.nivelacion.taller.services.CompetidorService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1")

public class CompetidorController {

    @Autowired
    private final CompetidorService competidorService;
    @Autowired
    private final CompetidorRepository competidorRepository;
    @GetMapping("/competidor")
    public ResponseEntity<List<Competidor>> getCompetidor() {
        return ResponseEntity.ok().body(competidorService.getCompetidor());
    }

        @PostMapping(value = "/competidor/save")
    public ResponseEntity<?> registerUser(@RequestBody CompetidorDTO competidorDTO)
            throws Exception {
        CompetidorDTO dto = competidorService.registerUserLoginDTO(competidorDTO);// trae nombre, apellido, mail y contrasenia
        CompetidorDTO dtoResponse = new CompetidorDTO(null, null, null, null);
        dtoResponse.setNombre(dto.getNombre());
        dtoResponse.setTrofeos(dto.getTrofeos());
        dtoResponse.setColores(dto.getColores());
        dtoResponse.setFechaBaja(dto.getFechaBaja());
        
        return new ResponseEntity<CompetidorDTO>(dtoResponse, HttpStatus.OK);
    }

    @SuppressWarnings("null")
    @PutMapping("competidor/update/{id}")
    public ResponseEntity<Competidor> updateCompetidor(@PathVariable Long id, @RequestBody CompetidorDTO dto) {
        try {
            // Obtener el competidor de la base de datos
            Competidor competidor = competidorRepository.findById(id)
                    .orElseThrow(() -> new ModelNotFoundException(id, "Competidor"));

            // Actualizar el competidor con la información del DTO
            Competidor competidorActualizado = competidorService.updateCompetidor(competidor, dto);

            // Guardar el competidor actualizado en la base de datos
            competidorRepository.save(competidorActualizado);

            return ResponseEntity.ok(competidorActualizado);
        } catch (ModelNotFoundException e) {
            // Manejar la excepción de modelo no encontrada
            return ResponseEntity.notFound().build(); // O puedes devolver otro tipo de respuesta según tus necesidades
        }
    }


    
}
