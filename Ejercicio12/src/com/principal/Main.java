package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [] precioBoletos = new int[5];
        int [] cantidadVentaPorPrecio = new int[5];
        int numeroCompradores=0;
        int tipoBoleta=0;
        int tipo1=0;
        int tipo2=0;
        int tipo3=0;
        int tipo4=0;
        int tipo5=0;
        int boletasCompradas=0;


        Scanner lea = new Scanner(System.in);

        for(int i=0; i<5; i++){
            System.out.println("Ingrese el precio del boleto " +(i+1) + " ");
            precioBoletos[i] = lea.nextInt();
        }

        System.out.println();
        System.out.print("Ingrese la cantidad de compradores ");
        numeroCompradores = lea.nextInt();
        int cuentaCompradores=0;
        do{
            cuentaCompradores++;
            for(int i=0; i<5; i++){
                System.out.println("Precio del boleto " +(i+1) + " es $" + precioBoletos[i]);
            }
            System.out.println();
            System.out.println("Ingrese tipo de boleto a comprar [1-5]");
            tipoBoleta = lea.nextInt();
            System.out.println("Cantidad de boletas a comprar: ");
            boletasCompradas = lea.nextInt();

            switch(tipoBoleta){
                case 1:
                    tipo1+=boletasCompradas;
                    break;
                case 2:
                    tipo2+=boletasCompradas;
                    break;
                case 3:
                    tipo3+=boletasCompradas;
                    break;
                case 4:
                    tipo4+=boletasCompradas;
                    break;
                case 5:
                    tipo5+=boletasCompradas;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }while(cuentaCompradores<numeroCompradores);

        cantidadVentaPorPrecio[0]=tipo1;
        cantidadVentaPorPrecio[1]=tipo2;
        cantidadVentaPorPrecio[2]=tipo3;
        cantidadVentaPorPrecio[3]=tipo4;
        cantidadVentaPorPrecio[4]=tipo5;

        for(int i=0; i<5; i++){
            System.out.println("Cantida de boletas de vendidas tipo " +(i+1) + " - " + cantidadVentaPorPrecio[i]);
            System.out.println("Precio boletas tipo" +(i+1) + " - " + precioBoletos[i]);
            System.out.println("Total ventas boletas tipo " +(i+1) + " - " + precioBoletos[i]*cantidadVentaPorPrecio[i]);
        }
    }
}
