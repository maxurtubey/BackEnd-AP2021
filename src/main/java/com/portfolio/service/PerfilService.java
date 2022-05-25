package com.portfolio.service;

import com.portfolio.model.Perfil;
import com.portfolio.repository.PerfilRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService implements IPerfilService {

    @Autowired
    public PerfilRepository perfilRepo;

    @Override
    public List<Perfil> verPerfil() {
        return perfilRepo.findAll();
    }

    @Override
    public Perfil buscarPerfil(int id) {
        return perfilRepo.findById(id).orElse(null);
    }

    @Override
    public void editar(Perfil pers) {
    }

    @Override
    public void guardar(Perfil persona) {
        perfilRepo.save(persona);
    }
    
    @Override
    public boolean existePorId(int id) {
        return perfilRepo.existsById(id);
    }

}
