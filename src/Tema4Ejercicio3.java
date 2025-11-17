import java.util.Scanner;
public class Tema4Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduceme un numero");
        int numero2 = sc.nextInt();
        sc.nextLine();
        System.out.println(Elevar(numero1, numero2));
    }

    static int Elevar(int numero1, int numero2){
        if(numero2 == 0){
            return 1;
        } else if (numero2 == 1) {
            return numero1;
        } else {
            return numero1 * Elevar(numero1,numero2-1);
        }
    }
}
