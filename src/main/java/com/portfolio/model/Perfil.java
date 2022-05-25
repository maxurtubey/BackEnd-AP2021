package com.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "perfil")
public class Perfil {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "imgfondo", length = 255, nullable = true)
    private String imgfondo;

    @Column(name = "imgperfil", length = 255, nullable = true)
    private String imgperfil;

    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name = "ciudad", length = 50, nullable = false)
    private String ciudad;

    @Column(name = "provincia", length = 50, nullable = false)
    private String provincia;

    public Perfil() {
    }

    public Perfil(int id, String imgfondo, String imgperfil, String nombre, String ciudad, String provincia) {
        this.id = id;
        this.imgfondo = imgfondo;
        this.imgperfil = imgperfil;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

}
