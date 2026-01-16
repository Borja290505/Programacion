import java.util.ArrayList;

public class DemoEjercicio {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        EmpleadoFijo empleado1 = new EmpleadoFijo("Borja",1500.0);
        EmpleadoPorHoras empleado2 = new EmpleadoPorHoras("Adrian",30.5,8.5);

        empleados.add(empleado1);
        empleados.add(empleado2);

        Double total = 0.0;
        for (Empleado e : empleados){
            System.out.println("El empleado: " + e.getNombre() + " gana un total de: " + e.calcularSalario() + "€");
              total += e.calcularSalario();
        }
        System.out.println("El total de los salarios es de: " + total +"€");
    }
}
