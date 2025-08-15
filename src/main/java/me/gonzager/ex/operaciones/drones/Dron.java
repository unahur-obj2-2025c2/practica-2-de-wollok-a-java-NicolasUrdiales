package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.MisionEjecutable;

public abstract class Dron {
    private Integer autonomia;
    private MisionEjecutable mision;
    private Integer nivelProcesamiento;
    public Dron(Integer autonomia, MisionEjecutable mision, Integer nivelProcesamiento) {
        this.autonomia = autonomia;
        this.mision = mision;
        this.nivelProcesamiento = nivelProcesamiento;
    }
    
    public Integer getNivelProcesamiento() {
        return nivelProcesamiento;
    }

    public Integer getAutonomia() {
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
    protected abstract Double doEficenciaOperativa();

    protected abstract Boolean doEsAvanzado();
}