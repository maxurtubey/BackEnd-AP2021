
package com.portfolio.service;
        
import com.portfolio.model.Proyectos;
import java.util.List;

public interface IProyectosService {
    
    public List<Proyectos> verProyectos();

    public void editar(Proyectos proy);

    public Proyectos buscarProyecto(int id);

    public void guardar(Proyectos proyect);

    public void borrarProyecto(int id);

    public boolean existePorId(int id);
    
}