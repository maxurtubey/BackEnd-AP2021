
package com.portfolio.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HabilidadesDto {

    @NotBlank
    private String logo;
    @NotBlank
    private String descripcion;
    private String duracion;
    private String certificado;
    @NotBlank
    private String porcentaje;

    public HabilidadesDto() {
    }

    public HabilidadesDto(@NotBlank String logo,
            @NotBlank String descripcion,
            String duracion,
            String certificado,
            @NotBlank String porcentaje) {
        this.logo = logo;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.certificado = certificado;
        this.porcentaje = porcentaje;
    }

}
