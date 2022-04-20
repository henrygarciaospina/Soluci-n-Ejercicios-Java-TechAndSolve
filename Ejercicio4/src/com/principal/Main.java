/*
Realiza el programa en JAVA tal que dado como dato el sueldo de un trabajador, le aplique un aumento del 15% si su sueldo es inferior a $1000 y 12% en caso contrario. Imprima el nuevo sueldo del trabajador.

Dato: SUE (variable de tipo real que representa el sueldo del trabajador)
 */
package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 double SUE=0;

        Scanner lea = new Scanner(System.in);
        System.out.print("Ingrese el sueldo del trabajador: ");
        SUE = lea.nextDouble();

        if (SUE<1000){
            SUE=SUE*1.15;
        } else
        {
            SUE=SUE*1.12;
        }
        System.out.println("El nuevo sueldo del trabajador es $"+SUE);
    }
}
