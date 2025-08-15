package me.gonzager.ex.operaciones.misiones;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.ex.operaciones.drones.Dron;

public class MisionVigilancia implements MisionEjecutable{
    private final List<Sensor> sensores = new ArrayList<>();
    @Override
    public Double extra() {
        return sensores.stream().mapToDouble(s -> s.eficiencia()).sum();
    }

    @Override
    public Boolean esAvanzado(Dron dron) {
        return sensores.stream().allMatch(s -> s.esDuradero());
    }
    
}
