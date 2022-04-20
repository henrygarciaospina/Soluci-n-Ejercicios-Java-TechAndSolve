/*
 PROGRAMA QUE REALIZA LA TABLA DE MULTIPLICAR DE CUALQUIER DIGITO
 */

package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            int digito = 0;
            Scanner lea = new Scanner(System.in);
            System.out.print("Ingrese el digito de la tabla de multiplicar que desea ");
            digito = lea.nextInt();
            for(int i=1; i<=10;i++){
                System.out.println(i + " X " + digito + " = " + i*digito);
            }
            System.out.println();
        }
    }