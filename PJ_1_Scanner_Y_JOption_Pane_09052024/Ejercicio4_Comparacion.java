/*Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si
son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona. */
import java.util.Scanner;
public class Ejercicio4_Comparacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese un número : ");
        int numero1 = sc.nextInt();
        System.out.println("Porfavor ingrese otro número : ");
        int numero2 = sc.nextInt();
        if (numero1 > numero2){
            System.out.println("El primer número es mayor que el segundo.");
        }else if(numero1 < numero2){
            System.out.println("El primer número es menor que el segundo.");
        }else{
            System.out.println("Los números son iguales.");
        }
    }
}
