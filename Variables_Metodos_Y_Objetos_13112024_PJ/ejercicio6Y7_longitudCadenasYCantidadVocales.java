
import java.util.Scanner;

/*Solicite el ingreso de una cadena y determine el tamaño de la misma y cuantas
vocales tiene en total (recorre el String con charAt) */
public class ejercicio6Y7_longitudCadenasYCantidadVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese una cadena : ");
        String cadena = sc.nextLine();
        System.out.println("La longitud de la cadena | " + cadena + " | es : "+cadena.length());
        funciones.MostrarCantidadDeVocales(cadena.toUpperCase());
    }
}
