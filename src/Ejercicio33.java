import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedimos al usuario el numero
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        int n = numero;
        int divisor = 2;

        //Imprimimos el resultado mientras n sea mayor que 1 entramos al while
        while (n > 1) {
            //En el caso de que el resto sea 0 se imprime
            if (n % divisor == 0) {
                System.out.println(n + " | " + divisor);
                n /= divisor;

            } else {
                divisor++;
            }
        }
        System.out.println("1");

        scanner.close();
    }
}