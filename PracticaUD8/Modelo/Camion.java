package Modelo;

public class Camion extends Vehiculo{
    private Double capacidadCarga;
    private int numeroEjes;

    public Camion(Integer anioFabricacion, String marca, String matricula, String modelo, Double precio, Double capacidadCarga, int numeroEjes) {
        super(anioFabricacion, marca, matricula, modelo, precio);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    @Override
    public String describirVehiculo() {
        return super.describirVehiculo() + " tiene una carga maxima de: " + capacidadCarga + " y tiene " + numeroEjes + " ejes";
    }
    @Override
    public String toString() {
        return describirVehiculo();
    }
}
