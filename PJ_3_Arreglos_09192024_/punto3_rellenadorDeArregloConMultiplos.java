
import java.util.Scanner;

/* Crea un array o arreglo unidimensional donde tú le indiques el tamaño por teclado y crear
una función que rellene el array o arreglo con los múltiplos de un numero pedido por
teclado. Por ejemplo, si defino un array de tamaño 5 y elijo un 3 en la función, el array
contendrá 3, 6, 9, 12, 15. Muéstralos por pantalla usando otra función distinta. */
public class punto3_rellenadorDeArregloConMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese el tamaño de su arreglo unidimensional : ");
        int size = sc.nextInt();
        int[] multiplos = new int[size];
        multiplos = funciones.rellenarConMultiplos(multiplos);
        funciones.mostrarArreglo(multiplos);
    }
}
