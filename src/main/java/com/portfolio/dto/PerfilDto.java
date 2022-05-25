package com.portfolio.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerfilDto {

    @NotBlank
    private String imgfondo;
    @NotBlank
    private String imgperfil;
    @NotBlank
    private String nombre;
    @NotBlank
    private String ciudad;
    @NotBlank
    private String provincia;

    public PerfilDto() {
    }

    public PerfilDto(@NotBlank String imgfondo,
            @NotBlank String imgperfil,
            @NotBlank String nombre,
            @NotBlank String ciudad,
            @NotBlank String provincia
    ) {
        this.imgfondo = imgfondo;
        this.imgperfil = imgperfil;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

}
