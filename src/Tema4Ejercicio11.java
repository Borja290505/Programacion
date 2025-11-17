import java.util.Scanner;
public class Tema4Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceme un numero: ");
        int numero = sc.nextInt();
        System.out.println(factorial(numero));
    }
    static int factorial(int numero){
        int total = 0;
        if(numero == 1 || numero == 0){
            return 1;
        }
        return numero * factorial(numero-1);
    }
}
