package com.principal;

import com.principal.domain.Juego;

public class Main {

    public static void main(String[] args) {
	 Juego juego1 = new Juego(5);

     System.out.println("El número de vidas es: " + juego1.getVidas());
     juego1.muestraVidasRestantes();
     System.out.println(juego1.muestraVidasRestantes());
     juego1.pierdeVidas();
     System.out.println(juego1.muestraVidasRestantes());

     Juego juego2 = new Juego(5);
     System.out.println(juego2.muestraVidasRestantes());
     System.out.println(juego1.muestraVidasRestantes());

    }
}
