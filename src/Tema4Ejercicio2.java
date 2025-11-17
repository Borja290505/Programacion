import java.util.Scanner;
public class Tema4Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce un numero: ");
        int numero2 = sc.nextInt();
        sc.nextLine();

        CalcularMenor(numero1, numero2);
    }

    static void CalcularMenor(int numero1, int numero2){
        if(numero1 < numero2){
            System.out.println(numero1);
        } else if (numero2 < numero1) {
            System.out.println(numero2);
        } else if (numero1 == numero2) {
            System.out.println("Los numeros son los mismos");
        }
        return;
    }
}
