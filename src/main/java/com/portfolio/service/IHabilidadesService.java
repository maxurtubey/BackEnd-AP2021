
package com.portfolio.service;

import com.portfolio.model.Habilidades;
import java.util.List;

public interface IHabilidadesService {
    
    public List<Habilidades> verHabilidades();

    public void editar(Habilidades habilidad);

    public Habilidades buscarHabilidad(int id);

    public void guardar(Habilidades habilid);

    public void borrarHabilidad(int id);

    public boolean existePorId(int id);
    
}
