package com.portfolio.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExperienciaDto {

    @NotBlank
    private String logo;
    @NotBlank
    private String empresa;
    @NotBlank
    private String empresa_nomb;
    @NotBlank
    private String puesto;
    @NotBlank
    private String jornada;
    @NotBlank
    private String tarea;
    @NotBlank
    private String anio_ingreso;
    @NotBlank
    private String anio_egreso;

    public ExperienciaDto() {
    }

    public ExperienciaDto(@NotBlank String logo,
            @NotBlank String empresa,
            @NotBlank String empresa_nomb,
            @NotBlank String puesto,
            @NotBlank String jornada,
            @NotBlank String tarea,
            @NotBlank String anio_ingreso,
            @NotBlank String anio_egreso
    ) {
        this.logo = logo;
        this.empresa = empresa;
        this.empresa_nomb = empresa_nomb;
        this.puesto = puesto;
        this.puesto = jornada;
        this.puesto = tarea;
        this.anio_ingreso = anio_ingreso;
        this.anio_egreso = anio_egreso;
    }

}
