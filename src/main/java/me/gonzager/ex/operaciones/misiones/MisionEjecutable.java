package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public interface MisionEjecutable {
    public abstract Double extra();
    public abstract Boolean esAvanzado(Dron dron);
}
