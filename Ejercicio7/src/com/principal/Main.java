/*
Dado como datos las calificaciones de 20 alumnos de la materia de fundamentos de programación, realiza un programa en JAVA que obtenga lo siguiente:

        -    Promedio general

        -    Imprima las calificaciones en orden inverso
*/

package com.principal;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        double calificacionMinina = 1.00;
        double calificacionMaxima = 10.00;
        double sumaCalificaciones = 0.00;
        double []calificaciones = new double[20];
        double promedioGeneral = 0.00;
        double  calificacion;
        System.out.println("Calificaciónes Fundamentos de programación");
        for(int i=0; i<20;i++){
            Random generarCalificacion;
            generarCalificacion = new Random();
            calificacion = calificacionMinina + (calificacionMaxima - calificacionMinina) *generarCalificacion.nextDouble();
            System.out.println("Calificación: " + (i+1) +  " : " + calificacion);
            calificaciones[i]=calificacion;
            sumaCalificaciones+=calificaciones[i];
        }
        promedioGeneral = sumaCalificaciones/20;
        System.out.println();
        System.out.println("Promedio general: " + promedioGeneral);
        System.out.println("CALIFICACIONES EN ORDEN INVERSO");
        System.out.println();

        for(int i=19; i>=0;i--){
            System.out.println("Calificación: " + (i+1) +  " : " + calificaciones[i]);
        }
    }
}