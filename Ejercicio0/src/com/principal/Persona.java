package com.principal;

public class Persona {
    String Nombre, Apellidos,  ID, Correo_Electronico, Pais;
    int Edad;


    public Persona() {
    }

    public Persona(String nombre, String apellidos, String id, String correo, String pais, int edad){
        Nombre=nombre;
        Apellidos=apellidos;
        ID=id;
        Correo_Electronico=correo;
        Pais=pais;
        Edad=edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public void setCorreo_Electronico(String correo_Electronico) {
        Correo_Electronico = correo_Electronico;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
}
