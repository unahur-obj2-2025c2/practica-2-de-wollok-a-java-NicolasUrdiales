package me.gonzager.ex.operaciones;
import java.util.ArrayList;
import java.util.List;

import me.gonzager.ex.operaciones.ciudad.Ciudad;
import me.gonzager.ex.operaciones.drones.Dron;
import me.gonzager.ex.operaciones.zonas.Zona;

public class Escuadron {
    private List<Dron> drones = new ArrayList<>();

    public void agregarDron(Dron dron){
        if (Ciudad.getInstance().cantidadMaximaDrones() < drones.size()) {
            drones.add(dron);
        }else{
            System.out.println("No se puede agregar más drones");
        }
    }

    public Boolean puedeOperar(Zona unaZona){
        return this.hayUnoAvanzado() && (this.eficenciaOperativaTotal() > unaZona.getTamanio() * 2);
    }

    public Double eficenciaOperativaTotal() {
        return drones.stream().mapToDouble(d -> d.eficenciaOperativa()).sum();
    }

    public Boolean hayUnoAvanzado(){
        return drones.stream().anyMatch(d -> d.esAvanzado());
    }
    
}