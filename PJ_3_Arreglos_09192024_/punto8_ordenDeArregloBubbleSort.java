
import java.util.Scanner;

/* Escriba una aplicación que solicite y cargue en un arreglo 10 dígitos enteros, luego cree
dos nuevos arreglos y asigne al primero los números ingresados por el usuario de forma
ascendente y en el segundo de forma descendente. Muestre los 2 arreglos por pantalla. */
public class punto8_ordenDeArregloBubbleSort {
    public static void main(String[] args) {
        int [] arregloPrincipal = new int[10];
        int [] arregloAscendente = new int[10];
        int [] arregloDescendente = new int[10];
        arregloPrincipal = cargaDeArreglo(arregloPrincipal);
        System.out.println("Ha finalizado la carga del arreglo.");
        arregloAscendente = ordenarAscendente(arregloPrincipal);
        System.out.println("Su arreglo de forma ascendiente equivale a : ");
        System.out.print("[ ");
        for(int i = 0; i < 10;i++){
            System.out.print(arregloAscendente[i]+" ");
        }
        System.out.println("]");
        System.out.println("Su arreglo de forma descendiente equivale a : ");
        System.out.print("[ ");
        arregloDescendente = ordenarDescendente(arregloPrincipal);
        for(int i = 0; i < 10;i++){
            System.out.print(arregloDescendente[i]+" ");
        }
        System.out.println("]");
    }
    public static int[] cargaDeArreglo(int[] arregloPrincipal){
        //Con esto se cargan digitos enteros al arreglo
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Porfavor cargue un dígito entero: ");
            while(true){
                numero = sc.nextInt();
                if(numero >= 0 && numero <= 9){
                    arregloPrincipal[i] = numero;
                    break;
                }else{
                    System.out.println("Porfavor ingrese solo 1 dígito a la vez.");
                }
            }
        }
        sc.close();
        return arregloPrincipal;
    }
    public static int[] ordenarAscendente(int[] arregloPrincipal){
        //Esto usa bubbleSort
        for (int i = 0; i < arregloPrincipal.length - 1; i++) {
            //Se usa como límite la longitud del arreglo -1
            for (int j = 0; j < arregloPrincipal.length - i - 1; j++) {
                //Se usa como límite la longitud del arreglo -i -1
                if (arregloPrincipal[j] > arregloPrincipal[j + 1]) {
                    //Si el elemento siguiente es superior al actual, se intercambian sus posiciones.
                    int temp = arregloPrincipal[j];
                    arregloPrincipal[j] = arregloPrincipal[j + 1];
                    arregloPrincipal[j + 1] = temp;  
                }
            }
        }
        return arregloPrincipal;
    }
    public static int[] ordenarDescendente(int[] arregloPrincipal){
        //Esto usa un bubbleSort, que invierte la condición.
        for (int i = 0; i < arregloPrincipal.length - 1; i++) {
            for (int j = 0; j < arregloPrincipal.length - i - 1; j++) {
                //Los límites del arreglo son iguales, y este progresa igualmente.
                if (arregloPrincipal[j] < arregloPrincipal[j + 1]) {
                    // Si el elemento de la actual es menor, se intercambian
                    int temp = arregloPrincipal[j];
                    arregloPrincipal[j] = arregloPrincipal[j + 1];
                    arregloPrincipal[j + 1] = temp;
                }
            }
        }
        return arregloPrincipal;
    }
}
