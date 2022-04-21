package co.techandsolve.cargame;

import co.techandsolve.cargame.domain.Carro;
import co.techandsolve.cargame.domain.Conductor;
import co.techandsolve.cargame.domain.Juego;
import co.techandsolve.cargame.domain.Podium;

public class Application {


    public static void main(String[]  args){
        int numCarriles = 3;
        int kilometros = 200;
        Juego juego = new Juego(numCarriles, kilometros, "Pista#Los Andes");

        Carro rojo = new Carro(Carro.Color.ROJO, "XX1");
        rojo.agregarConductor(new Conductor("C1", "Rául", "raul@gmail.com", "raul"));

        Carro azul = new Carro(Carro.Color.AZUL, "XY2");
        azul.agregarConductor(new Conductor("H1", "Henry", "henry@gmail.com", "henry"));

        Carro verde = new Carro(Carro.Color.VERDE, "XX2");
        verde.agregarConductor(new Conductor("K1", "David", "david@gmail.com", "david"));

        Carro blanco = new Carro(Carro.Color.BLANCO, "AB4");
        blanco.agregarConductor(new Conductor("Z1", "Diego", "diego@gmail.com", "diego"));

        juego.agregarCarroACarril(1, rojo);
        juego.agregarCarroACarril(2, azul);
        juego.agregarCarroACarril(3, verde);
        juego.agregarCarroACarril(1, blanco);

        Podium podium = juego.iniciarJuego();
        System.out.println(podium);
    }
}