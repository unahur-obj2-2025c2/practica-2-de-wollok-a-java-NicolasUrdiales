package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public class MIsionExploracion implements MisionEjecutable{

    @Override
    public Double extra() {
        return 0.0;
    }

    @Override
    public Boolean esAvanzado(Dron dron) {
        return (dron.eficenciaOperativa() % 2) == 0;
    }
    
}
