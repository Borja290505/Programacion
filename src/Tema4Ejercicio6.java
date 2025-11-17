import java.util.Scanner;
public class Tema4Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceme un numero");
        double numero1 = sc.nextDouble();
        System.out.println("Introduceme un numero");
        double numero2 = sc.nextDouble();
        System.out.println("La media de los 2 numeros es " + Media(numero1, numero2));
    }

    static double Media(double numero1, double numero2){
        double sumatorio = numero1 + numero2;
        double media = sumatorio / 2;
        return media;
    }
}
