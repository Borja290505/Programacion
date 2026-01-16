public class EmpleadoPorHoras extends Empleado{
    private Double horasTrabajadas;
    private Double tarifaHora;

    public EmpleadoPorHoras(String nombre, Double horasTrabajadas, Double tarifaHora) {
        super(nombre, 0.0);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas*tarifaHora;
    }
}
