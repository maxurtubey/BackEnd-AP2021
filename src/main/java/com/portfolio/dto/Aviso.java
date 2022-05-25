
package com.portfolio.dto;

public class Aviso {
    
    private String aviso;
    
    public Aviso(String nota) {
        this.aviso = nota;
    }

    public String getMensaje() {
        return aviso;
    }

    public void setMensaje(String mensaje) {
        this.aviso = mensaje;
    }
    
}
