package Ejercicio5;

public class Usuario {
    public String nombreUsuario;
    private String contraseña;

    String regex = "^(?=.*[A-Z])(?=.*[0-9]).{8,}";

    public Usuario(String contraseña, String nombreUsuario) {
        this.contraseña = contraseña;
        this.nombreUsuario = nombreUsuario;
    }

    public void verificarContraseña(String contraseñaComprobar){
        if(contraseña.equals(contraseñaComprobar)){
            System.out.println("La constraseña es correcta");
        }else{
            System.out.println("La constraseña es incorrecta");
        }
    }

    public void cambiarContraseña(String contraseñaCambio){
        if(contraseñaCambio.matches(regex)){
            this.contraseña = contraseñaCambio;
            System.out.println("Contraseña cambiada");
        }else{
            System.out.println("No se ha podido cambiar");
        }
    }
}
