package com.portfolio.service;

import com.portfolio.model.AcercaDe;
import com.portfolio.repository.AcercaDeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaDeService implements IAcercaDeService {

    @Autowired
    public AcercaDeRepository acercadeRepo;

    @Override
    public List<AcercaDe> verAcercaDe() {
        return acercadeRepo.findAll();
    }

    @Override
    public void editar(AcercaDe texto) {
    }

    @Override
    public AcercaDe buscarAbout(int id) {
        return acercadeRepo.findById(id).orElse(null);
    }

    @Override
    public void guardar(AcercaDe texto) {
        acercadeRepo.save(texto);
    }

    @Override
    public boolean existePorId(int id) {
        return acercadeRepo.existsById(id);
    }

}
