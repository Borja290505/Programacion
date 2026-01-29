package Modelo;

import java.util.ArrayList;

public class Concesionario {
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public Concesionario() {
        this.vehiculos = new ArrayList<>();
    }

    public Concesionario(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void mostrarVehiculos(){
        for(Vehiculo v : vehiculos){
            System.out.println(v.describirVehiculo());
        }
    }

    public Vehiculo vehiculoMasAntiguo(){
        if(vehiculos.isEmpty()){
            return null;
        }
        Vehiculo masAntiguo = vehiculos.get(0);
        for(Vehiculo v : vehiculos){

            if(v.cacularAntiguedad() > masAntiguo.cacularAntiguedad()) {
                masAntiguo = v;
            }
        }
        return masAntiguo;
    }

    public ArrayList<Vehiculo> buscaValor(String busqueda){
        ArrayList<Vehiculo> filtrado  = new ArrayList<>();
        for(Vehiculo v : vehiculos){
            if(v.getMarca().equalsIgnoreCase(busqueda) || v.getModelo().equalsIgnoreCase(busqueda) ){
                filtrado.add(v);
            } else if (busqueda.equalsIgnoreCase("coche") && v instanceof Coche) {
                filtrado.add(v);
            }else if (busqueda.equalsIgnoreCase("motocicleta") && v instanceof Motocicleta) {
                filtrado.add(v);
            }else if (busqueda.equalsIgnoreCase("camion") && v instanceof Camion) {
                filtrado.add(v);
            }
        }
        return filtrado;
    }


}
