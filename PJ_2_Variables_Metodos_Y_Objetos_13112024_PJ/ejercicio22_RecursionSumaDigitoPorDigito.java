/* Suma los dígitos de un número ingresado por el usuario de forma recursiva.
Ejemplo: el usuario ingresa 1596
El programa debe sumar 1 + 5 + 9 + 6 */

import java.util.Scanner;

public class ejercicio22_RecursionSumaDigitoPorDigito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese un número emtero : ");
        int numero = sc.nextInt();
        System.out.println("La suma recursiva de los dígitos del número es : "+funciones.sumaDeDigitosRecursiva(numero));
    }
}
