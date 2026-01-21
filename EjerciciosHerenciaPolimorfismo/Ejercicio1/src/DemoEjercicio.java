public class DemoEjercicio {
    public static void main(String[] args) {
        Perro perro = new Perro("Fido");
        System.out.println("El nombre del perro es: " + perro.getNombre());
        perro.hacerSonido();

        Gato gato = new Gato("Firulais");
        System.out.println("El nombre del perro es: " + gato.getNombre());
        gato.hacerSonido();
    }
}
