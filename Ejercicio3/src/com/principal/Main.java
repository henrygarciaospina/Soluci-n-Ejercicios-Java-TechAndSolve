
package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
            int MAT=0;
            double CAL1=0;
            double CAL2=0;
            double CAL3=0;
            double CAL4=0;
            double CAL5=0;
            Scanner lea = new Scanner(System.in);
            System.out.print("Ingrese el número de matrícula: ");
            MAT = lea.nextInt();
            System.out.print("Ingrese la calificación No.1: ");
            CAL1 = lea.nextDouble();
            System.out.print("Ingrese la calificación No.2: ");
            CAL2 = lea.nextDouble();
            System.out.print("Ingrese la calificación No.3: ");
            CAL3 = lea.nextDouble();
            System.out.print("Ingrese la calificación No.4: ");
            CAL4 = lea.nextDouble();
            System.out.print("Ingrese la calificación No.5: ");
            CAL5 = lea.nextDouble();

            double promedio = (CAL1 + CAL2 + CAL3 + CAL4 + CAL5) / 5;

            System.out.println("MatrÍcula: "+MAT);
            System.out.println("Promedio: "+promedio);
            if(promedio>=6.00){
                System.out.println("aprobado");
            }else{
                System.out.println("no aprobado");
            }
        }
    }