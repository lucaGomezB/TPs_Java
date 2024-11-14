/*Lee un número por teclado y comprueba que este número es mayor o igual que cero, si no lo es
lo volverá a pedir (do while), después muestra ese número por consola. */

import java.util.Scanner;

public class Ejercicio10_WhileNumeroInferiorA0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        while (true) { 
            System.out.println("Porfavor ingrese un número mayor o igual a 0.");
            numero = sc.nextInt();
            if (numero  < 0) {
                System.out.println("Ha ingresado un número incorrecto.");
            }else{
                break;
            }
        }
        System.out.println("Su número es : "+numero);    
    }
}
