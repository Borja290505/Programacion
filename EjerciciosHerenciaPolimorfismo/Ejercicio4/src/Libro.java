public class Libro extends Publicacion{
    private Integer numPaginas;

    public Libro(String titulo, String autor, Integer numPaginas) {
        super(titulo, autor);
        this.numPaginas = numPaginas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("La publiaciones es de: " + autor + " tiene el titulo: " + titulo + " y tiene " + numPaginas + " paginas");

    }
}
