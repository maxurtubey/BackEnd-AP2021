package com.portfolio.controller;

import com.portfolio.dto.Aviso;
import com.portfolio.dto.ExperienciaDto;
import com.portfolio.model.Experiencia;
import com.portfolio.service.IExperienciaService;
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
@RequestMapping("/experiencia")
@CrossOrigin(origins = "http://localhost:4200")

public class ExperienciaController {

    @Autowired
    private IExperienciaService experienciaServ;

    @GetMapping("/detalle/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id") int id) {
        if (!experienciaServ.existePorId(id)) {
            return new ResponseEntity(new Aviso("No se encontro el resgitro"), HttpStatus.NOT_FOUND);
        }
        Experiencia experienc = experienciaServ.buscarExperiencia(id);
        return new ResponseEntity(experienc, HttpStatus.OK);
    }

    @PostMapping("/agregar")
    public ResponseEntity<?> agregar(@RequestBody ExperienciaDto expDto) {
        Experiencia experiencia = new Experiencia();
        experiencia.setLogo(expDto.getLogo());
        experiencia.setEmpresa(expDto.getEmpresa());
        experiencia.setEmpresa_nomb(expDto.getEmpresa_nomb());
        experiencia.setPuesto(expDto.getPuesto());
        experiencia.setJornada(expDto.getJornada());
        experiencia.setTarea(expDto.getTarea());
        experiencia.setAnio_ingreso(expDto.getAnio_ingreso());
        experiencia.setAnio_egreso(expDto.getAnio_egreso());
        experienciaServ.guardar(experiencia);
        return new ResponseEntity(new Aviso("El ítem fue incorporado"), HttpStatus.OK);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> listarExperiencia() {
        List<Experiencia> lista = experienciaServ.verExperiencia();
        return new ResponseEntity(lista, HttpStatus.OK);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<?> editar(@PathVariable("id") int id, @RequestBody ExperienciaDto expDto) {
        Experiencia exper = experienciaServ.buscarExperiencia(id);
        exper.setLogo(expDto.getLogo());
        exper.setEmpresa(expDto.getEmpresa());
        exper.setEmpresa_nomb(expDto.getEmpresa_nomb());
        exper.setPuesto(expDto.getPuesto());
        exper.setJornada(expDto.getJornada());
        exper.setTarea(expDto.getTarea());
        exper.setAnio_ingreso(expDto.getAnio_ingreso());
        exper.setAnio_egreso(expDto.getAnio_egreso());
        experienciaServ.guardar(exper);
        return new ResponseEntity(new Aviso("Registro de Experiencia Actualizado"), HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminar(@PathVariable int id) {
        experienciaServ.borrarExperiencia(id);
    }

}
