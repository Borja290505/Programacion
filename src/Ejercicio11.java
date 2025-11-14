import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );

        System.out.println("Introduce el primer numero");
        int numero1 = scanner.nextInt();

        System.out.println("Introduce el primer numero");
        int numero2 = scanner.nextInt();

        int dividendo = numero1;
        int divisor = numero2;

        int resultado = dividendo / divisor;

        while(resultado != 0) {
            if (dividendo % divisor == 0) {
                System.out.println(dividendo + " - " + divisor + " = " + resultado);
                dividendo /= divisor;
            } else {
                divisor++;
            }

        }
    }
}