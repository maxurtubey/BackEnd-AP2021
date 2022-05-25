
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
@Table(name = "habilidades")
public class Habilidades implements Serializable {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "logo", length = 255, nullable = false)
    private String logo;
    
    @Column(name = "descripcion", length = 150, nullable = false)
    private String descripcion;
    
    @Column(name = "duracion", length = 15, nullable = true)
    private String duracion;
    
    @Column(name = "certificado", length = 255, nullable = true)
    private String certificado;
    
    @Column(name = "porcentaje", length = 3, nullable = false)
    private String porcentaje;

    public Habilidades() {
    }

    public Habilidades(String logo, String descripcion, String duracion, String certificado, String porcentaje) {
        this.logo = logo;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.certificado = certificado;
        this.porcentaje = porcentaje;
    }

    public Habilidades(int id, String logo, String descripcion, String duracion, String certificado, String porcentaje) {
        this.id = id;
        this.logo = logo;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.certificado = certificado;
        this.porcentaje = porcentaje;
    }
    
}
