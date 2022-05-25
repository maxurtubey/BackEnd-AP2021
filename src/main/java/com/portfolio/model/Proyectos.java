
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
@Table(name = "proyectos")
public class Proyectos implements Serializable {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "logo", length = 255, nullable = false)
    private String logo;
    
    @Column(name = "titulo", length = 50, nullable = false)
    private String titulo;
    
    @Column(name = "tecnologias", length = 255, nullable = false)
    private String tecnologias;
    
    @Column(name = "descripcion", length = 255, nullable = false)
    private String descripcion;
    
    @Column(name = "year", length = 15, nullable = false)
    private String year;
    
    @Column(name = "link", length = 255, nullable = true)
    private String link;

    public Proyectos() {
    }

    public Proyectos(String logo, String titulo, String tecnologias, String descripcion, String year, String link) {
        this.logo = logo;
        this.titulo = titulo;
        this.tecnologias = tecnologias;
        this.descripcion = descripcion;
        this.year = year;
        this.link = link;
    }

    public Proyectos(int id, String logo, String titulo, String tecnologias, String descripcion, String year, String link) {
        this.id = id;
        this.logo = logo;
        this.titulo = titulo;
        this.tecnologias = tecnologias;
        this.descripcion = descripcion;
        this.year = year;
        this.link = link;
    }    
    
}
