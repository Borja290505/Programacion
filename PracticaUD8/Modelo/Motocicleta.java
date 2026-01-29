package Modelo;

public class Motocicleta extends Vehiculo{
    private int cilindrada;
    private String tipoMoto;

    public Motocicleta(Integer anioFabricacion, String marca, String matricula, String modelo, Double precio, int cilindrada, String tipoMoto) {
        super(anioFabricacion, marca, matricula, modelo, precio);
        this.cilindrada = cilindrada;
        this.tipoMoto = tipoMoto;
    }

    @Override
    public String describirVehiculo() {
        return super.describirVehiculo() + " utiliza: " + cilindrada + " como cilintrada y es una moto de: " + tipoMoto;
    }
    @Override
    public String toString() {
        return describirVehiculo();
    }
}
