import java.util.Scanner;
public class Tema4Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intorduce un numero");
        int numero = sc.nextInt();
        EscribirTablaMultiplicar(numero);
    }

    static void EscribirTablaMultiplicar(int numero){
        System.out.println("Tabla de multiplicar del" + numero);
        for(int i = 1; i <= 10; i++){
            int resultado = i *  numero;
            System.out.println(numero + " * " + i + " = " + resultado);
        }
    }
}
