import java.util.ArrayList;

public class DemoEjercicio {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Coche coche1 = new Coche("Mercedes","GLC COUPE");
        Motocicleta moto1 = new Motocicleta("Suzuki","YR30");
        vehiculos.add(coche1);
        vehiculos.add(moto1);

        for(Vehiculo v : vehiculos){
            v.arrancar();
            if(v instanceof Coche){
                ((Coche) v).abrirMaletero();
            }
            if(v instanceof Motocicleta){
                ((Motocicleta) v).hacerCaballito();
            }
        }
    }
}
