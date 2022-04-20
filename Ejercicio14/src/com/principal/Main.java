package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero=0;
        int potencia=0;
        int resultado=0;
        Scanner lea = new Scanner(System.in);

        System.out.print("Ingrese el número que desea elevar a una potencia ");
        numero = lea.nextInt();

        System.out.print("Ingrese la potencia a la que desea elevar el número ");
        potencia = lea.nextInt();
        resultado = 1;
        int i=0;
        while(i<potencia){
            if(potencia==0){
                resultado = 1;
            }else if(potencia==1){
                resultado = numero;
            }else{
                resultado*=numero;
            }
            i++;
        }
        System.out.println("Resultado: " + resultado);
    }
}