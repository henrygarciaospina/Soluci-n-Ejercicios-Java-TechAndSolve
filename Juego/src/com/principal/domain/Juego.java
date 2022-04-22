package com.principal.domain;

public class Juego {

    Integer vidas;

    public Juego(Integer vidas) {
        this.vidas = vidas;
    }

    public Integer getVidas() {
        return vidas;
    }

    public void pierdeVidas() {
        this.vidas = vidas-1;
    }

    public String muestraVidasRestantes() {
        return ("vidas restantes=" + vidas);

    }
}