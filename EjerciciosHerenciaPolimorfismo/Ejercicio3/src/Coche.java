public class Coche extends Vehiculo{
    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }
    public void abrirMaletero(){
        System.out.println("EL coche ha abierto el maletero");
        System.out.println(marca);
    }
}
