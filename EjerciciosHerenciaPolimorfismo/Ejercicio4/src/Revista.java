public class Revista extends Publicacion{
    private Integer numEdicion;

    public Revista(String titulo, String autor, Integer numEdicion) {
        super(titulo, autor);
        this.numEdicion = numEdicion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("La publiaciones es de: " + autor + " tiene el titulo: " + titulo + " y es la edicion: " + numEdicion);

    }
}
