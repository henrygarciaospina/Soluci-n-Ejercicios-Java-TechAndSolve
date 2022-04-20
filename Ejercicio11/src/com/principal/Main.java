package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int cantidadTrabajadores = 0;
        double sueldo = 0.00;
        double sueldoMayor = -10000000;
        int trabajador = 0;
        Scanner lea = new Scanner(System.in);

        System.out.print("Ingrese cantidad de trabajadores de la empresa ");
        cantidadTrabajadores = lea.nextInt();


        for(int i=0; i<cantidadTrabajadores; i++){
            System.out.println("Ingrese el sueldo del trabajador " +(i+1));
            sueldo = lea.nextDouble();
            if(sueldo > sueldoMayor){
                sueldoMayor=sueldo;
                trabajador = i+1;
            }
        }
        System.out.println("El trabajador de mayor sueldo es el No."+trabajador);
        System.out.println("El trabajador se gana un  sueldo de $"+sueldoMayor);
    }
}
