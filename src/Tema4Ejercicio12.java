import java.util.Scanner;
public class Tema4Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceme un numero");
        int numero = sc.nextInt();
        System.out.println("El valor " + numero + " en la sucesion de fibonachi es: " + fibonachi(numero));
    }
    static int fibonachi(int numero){
        if(numero <= 1){
            return numero;
        }

        return (fibonachi(numero-1) + fibonachi(numero-2));
    }
}
