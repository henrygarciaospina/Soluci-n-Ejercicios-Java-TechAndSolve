package com.principal;

import com.principal.domain.Avion;
import com.principal.domain.Destino;
import com.principal.domain.Vuelo;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Destino destino1 = new Destino(1, "Colombia", "Medellin");
        Destino destino2 = new Destino(2, "Italia", "Roma");
        Avion avion1 = new Avion(1, "HK-207", 200, 50);
        Avion avion2 = new Avion(2, "HK-964", 250, 80);
        Vuelo vuelo1 = new Vuelo(1, avion1, destino1, "26/04/2022", "14:30");
        Vuelo vuelo2 = new Vuelo(1, avion2, destino2, "27/04/2022", "05:30");

        Set<Vuelo> vuelos = new HashSet<Vuelo>();

        vuelos.add(vuelo1);
        vuelos.add(vuelo2);

        for(Vuelo vuelo: vuelos){
            System.out.println(vuelo.toString());
        }
    }
}