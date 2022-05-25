package com.portfolio.service;

import com.portfolio.model.Estudios;
import com.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudiosService implements IEstudiosService {

    @Autowired
    public EducacionRepository estudiosRepo;

    @Override
    public List<Estudios> verEstudios() {
        return estudiosRepo.findAll();
    }

    @Override
    public void editar(Estudios educacion) {
    }

    @Override
    public Estudios buscarEstudio(int id) {
        return estudiosRepo.findById(id).orElse(null);
    }

    @Override
    public void guardar(Estudios estud) {
        estudiosRepo.save(estud);
    }

    @Override
    public void borrarEstudio(int id) {
        estudiosRepo.deleteById(id);
    }

    @Override
    public boolean existePorId(int id) {
        return estudiosRepo.existsById(id);
    }

}
