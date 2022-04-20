package com.principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Persona Estudiante = new Persona();
        Scanner Est=new Scanner(System.in);
        String Nombre,Apellidos,ID,Correo_Electronico,Pais;
        int Edad;
        System.out.print("Ingrese su nombre: ");
        Nombre=Est.nextLine();
        Estudiante.setNombre(Nombre);
        System.out.print("Ingrese uno de sus apellidos: ");
        Apellidos=Est.nextLine();
        Estudiante.setApellidos(Apellidos);
        System.out.print("Ingrese su ID (identificación): ");
        ID=Est.next();
        Estudiante.setID(ID);
        System.out.print("Ingrese su correo electrónico: ");
        Correo_Electronico=Est.next();
        Estudiante.setCorreo_Electronico(Correo_Electronico);
        System.out.print("Ingrese su país de residencia: ");
        Pais=Est.nextLine();
        Estudiante.setPais(Pais);
        System.out.print("Ingrese su edad: ");
        Edad=Est.nextInt();
        Estudiante.setEdad(Edad);
        System.out.println("\n-------DATOS DEL ESTUDIANTE--------" +
                "\n Nombre: "+Estudiante.getNombre()
                +"\n Apellido: "+Estudiante.getApellidos()
                +"\n ID: "+Estudiante.getID()
                +"\n Correo Electrónico: "+Estudiante.getCorreo_Electronico()
                +"\n Pais: "+Estudiante.getPais()
                +"\n Edad: "+Estudiante.getEdad());

        Persona Estu=new Persona("Pablo","Alfaro","2345678910","palfaro@hotmail.com","Costa Rica",23);
        System.out.println("\n-------DATOS DEL ESTUDIANTE--------" +
                "\n Nombre: "+Estu.getNombre()
                +"\n Apellido: "+Estu.getApellidos()
                +"\n ID: "+Estu.getID()
                +"\n Correo Electrónico: "+Estu.getCorreo_Electronico()
                +"\n Pais: "+Estu.getPais()
                +"\n Edad: "+Estu.getEdad());

    }
}
