
import java.util.Scanner;

/*9- Recorre el String del ejercicio 6 (La lluvia en Mendoza es escasa) y transforma cada carácter a su código ASCII.
Muéstralos en línea recta, separados por un espacio entre cada carácter. */
public class ejercicio9_TransformacionCadaCaracterPorASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena = "La lluvia en Mendoza es escasa";
        System.out.println("El string original es : "+cadena);
        System.out.println("Los valores ASCII de cada caracter son : "+funciones.ReemplazarCaracterPorASCII(cadena));
    }
}
