import java.util.Scanner;
public class Tema4Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        sc.nextLine();
        signo(numero);
        sc.close();
    }
    static void signo(int numero) {
        if (numero < 0) {
            System.out.println("-1");
        } else if (numero > 0) {
            System.out.println("1");
        } else if (numero == 0) {
            System.out.println("0");
        }
        return;
    }
}