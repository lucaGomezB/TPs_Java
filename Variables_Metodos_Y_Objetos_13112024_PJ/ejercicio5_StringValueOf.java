//Solicite el ingreso de un número y conviértalo a un String mediante String.valueOf
import java.util.Scanner;

public class ejercicio5_StringValueOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese un número : ");
        int numero = sc.nextInt();
        String numeroString = String.valueOf(numero);
        System.out.println("Su número como cadena es : "+numeroString);
    }
}
