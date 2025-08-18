package me.gonzager.ex.operaciones.ciudad;

public class Ciudad {
    private Integer cantidadMaximaDrones = 10;
    private static Ciudad instance;

    private Ciudad() {}

    public static Ciudad getInstance() {
        return instance;
    }

    public Integer getCantidadMaximaDrones() {
        return cantidadMaximaDrones;
    }
    public void setCantidadMaximaDrones(Integer cantidadMaximaDrones) {
        this.cantidadMaximaDrones = cantidadMaximaDrones;
    }
    
}
