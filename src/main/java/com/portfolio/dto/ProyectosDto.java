
package com.portfolio.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProyectosDto {

    @NotBlank
    private String logo;
    @NotBlank
    private String titulo;
    @NotBlank
    private String tecnologias;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String year;
    private String link;

    public ProyectosDto() {
    }

    public ProyectosDto(@NotBlank String logo,
            @NotBlank String titulo,
            @NotBlank String tecnologias,
            @NotBlank String descripcion,
            @NotBlank String year,
            String link
    ) {
        this.logo = logo;
        this.titulo = titulo;
        this.tecnologias = tecnologias;
        this.descripcion = descripcion;
        this.year = year;
        this.link = link;
    }

}
