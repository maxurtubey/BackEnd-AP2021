
package com.portfolio.service;

import com.portfolio.model.AcercaDe;
import java.util.List;

public interface IAcercaDeService {
    
    public List<AcercaDe> verAcercaDe();
    
    public AcercaDe buscarAbout(int id);
    
    public void guardar(AcercaDe texto);
    
    public void editar(AcercaDe texto);
    
    public boolean existePorId(int id);
    
}
