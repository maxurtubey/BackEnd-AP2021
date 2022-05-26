
package com.portfolio.controller;

import com.portfolio.dto.AcercaDeDto;
import com.portfolio.dto.Aviso;
import com.portfolio.model.AcercaDe;
import com.portfolio.service.IAcercaDeService;
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
@RequestMapping("/acercade")
@CrossOrigin(origins = "https://portfolioap2021.web.app")
//@CrossOrigin(origins = "http://localhost:4200")

public class AcercaDeController {
    
    @Autowired
    private IAcercaDeService acercadeServ;
    
    @GetMapping("/detalle/{id}")
    public ResponseEntity<AcercaDe> getById(@PathVariable("id") int id){
        if(!acercadeServ.existePorId(id))
            return new ResponseEntity(new Aviso("No se encontro el resgitro"), HttpStatus.NOT_FOUND);
        AcercaDe educacion = acercadeServ.buscarAbout(id);
        return new ResponseEntity(educacion, HttpStatus.OK);
    }
    
    @GetMapping("/lista")
    public ResponseEntity<List<AcercaDe>> listarAcercaDe(){
        List<AcercaDe> list = acercadeServ.verAcercaDe();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PutMapping("/editar/{id}")
    public ResponseEntity<?> editar(@PathVariable("id") int id, @RequestBody AcercaDeDto acercaDto){
        AcercaDe about = acercadeServ.buscarAbout(id);
        about.setTexto(acercaDto.getTexto());
        acercadeServ.guardar(about);
        return new ResponseEntity(new Aviso("Registro de AcercaDe Actualizado"), HttpStatus.OK);
    }
    
}
