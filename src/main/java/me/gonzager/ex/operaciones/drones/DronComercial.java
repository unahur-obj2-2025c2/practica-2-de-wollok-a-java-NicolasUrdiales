package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.MisionEjecutable;

public class DronComercial extends Dron {
    public DronComercial(Integer autonomia, MisionEjecutable mision, Integer nivelProcesamiento) {
        super(autonomia, mision, nivelProcesamiento);
    }

    

    @Override
    protected Boolean doEsAvanzado() {
        return false;
    }

    @Override
    protected Double doEficenciaOperativa() {
        return 15.0;
    }
}
