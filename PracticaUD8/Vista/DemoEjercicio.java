package Vista;

import Modelo.*;

public class DemoEjercicio {
    public static void main(String[] args) {
        Vehiculo c1 = new Coche(2025,"KIA", "4569POI", "PORTYQ",1500.9,4,"Diesel");
        Vehiculo v1 = new Vehiculo(2010,"Mercedes","9780KKL", "GLC Coupe", 150000.2);
        Vehiculo m1 = new Motocicleta(2019,"Yamaha","7894PPL","YRS30", 15002.1, 320, "Carrera");
        Vehiculo cn1 = new Camion(2000,"Volvo", "6543LOL","SUPERFAST", 365214.5,19312.1,6);

        Concesionario rimauto = new Concesionario();

        rimauto.getVehiculos().add(c1);
        rimauto.getVehiculos().add(v1);
        rimauto.getVehiculos().add(m1);
        rimauto.getVehiculos().add(cn1);

        System.out.println("VEHICULOS EN EL CONCESIONARIO");
        rimauto.mostrarVehiculos();

        System.out.println();
        System.out.println("VEHICULOS MAS ANTIGUOS");
        System.out.println("El vehiculo mas antiguo es: " + rimauto.vehiculoMasAntiguo());

        System.out.println();
        for(Vehiculo v : rimauto.getVehiculos()){
            System.out.println("El vehiculo tiene una antiguedad de: " + v.cacularAntiguedad());
        }


        System.out.println();
        System.out.println("Los resultados de la busqueda son: " + rimauto.buscaValor("Mercedes"));
        System.out.println("Los resultados de la busqueda son: " + rimauto.buscaValor("PORTYQ"));
        System.out.println("Los resultados de la busqueda son: " + rimauto.buscaValor("Camion"));
    }
}
