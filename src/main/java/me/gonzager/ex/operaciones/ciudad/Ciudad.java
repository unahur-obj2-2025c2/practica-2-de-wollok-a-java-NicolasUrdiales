package me.gonzager.ex.operaciones.ciudad;

public class Ciudad {
    private Integer cantidadMaximaDrones;
    private static Ciudad instance;

    private Ciudad(Integer cantidadMaximaDrones) {
        this.cantidadMaximaDrones = cantidadMaximaDrones;
    }

    public static Ciudad getInstance() {
        if (instance == null) {
            instance = new Ciudad(10);
        }
        return instance;
    }

    public Integer getCantidadMaximaDrones() {
        return cantidadMaximaDrones;
    }
    
}
