/*Reemplaza todas las a del String anterior por una e. (aplique replace) */

import java.util.Scanner;

public class ejercicio8_replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese una cadena : ");
        String cadena = sc.nextLine();
        System.out.println("Su cadena con las | a | sustituídas por | e | es : "+funciones.ReemplazarAPorE(cadena));
    }
}
