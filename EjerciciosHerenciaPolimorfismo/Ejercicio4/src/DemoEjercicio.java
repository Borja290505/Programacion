import java.awt.geom.RectangularShape;
import java.util.ArrayList;

public class DemoEjercicio {
    public static void main(String[] args) {
        ArrayList<Publicacion> publicaciones = new ArrayList<>();
        Libro libro = new Libro("Culpa mia","Borja Ros",190);
        Revista revista = new Revista("Hola","Rosa Aniarte",23);
        publicaciones.add(libro);
        publicaciones.add(revista);

        for (Publicacion p : publicaciones){
            p.mostrarInformacion();
        }
    }
}
