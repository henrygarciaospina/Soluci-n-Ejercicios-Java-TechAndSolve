package com.principal.domain;

public class Avion {
    private Integer id;
    private String placa;
    private Integer puestoslaseEconomica;
    private Integer puestosClaseEjecutiva;

    public Avion(Integer id, String placa, Integer puestoslaseEconomica, Integer puestosClaseEjecutiva) {
        this.id = id;
        this.placa = placa;
        this.puestoslaseEconomica = puestoslaseEconomica;
        this.puestosClaseEjecutiva = puestosClaseEjecutiva;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getPuestoslaseEconomica() {
        return puestoslaseEconomica;
    }

    public void setPuestoslaseEconomica(Integer puestoslaseEconomica) {
        this.puestoslaseEconomica = puestoslaseEconomica;
    }

    public Integer getPuestosClaseEjecutiva() {
        return puestosClaseEjecutiva;
    }

    public void setPuestosClaseEjecutiva(Integer puestosClaseEjecutiva) {
        this.puestosClaseEjecutiva = puestosClaseEjecutiva;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", puestoslaseEconomica=" + puestoslaseEconomica +
                ", puestosClaseEjecutiva=" + puestosClaseEjecutiva +
                '}';
    }
}
