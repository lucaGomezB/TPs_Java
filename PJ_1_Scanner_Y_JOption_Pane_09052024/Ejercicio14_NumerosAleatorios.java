
import java.util.Scanner;

/*Codifique un programa de consola en Java que permita realizar las siguientes acciones:
Generar un número aleatorio entre 0 y 100, para ello use la siguiente función:
int x = new Double(Math.random() * 100).intValue();
Una vez generado el número codifique la lógica necesaria para encontrar el número aleatorio
ayudando al usuario informando al mismo si el número ingresado es mayor o menor al número
aleatorio buscado. Una vez encontrado el número muestre la cantidad de intentos necesarios
para lograrlo. */
public class Ejercicio14_NumerosAleatorios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = new Double(Math.random() * 100).intValue();
        int numero = 0;
        int contador = 0;
        while(true){
            contador++;
            System.out.println("Porfavor ingrese un número : ");
            numero = sc.nextInt();
            if(numero < x){
                System.out.println("Mejor ingrese un número más alto.");
            }else if (numero > x) {
                System.out.println("Porfavor ingrese un número más bajo.");
            }else if (numero == x) {
                break;
            }
        }
        System.out.println("Felicidades! Ha encontrado el número generado aleatoriamente.");
        System.out.println("Esto le tomó "+contador+" intentos.");
    }
}
