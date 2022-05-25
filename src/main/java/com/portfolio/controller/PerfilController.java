package com.portfolio.controller;

import com.portfolio.dto.Aviso;
import com.portfolio.dto.PerfilDto;
import com.portfolio.model.Perfil;
import com.portfolio.service.IPerfilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perfil")
@CrossOrigin(origins = "http://localhost:4200")

public class PerfilController {

    @Autowired
    private IPerfilService perfilServ;
    
    @GetMapping("/detalle/{id}")
    public ResponseEntity<Perfil> getById(@PathVariable("id") int id){
        if(!perfilServ.existePorId(id))
            return new ResponseEntity(new Aviso("No se encontro el resgitro"), HttpStatus.NOT_FOUND);
        Perfil educacion = perfilServ.buscarPerfil(id);
        return new ResponseEntity(educacion, HttpStatus.OK);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<Perfil>> listarEstudios() {
        List<Perfil> list = perfilServ.verPerfil();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<?> editar(@PathVariable("id") int id, @RequestBody PerfilDto perfDto) {
        Perfil perfl = perfilServ.buscarPerfil(id);
        perfl.setImgfondo(perfDto.getImgfondo());
        perfl.setImgperfil(perfDto.getImgperfil());
        perfl.setNombre(perfDto.getNombre());
        perfl.setCiudad(perfDto.getCiudad());
        perfl.setProvincia(perfDto.getProvincia());
        perfilServ.guardar(perfl);
        return new ResponseEntity(new Aviso("Registro de Perfil Actualizado"), HttpStatus.OK);
    }
}
