import java.util.Scanner;
public class Ejercicio1_IngresoNombre {
    public static void main(String[] args) {
        System.out.println("Porfavor ingrese su nombre completo : ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Bienvenido "+nombre);       
    }
}
