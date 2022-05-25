
package com.portfolio.model;

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
@Table(name = "experiencia")
public class Experiencia {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "logo", length = 200, nullable = true)
    private String logo;
    
    @Column(name = "empresa", length = 50, nullable = false)
    private String empresa;
    
    @Column(name = "empresa_nomb", length = 100, nullable = false)
    private String empresa_nomb;
    
    @Column(name = "puesto", length = 100, nullable = false)
    private String puesto;
    
    @Column(name = "jornada", length = 25, nullable = false)
    private String jornada;
    
    @Column(name = "tarea", length = 200, nullable = false)
    private String tarea;
    
    @Column(name = "anio_ingreso", length = 4, nullable = false)
    private String anio_ingreso;
    
    @Column(name = "anio_egreso", length = 20, nullable = false)
    private String anio_egreso;

    public Experiencia() {
    }

    public Experiencia(String logo, String empresa, String puesto, String anio_ingreso, String anio_egreso) {
        this.logo = logo;
        this.empresa = empresa;
        this.puesto = puesto;
        this.anio_ingreso = anio_ingreso;
        this.anio_egreso = anio_egreso;
    }

    public Experiencia(int id, String logo, String empresa, String puesto, String anio_ingreso, String anio_egreso) {
        this.id = id;
        this.logo = logo;
        this.empresa = empresa;
        this.puesto = puesto;
        this.anio_ingreso = anio_ingreso;
        this.anio_egreso = anio_egreso;
    }
        
}
