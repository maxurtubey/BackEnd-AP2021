package com.portfolio.controller;

import com.portfolio.dto.Aviso;
import com.portfolio.dto.EstudiosDto;
import com.portfolio.model.Estudios;
import com.portfolio.service.IEstudiosService;
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
@RequestMapping("/estudios")
@CrossOrigin(origins = "https://portfolioap2021.web.app")
//@CrossOrigin(origins = "http://localhost:4200")

public class EstudiosController {

    @Autowired
    private IEstudiosService estudiosServ;

    @GetMapping("/detalle/{id}")
    public ResponseEntity<Estudios> getById(@PathVariable("id") int id) {
        if (!estudiosServ.existePorId(id)) {
            return new ResponseEntity(new Aviso("No se encontro el resgitro"), HttpStatus.NOT_FOUND);
        }
        Estudios educacion = estudiosServ.buscarEstudio(id);
        return new ResponseEntity(educacion, HttpStatus.OK);
    }

    @PostMapping("/agregar")
    public ResponseEntity<?> agregar(@RequestBody EstudiosDto estDto) {
        Estudios educacion = new Estudios();
        educacion.setLogo(estDto.getLogo());
        educacion.setCentro(estDto.getCentro());
        educacion.setCentro_nombre(estDto.getCentro_nombre());
        educacion.setTitulo(estDto.getTitulo());
        educacion.setAnio_ingreso(estDto.getAnio_ingreso());
        educacion.setAnio_egreso(estDto.getAnio_egreso());
        estudiosServ.guardar(educacion);
        return new ResponseEntity(new Aviso("El ítem fue incorporado"), HttpStatus.OK);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<Estudios>> listarEstudios() {
        List<Estudios> list = estudiosServ.verEstudios();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<?> editar(@PathVariable("id") int id, @RequestBody EstudiosDto estDto) {
        Estudios educacion = estudiosServ.buscarEstudio(id);
        educacion.setLogo(estDto.getLogo());
        educacion.setCentro(estDto.getCentro());
        educacion.setCentro_nombre(estDto.getCentro_nombre());
        educacion.setTitulo(estDto.getTitulo());
        educacion.setAnio_ingreso(estDto.getAnio_ingreso());
        educacion.setAnio_egreso(estDto.getAnio_egreso());
        estudiosServ.guardar(educacion);
        return new ResponseEntity(new Aviso("Registro de Educacion Actualizado"), HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminar(@PathVariable int id) {
        estudiosServ.borrarEstudio(id);
    }

}
