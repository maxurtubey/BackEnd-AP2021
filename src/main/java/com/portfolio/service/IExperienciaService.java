
package com.portfolio.service;

import com.portfolio.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia();
    
    public void editar(Experiencia trabajo);
    
    public Experiencia buscarExperiencia(int id);
    
    public void guardar(Experiencia newjob);
    
    public void borrarExperiencia(int id);
    
    public boolean existePorId(int id);
    
}
