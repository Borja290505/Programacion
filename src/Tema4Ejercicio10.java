import java.util.Scanner;
public class Tema4Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 1;
        System.out.print("Introduceme un numero: ");
        int numero = sc.nextInt();
        if(numero >= 0){
            for(int i = numero; i > 0; i-- ){
                total = total * i;
            }
            System.out.println(total);
        }else{
            System.out.println("Debes introducir un numero positivo");
        }


    }
}
