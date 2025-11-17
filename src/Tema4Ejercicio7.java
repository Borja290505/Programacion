import java.util.Scanner;
public class Tema4Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdume una nota numerica");
        double nota = sc.nextDouble();
        NotaTextual(nota);
    }

    static void NotaTextual(double nota){
        if(nota < 5){
            System.out.println("SUSPENSO");
        } else if (nota > 5 && nota < 7) {
            System.out.println("APROBADO");
        } else if (nota > 7 && nota < 9) {
            System.out.println("NOTABLE");
        } else if (nota > 9 && nota <= 10) {
            System.out.println("SOBRESALIENTE");
        }
    }
}
