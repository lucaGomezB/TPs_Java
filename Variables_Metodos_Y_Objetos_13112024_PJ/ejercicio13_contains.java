import java.util.Scanner;
/* Pedir el ingreso de dos cadenas por por teclado, indicar si la segunda cadena se
encuentra dentro de la primera (usar indexOf o contains). */
public class ejercicio13_contains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese una cadena : ");
        String cadena1 = sc.nextLine();
        System.out.println("Porfavor ingrese otra cadena : ");
        String cadena2 = sc.nextLine();
        if (cadena2.contains(cadena1)) {
            System.out.println("La segunda cadena contiene a la primera.");
        }else{
            System.out.println("La segunda cadena no contiene a la primera.");
        }
    }
}
