/*
PROGRAMA QUE CALCULE EL MAYOR Y MENOR DE N NUMEROS
*/

package com.principal;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 int cantidadNumeros = 0;
     int numeroMaximo=100000000;
     int numeroMinimo=-100000000;
     int menor = Integer.MAX_VALUE;
     int mayor = Integer.MIN_VALUE;
     Random genereMumero= new Random();

     Scanner lea = new Scanner(System.in);

        System.out.print("Cuántos números desea evaluar: ");
        cantidadNumeros = lea.nextInt();
        System.out.println();

        for(int i=0; i<cantidadNumeros;i++){
            int numero = numeroMinimo + ((numeroMaximo - numeroMinimo) * genereMumero.nextInt());
            System.out.println("Número generado: " + numero);
            if(numero<menor){
                menor = numero;
            }
            if(numero>mayor){
                mayor = numero;
            }
        }
        System.out.println("El número mayor de los evaluados es : "+mayor);
        System.out.println("El número menor de los evaluados es : "+menor);
    }
}
