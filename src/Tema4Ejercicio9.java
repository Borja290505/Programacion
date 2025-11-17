import java.util.Scanner;
public class Tema4Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceme un numero: ");
        int numero = sc.nextInt();
        sc.nextLine();
        cuentaAtras(numero);
    }
    static void cuentaAtras(int numero){
        //Caso base del programa
        if(numero < 0){
            return;
        }
        System.out.println(numero);
        cuentaAtras(numero-1);
    }
}
