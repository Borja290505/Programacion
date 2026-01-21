public class Vehiculo {
    protected String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void arrancar(){
        System.out.println("El vehiculo " + marca + " " + modelo + " ha arrancado");
    }

}
