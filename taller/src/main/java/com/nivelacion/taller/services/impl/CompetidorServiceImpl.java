package com.nivelacion.taller.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nivelacion.taller.dtos.CompetidorDTO;
import com.nivelacion.taller.models.Competidor;
import com.nivelacion.taller.services.CompetidorService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Primary
@RequiredArgsConstructor
@Transactional
@Slf4j 
public class CompetidorServiceImpl implements CompetidorService, UserDetailsService{

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Competidor getCompetidor(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCompetidor'");
    }

    @Override
    public List<Competidor> getCompetidor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCompetidor'");
    }

    @Override
    public Competidor saveCompetidor(Competidor competidor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveCompetidor'");
    }

    @Override
    public Competidor updateCompetidor(Competidor competidor, CompetidorDTO competidorDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCompetidor'");
    }

    @Override
    public CompetidorDTO registerUserLoginDTO(CompetidorDTO competidorDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerUserLoginDTO'");
    }
    
}
