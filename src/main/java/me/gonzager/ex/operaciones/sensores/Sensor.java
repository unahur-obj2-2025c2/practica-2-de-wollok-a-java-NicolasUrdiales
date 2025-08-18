package me.gonzager.ex.operaciones.sensores;

public class Sensor {
    private Double capacidad;
    private Double durabilidad;
    private Boolean tieneMejoras;
    public Sensor(Double capacidad, Double durabilidad, Boolean tieneMejoras) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.tieneMejoras = tieneMejoras;
    }

    public Double eficiencia(){
        if(!tieneMejoras){
            return capacidad;
        }else{
            return capacidad * 2;
        }
    }

    public Boolean esDuradero(){
        return durabilidad > capacidad * 2;
    }
}
