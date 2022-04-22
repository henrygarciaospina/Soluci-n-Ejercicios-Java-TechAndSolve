package com.principal.domain;

public class Juego {

    private Integer vidas;
    private Integer vidasInicio;
    private static Integer record = 0;

    public Juego(Integer vidas) {
        this.vidas = vidas;
        this.vidasInicio = vidas;
    }

    public Integer getVidas() {
        return vidas;
    }

    public Integer getVidasInicio() {
        return vidasInicio;
    }

    public boolean quitaVida() {
        if(vidas>0) this.vidas--;
        else{
            System.out.println("Juego terminado");
        }
        return vidas>0;
    }

    public String muestraVidasRestantes() {
        return ("Vidas restantes=" + vidas);

    }

    public void actualizarRecord(){
        if(vidas==record){
            System.out.println("!!Ha alcanzado el record!!!, tiene " + vidas + " puntos");
        }
        else if(vidas>record){
            record=vidas;
            System.out.println("!!Ha abatido el record!!!, tiene " + vidas + " puntos");
        }
    }

    public void reiniciaPartida() {
        this.vidas = getVidasInicio();
    }
}