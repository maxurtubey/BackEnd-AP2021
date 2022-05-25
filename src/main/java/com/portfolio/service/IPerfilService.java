package com.portfolio.service;

import com.portfolio.model.Perfil;
import java.util.List;

public interface IPerfilService {

    public List<Perfil> verPerfil();

    public Perfil buscarPerfil(int id);

    public void editar(Perfil pers);

    public void guardar(Perfil persona);
    
    public boolean existePorId(int id);

}
