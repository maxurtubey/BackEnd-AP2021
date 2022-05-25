
package com.portfolio.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AcercaDeDto {
    
    @NotBlank
    private String texto;

    public AcercaDeDto() {
    }

    public AcercaDeDto(@NotBlank String text) {
        this.texto = text;
    }

}
