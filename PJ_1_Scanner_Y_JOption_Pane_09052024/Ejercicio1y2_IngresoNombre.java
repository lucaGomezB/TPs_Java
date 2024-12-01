//Con el siguiente código se puede ingresar un String a una variable, que es luego impresa en
//pantalla.
import java.util.Scanner;
public class Ejercicio1y2_IngresoNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese su nombre completo : ");
        String nombre = sc.nextLine();
        System.out.println("Bienvenido "+nombre);       
    }
}
