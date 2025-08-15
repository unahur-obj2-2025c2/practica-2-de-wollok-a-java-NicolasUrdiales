package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public class MisionTransporte implements MisionEjecutable{
    @Override
    public Double extra() {
        return 100.0;
    }

    @Override
    public Boolean esAvanzado(Dron dron) {
        return dron.getAutonomia() > 50;
    }
}
