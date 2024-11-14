
import java.util.Scanner;

/* Dada una cadena, extraer la cuarta y quinta letra usando el método substring. */
public class ejercicio12_subsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese una cadena : ");
        String cadena = sc.nextLine();
        if(cadena.length()<5){
            System.out.println("Su cadena no es lo suficientemente larga.");
        }else{
            System.out.println("Las cuartas y quintas letras son : "+cadena.substring(3, 5));    
        }
    }
}
