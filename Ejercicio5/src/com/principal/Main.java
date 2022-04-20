/*
PROGRAMA QUE IMPRIMA LAS 10 TABLAS DE MULTIPLICAR
 */
package com.principal;

public class Main {

    public static void main(String[] args) {
        for(int i=1; i<=10;i++){
            System.out.println("LA TABLA DEL "+i);
            for(int j=1; j<=10;j++){
                System.out.println(i + " X " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}