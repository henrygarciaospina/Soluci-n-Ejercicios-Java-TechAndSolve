package com.principal.domain;

public class Vuelo {
    Integer id;
    Avion avion;
    Destino destino;
    String fecha;
    String hora;

    public Vuelo(Integer id, Avion avion, Destino destino, String fecha, String hora) {
        this.id = id;
        this.avion = avion;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "id=" + id +
                ", avion=" + avion +
                ", destino=" + destino +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                '}';
    }
}
