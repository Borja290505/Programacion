import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        double peseta = 166.386;
        double pesetasUsuario;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el numero de pesetas que deseas convertir a euros");
            pesetasUsuario = sc.nextDouble();
            sc.nextLine();

            if (pesetasUsuario < 0) {
                System.out.println("Debes introducir una cantidad de pesetas mayor que 0");
            } else {
                double euros = pesetasUsuario / peseta;
                System.out.println("Tienes " + euros);
            }
        } while (pesetasUsuario != 0 );

    }
}
