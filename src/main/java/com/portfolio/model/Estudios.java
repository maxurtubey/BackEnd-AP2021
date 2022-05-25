
package com.portfolio.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "estudios")
public class Estudios implements Serializable {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "logo", length = 200, nullable = true)
    private String logo;
    
    @Column(name = "centro", length = 100, nullable = false)
    private String centro;
    
    @Column(name = "centro_nombre", length = 100, nullable = false)
    private String centro_nombre;
    
    @Column(name = "titulo", length = 100, nullable = false)
    private String titulo;
    
    @Column(name = "anio_ingreso", length = 4, nullable = false)
    private String anio_ingreso;
    
    @Column(name = "anio_egreso", length = 20, nullable = false)
    private String anio_egreso;

    public Estudios() {
    }

    public Estudios(String logo, String centro, String centro_nombre, String titulo, String anio_ingreso, String anio_egreso) {
        this.logo = logo;
        this.centro = centro;
        this.centro_nombre = centro_nombre;
        this.titulo = titulo;
        this.anio_ingreso = anio_ingreso;
        this.anio_egreso = anio_egreso;
    }

    public Estudios(int id, String logo, String centro, String centro_nombre, String titulo, String anio_ingreso, String anio_egreso) {
        this.id = id;
        this.logo = logo;
        this.centro = centro;
        this.centro_nombre = centro_nombre;
        this.titulo = titulo;
        this.anio_ingreso = anio_ingreso;
        this.anio_egreso = anio_egreso;
    }
    
}

