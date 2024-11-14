/*Pedir dos palabras por teclado, indicar si son iguales. (equals, compareTo,
compareToIgnoreCase) */
import java.util.Scanner;

public class ejercicio11_ComparacionStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra : ");
        String palabra1 = sc.next();
        System.out.println("Ingrese otra palabra : ");
        String palabra2 = sc.next();
        if(palabra1.equals(palabra2)){
            System.out.println("Sus palabras son iguales.");
        }else{
            System.out.println("Sus palabras no son iguales.");
        }
    }
}
