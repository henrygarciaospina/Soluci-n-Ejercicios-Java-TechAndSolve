package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 double valorCompra = 0.00;
     double valorPagar = 0.00;
     Scanner lea = new Scanner(System.in);

     System.out.println("Ingrese el valor de productos comprados");
     valorCompra = lea.nextDouble();

     if(valorCompra>=0 && valorCompra<=500){
         valorPagar = valorCompra;
     }else if(valorCompra>=501 && valorCompra<=1000){
         valorPagar = valorCompra*0.95;
        }else if(valorCompra>=1001 && valorCompra<=7000){
         valorPagar = valorCompra*0.89;
           }else if(valorCompra>=7001 && valorCompra<=15000){
              valorPagar = valorCompra*0.72;
              }
              else{
                  valorPagar = valorCompra*0.75;
               }
        System.out.println("El valor a pagar es de: $"+valorPagar);
    }
}