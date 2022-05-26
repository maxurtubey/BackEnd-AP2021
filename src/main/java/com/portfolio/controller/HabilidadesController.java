
package com.portfolio.controller;

import com.portfolio.dto.Aviso;
import com.portfolio.dto.HabilidadesDto;
import com.portfolio.model.Habilidades;
import com.portfolio.service.IHabilidadesService;
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
@RequestMapping("/habilidades")
@CrossOrigin(origins = "https://portfolioap2021.web.app")
//@CrossOrigin(origins = "http://localhost:4200")

public class HabilidadesController {

    @Autowired
    private IHabilidadesService habilidadesServ;

    @GetMapping("/detalle/{id}")
    public ResponseEntity<Habilidades> getById(@PathVariable("id") int id) {
        if (!habilidadesServ.existePorId(id)) {
            return new ResponseEntity(new Aviso("No se encontro el resgitro"), HttpStatus.NOT_FOUND);
        }
        Habilidades educacion = habilidadesServ.buscarHabilidad(id);
        return new ResponseEntity(educacion, HttpStatus.OK);
    }

    @PostMapping("/agregar")
    public ResponseEntity<?> agregar(@RequestBody HabilidadesDto habDto) {
        Habilidades competencia = new Habilidades();
        competencia.setLogo(habDto.getLogo());
        competencia.setDescripcion(habDto.getDescripcion());
        competencia.setDuracion(habDto.getDuracion());
        competencia.setCertificado(habDto.getCertificado());
        competencia.setPorcentaje(habDto.getPorcentaje());
        habilidadesServ.guardar(competencia);
        return new ResponseEntity(new Aviso("El ítem fue incorporado"), HttpStatus.OK);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<Habilidades>> listarEstudios() {
        List<Habilidades> list = habilidadesServ.verHabilidades();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<?> editar(@PathVariable("id") int id, @RequestBody HabilidadesDto habDto) {
        Habilidades competencia = habilidadesServ.buscarHabilidad(id);
        competencia.setLogo(habDto.getLogo());
        competencia.setDescripcion(habDto.getDescripcion());
        competencia.setDuracion(habDto.getDuracion());
        competencia.setCertificado(habDto.getCertificado());
        competencia.setPorcentaje(habDto.getPorcentaje());
        habilidadesServ.guardar(competencia);
        return new ResponseEntity(new Aviso("Registro de Habilidad Actualizado"), HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminar(@PathVariable int id) {
        habilidadesServ.borrarHabilidad(id);
    }

}
