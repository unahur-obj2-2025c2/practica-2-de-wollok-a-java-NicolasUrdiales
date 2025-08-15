package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.MisionEjecutable;

public class DronVigilancia extends Dron {
    public DronVigilancia(Integer autonomia, MisionEjecutable mision, Integer nivelProcesamiento) {
        super(autonomia, mision, nivelProcesamiento);
    }

    @Override
    protected Boolean doEsAvanzado() {
        return this.getNivelProcesamiento() > 50;
    }

    @Override
    protected Double doEficenciaOperativa() {
        return 0.0;
    }
}
