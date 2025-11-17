import java.util.Scanner;
public class Tema4Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceme un numero");
        int numero = sc.nextInt();
        SecuenciaFibonachi(numero);

    }
    static void SecuenciaFibonachi(int numero){
        int a = 0;
        int b = 1;
        for(int i = 0; i < numero; i++){
            System.out.println(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        return;
    }
}
