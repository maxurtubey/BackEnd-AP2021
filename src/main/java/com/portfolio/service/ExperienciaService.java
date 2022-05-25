
package com.portfolio.service;

import com.portfolio.model.Experiencia;
import com.portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository experienciaRepo;

    @Override
    public List<Experiencia> verExperiencia() {
        return experienciaRepo.findAll();
    }

    @Override
    public void editar(Experiencia trabajo) {}

    @Override
    public Experiencia buscarExperiencia(int id) {
        return experienciaRepo.findById(id).orElse(null);
    }

    @Override
    public void guardar(Experiencia newjob) {
        experienciaRepo.save(newjob);
    }

    @Override
    public void borrarExperiencia(int id) {
        experienciaRepo.deleteById(id);
    }

    @Override
    public boolean existePorId(int id) {
        return experienciaRepo.existsById(id);        
    }
    
}
