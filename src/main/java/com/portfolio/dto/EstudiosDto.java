
package com.portfolio.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EstudiosDto {
    
    @NotBlank
    private String logo;
    @NotBlank
    private String centro;
    @NotBlank
    private String centro_nombre;
    @NotBlank
    private String titulo;
    @NotBlank
    private String anio_ingreso;
    @NotBlank
    private String anio_egreso;

    public EstudiosDto() {
    }

    public EstudiosDto(@NotBlank String img, @NotBlank String escuela, @NotBlank String esc_nombre, @NotBlank String carrera, @NotBlank String a_ingreso, @NotBlank String a_egreso) {
        this.logo = img;
        this.centro = escuela;
        this.centro_nombre = esc_nombre;
        this.titulo = carrera;
        this.anio_ingreso = a_ingreso;
        this.anio_egreso = a_egreso;
    }
   
}
