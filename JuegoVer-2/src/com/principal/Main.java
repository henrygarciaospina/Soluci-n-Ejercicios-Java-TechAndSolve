package com.principal;

import com.principal.domain.Juego;

public class Main {

    public static void main(String[] args) {
        Juego juego1 = new Juego(5);
        Juego juego2 = new Juego(6);

        juego1.quitaVida();
        System.out.println(juego1.muestraVidasRestantes());
        juego1.reiniciaPartida();
        System.out.println(juego1.muestraVidasRestantes());
        juego1.actualizarRecord();
        juego2.actualizarRecord();
    }
}
