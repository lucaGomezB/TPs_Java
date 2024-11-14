
import java.util.Scanner;

/* Crea un programa donde se pida el ingreso de una cadena y por medio de
recursión mostrar la cadena de forma inversa.
Ejemplo: Ingreso “computadora de escritorio”
Invertir cadena “oirotircse ed arodatupmoc” */
public class ejercicio23_Recursion_InversionCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Porfavor ingrese una cadena : ");
        String cadena = sc.nextLine();
        System.out.println("Su cadena inversa es : "+inversionRecursivaDeCadena(cadena));
    }
    public static String inversionRecursivaDeCadena(String cadena){
        if (cadena.isEmpty()) {
            return cadena; // Caso base: si la cadena está vacía, se devuelve vacía
        } else {
            // Caso recursivo: se toma el último carácter y se concatena con la inversión del resto
            return cadena.charAt(cadena.length() - 1) + inversionRecursivaDeCadena(cadena.substring(0, cadena.length() - 1));
        }
    }
}
