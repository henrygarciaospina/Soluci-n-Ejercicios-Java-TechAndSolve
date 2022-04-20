package com.principal;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        double sueldoMinimo = 500000.00;
        double sueldoMaximo = 10000000.00;
        double totalNomina = 0.00;
        double []sueldos = new double[15];

        System.out.println("Sueldos Empleados");
        for(int i=0; i<15;i++){
            Random generarSueldo;
            generarSueldo= new Random();
            double sueldo = sueldoMinimo + (sueldoMaximo - sueldoMinimo) * generarSueldo.nextDouble();
            double nuevoSueldo = (sueldo<1000000)?sueldo*1.15:sueldo*1.12;
            sueldos[i]=nuevoSueldo;
            String formatearSueldo = String.format("$%,.2f", sueldos[i]);
            System.out.println("Nuevo sueldo empleado " + (i+1) +  ": " + formatearSueldo);
            totalNomina+=sueldos[i];
        }
        String formatearTotalNomina = String.format("$%,.2f", totalNomina);
        System.out.println("**** Total Nómina  ****   " + formatearTotalNomina);

    }
}
