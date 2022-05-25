
package com.portfolio.service;

import com.portfolio.model.Habilidades;
import com.portfolio.repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService{
    
    @Autowired
    public HabilidadesRepository habilidadesRepo;

    @Override
    public List<Habilidades> verHabilidades() {
        return habilidadesRepo.findAll();
    }

    @Override
    public void editar(Habilidades habilidad) {
    }

    @Override
    public Habilidades buscarHabilidad(int id) {
        return habilidadesRepo.findById(id).orElse(null);
    }

    @Override
    public void guardar(Habilidades habilid) {
        habilidadesRepo.save(habilid);
    }

    @Override
    public void borrarHabilidad(int id) {
        habilidadesRepo.deleteById(id);
    }

    @Override
    public boolean existePorId(int id) {
        return habilidadesRepo.existsById(id);
    }
    
}
