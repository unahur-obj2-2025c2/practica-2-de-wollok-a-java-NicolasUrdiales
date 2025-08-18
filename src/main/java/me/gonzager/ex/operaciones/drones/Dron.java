package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.MisionEjecutable;

public abstract class Dron {
    private Double autonomia;
    private MisionEjecutable mision;
    private Double nivelProcesamiento;
    public Dron(Double autonomia, MisionEjecutable mision, Double nivelProcesamiento) {
        this.autonomia = autonomia;
        this.mision = mision;
        this.nivelProcesamiento = nivelProcesamiento;
    }
    
    public Double getNivelProcesamiento() {
        return nivelProcesamiento;
    }

    public Double getAutonomia() {
        return autonomia;
    }
    public void setMision(MisionEjecutable mision) {
        this.mision = mision;
    }

    public Double eficenciaOperativa(){
        return (autonomia * 10) + mision.extra() + this.doEficenciaOperativa();
    }

    public Boolean esAvanzado(){
        return this.doEsAvanzado() || mision.esAvanzado(this);
    }
    public void disminuirAutonomia(){
        autonomia = autonomia * 0.95;
    }
    protected abstract Double doEficenciaOperativa();

    protected abstract Boolean doEsAvanzado();
}