package Modelo;

import Ejercicio2.Vehiculos;

public class Coche extends Vehiculo {
    private Integer numeroPuertas;
    private String tipoCombustible;

    public Coche(Integer anioFabricacion, String marca, String matricula, String modelo, Double precio, Integer numeroPuertas, String tipoCombustible) {
        super(anioFabricacion, marca, matricula, modelo, precio);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }


    @Override
    public String describirVehiculo() {
        return super.describirVehiculo() + " tiene: " + numeroPuertas + " puertas y usa: " + tipoCombustible + " como combustible";
    }

    @Override
    public String toString() {
        return describirVehiculo();
    }
}
