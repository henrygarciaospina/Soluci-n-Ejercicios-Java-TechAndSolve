/*
Escribe un programa en JAVA que obtenga la suma e imprima los términos de la siguiente serie:

2, 5, 7, 10, 12, 15, 17, . . ., 1 800

 */
package com.principal;

public class Ejercicio2 {

    public static void main(String[] args) {
        int serie=2;
        int i=1;
	    while(serie<=800){
            System.out.print(serie+",");
            if(i%2!=0){
                serie+=3;
            }else{
                serie+=2;
            }
            i+=1;
        }
    }
}