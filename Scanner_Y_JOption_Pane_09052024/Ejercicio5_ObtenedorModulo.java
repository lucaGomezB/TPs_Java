/*Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también
debemos indicarlo. */

import java.util.Scanner;

public class Ejercicio5_ObtenedorModulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese un número");
        int numero = sc.nextInt();
        if(numero % 2 == 0){
            System.out.println("Su número es divisible por 2.");
        }else{
            System.out.println("Su número no es divisible por 2");
        }
    }
}
