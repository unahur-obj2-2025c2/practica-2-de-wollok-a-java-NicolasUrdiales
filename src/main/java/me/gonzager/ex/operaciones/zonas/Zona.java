package me.gonzager.ex.operaciones.zonas;

public class Zona {
    private Double tamanio;
    private Integer operacionesRecibidas = 0;

    public Zona(Double tamanio) {
        this.tamanio = tamanio;
    }

    public Double getTamanio() {
        return tamanio;
    }
    public void recibirOperacion(){
        operacionesRecibidas += 1;
    }
}