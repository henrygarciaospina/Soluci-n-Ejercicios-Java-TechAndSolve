package com.principal.domain;

public class Empleado {
    private String nombre;
    private String direccion;
    private int numero;

    public Empleado(String nombre, String direccion, int numero)
    {
        System.out.println("Construyendo un empleado");
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero = numero;
    }

    public double pagoComputado()
    {
        System.out.println("Dentro del pago computado al empleado");
        return 0.0;
    }

    public void chequeCorreo()
    {
        System.out.println("Enviando el cheque por correo a "
                + this.nombre + " " + this.direccion);
    }

    public String toString()
    {
        return nombre + " " + direccion + " " + numero;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String nueva)
    {
        direccion = nueva;
    }

    public int getNumero()
    {
        return numero;
    }
}
