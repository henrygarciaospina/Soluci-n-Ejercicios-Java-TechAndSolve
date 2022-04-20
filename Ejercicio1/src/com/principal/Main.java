/*
 * Paso#1
 * Escribe un programa en JAVA tal que dado como datos 270 números enteros (introducidos por teclado), obtenga la suma de los números impares y el promedio de los números pares.

 * Datos: NUM1, NUM2, . . ., NUM270

 * Donde: NUMi es una variable de tipo entero que representa el número entero i que se ingresa (1 ≤ i ≤ 270).
*/
package com.principal;

public class Main {

    public static void main(String[] args) {
        int sumaImpares=0;
        int sumaPares=0;
        int promedioPares=0;

	    for (int i=1; i<=270; i++){
            int num = (int) (Math.random() * (270 - 1)) + 1;
            System.out.println(i+".-" + "número: " + num);
            if (num%2!=0){
                sumaImpares+=num;
            }else{
                sumaPares+=num;
            }
        }
        promedioPares = sumaPares/270;
        System.out.println("Suma de números impares: " + sumaPares);
        System.out.println("Promedio de números pares: " + promedioPares);
    }
}