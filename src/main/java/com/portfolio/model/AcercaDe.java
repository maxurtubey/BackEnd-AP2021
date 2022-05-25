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

@Getter
@Setter
@Entity
@Table(name = "acercade")
public class AcercaDe implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "parrafo", length = 255, nullable = false)
    private String texto;

    public AcercaDe() {
    }

    public AcercaDe(int id, String text) {
        this.id = id;
        this.texto = text;
    }

}
