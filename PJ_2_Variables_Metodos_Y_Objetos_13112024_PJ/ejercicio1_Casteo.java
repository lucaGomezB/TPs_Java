
import java.util.Scanner;

/*CASTEO: Codifique un programa que solicite el ingreso de un numero decimal y
asigne el mismo a una variable valorDecimal de tipo double, aplique las
operaciones de CASTING para convertir la variable a los siguientes tipos de
datos, short, int, long, String, float investigue las diferentes formas de lograr la
conversión. Muestre por pantalla el resultado de las conversiones. */
public class ejercicio1_Casteo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese un número decimal.");
        double valorDecimal = sc.nextDouble();
        funciones.mostradorYCasteador(valorDecimal);
    }
}