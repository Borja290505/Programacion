import java.util.Scanner;
public class Tema4Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceme un numero: ");
        int numero = sc.nextInt();
        System.out.println(SumaCifra(numero));
    }
    static int SumaCifra(int numero){
        if(numero < 10){
            return numero;
        }
        return (numero % 10) + SumaCifra(numero/10);
    }
}
