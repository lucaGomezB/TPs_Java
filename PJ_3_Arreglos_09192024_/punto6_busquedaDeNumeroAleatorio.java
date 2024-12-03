
import java.util.Scanner;

/* Realice una búsqueda secuencial en un arreglo unidimensional de tamaño 50 generado
aleatoriamente mediante la función java random.
Realice una búsqueda secuencial de la siguiente forma:
-
se lee el valor que se desea buscar,
-
se compara la primera posición;
-
si son iguales,
-
fin de la búsqueda.
-
De lo contrario, compararlo con la segunda posición, y así sucesivamente.
-
Si se llega al final del arreglo y no se encontró el valor, debe indicarlo con un mensaje
apropiado.
-
Si se encuentra, se debe especificar la posición que ese valor ocupa en el arreglo por
primera vez. */
public class punto6_busquedaDeNumeroAleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[50];
        for (int i = 0; i < 50; i++) {
            //Acá se rellena el arreglo
            arreglo[i] = funciones.generarNumeroEnteroPositivoPar();
        } 
        System.out.println("Ingrese un valor a buscar en el arreglo aleatoriamente generado : ");
        int numeroABuscar = sc.nextInt();
        int posicion = -1;
        for (int i = 0; i < 50; i++) {
            if (numeroABuscar == arreglo[i]) {
                posicion = i;
                break;
            }
        }
        if(posicion != -1){
            System.out.println("Su número se encontró por primera vez en el índice : "+posicion);
        }else{
            System.out.println("Su número no pudo ser encontrado en el arreglo aleatoriamente generado. \nIntente buscar un número par, porque reutilicé la función del punto 5.");
        }
    }
}
