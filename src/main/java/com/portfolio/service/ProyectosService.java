
package com.portfolio.service;

import com.portfolio.model.Proyectos;
import com.portfolio.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {

    @Autowired
    public ProyectosRepository proyectosRepo;

    @Override
    public List<Proyectos> verProyectos() {
        return proyectosRepo.findAll();
    }

    @Override
    public void editar(Proyectos proy) {
    }

    @Override
    public Proyectos buscarProyecto(int id) {
        return proyectosRepo.findById(id).orElse(null);
    }

    @Override
    public void guardar(Proyectos proyect) {
        proyectosRepo.save(proyect);
    }

    @Override
    public void borrarProyecto(int id) {
        proyectosRepo.deleteById(id);
    }

    @Override
    public boolean existePorId(int id) {
        return proyectosRepo.existsById(id);
    }

}
