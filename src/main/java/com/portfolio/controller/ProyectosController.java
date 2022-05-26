
package com.portfolio.controller;

import com.portfolio.dto.Aviso;
import com.portfolio.dto.ProyectosDto;
import com.portfolio.model.Proyectos;
import com.portfolio.service.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyectos")
@CrossOrigin(origins = "https://portfolioap2021.web.app")
//@CrossOrigin(origins = "http://localhost:4200")

public class ProyectosController {
    
    @Autowired
    private IProyectosService proyectosServ;
    
    @GetMapping("/detalle/{id}")
    public ResponseEntity<Proyectos> getById(@PathVariable("id") int id) {
        if (!proyectosServ.existePorId(id)) {
            return new ResponseEntity(new Aviso("No se encontro el resgitro"), HttpStatus.NOT_FOUND);
        }
        Proyectos educacion = proyectosServ.buscarProyecto(id);
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    
    @PostMapping("/agregar")
    public ResponseEntity<?> agregar(@RequestBody ProyectosDto proyDto) {
        Proyectos proyect = new Proyectos();
        proyect.setLogo(proyDto.getLogo());
        proyect.setTitulo(proyDto.getTitulo());
        proyect.setTecnologias(proyDto.getTecnologias());
        proyect.setDescripcion(proyDto.getDescripcion());
        proyect.setYear(proyDto.getYear());
        proyect.setLink(proyDto.getLink());
        proyectosServ.guardar(proyect);
        return new ResponseEntity(new Aviso("El ítem fue incorporado"), HttpStatus.OK);
    }
    
    @GetMapping("/lista")
    public ResponseEntity<List<Proyectos>> listarProyectos() {
        List<Proyectos> list = proyectosServ.verProyectos();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> editar(@PathVariable("id") int id, @RequestBody ProyectosDto proyDto) {
        Proyectos proyect = proyectosServ.buscarProyecto(id);
        proyect.setLogo(proyDto.getLogo());
        proyect.setTitulo(proyDto.getTitulo());
        proyect.setTecnologias(proyDto.getTecnologias());
        proyect.setDescripcion(proyDto.getDescripcion());
        proyect.setYear(proyDto.getYear());
        proyect.setLink(proyDto.getLink());
        proyectosServ.guardar(proyect);
        return new ResponseEntity(new Aviso("Registro de Proyecto Actualizado"), HttpStatus.OK);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void eliminar(@PathVariable int id) {
        proyectosServ.borrarProyecto(id);
    }
    
}
