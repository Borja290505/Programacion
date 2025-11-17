import java.util.Scanner;
public class Tema4Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceme un numero: ");
        int numero1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Introducme un numero: ");
        int numero2 = sc.nextInt();
        sc.nextLine();
        System.out.println(mayor(numero1, numero2));
    }
    static int mayor(int numero1, int numero2){
        if(numero1 > numero2){
            return numero1;
        } else if (numero2 > numero1) {
            return numero2;
        }else{
            return 0;
        }
    }
}
