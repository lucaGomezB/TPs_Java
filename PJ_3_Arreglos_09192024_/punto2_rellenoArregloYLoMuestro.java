//En el siguiente programa se crea un array de longitud 5, al que se le asignan valores, pedidos mediante bucle,
//que serán luego mostrados por pantalla.
import java.util.Scanner;
public class punto2_rellenoArregloYLoMuestro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo [];
        arreglo = new int[5];
        for(int i = 0;i<5;i++) {
            System.out.println("Porfavor ingrese un número entero.");
            arreglo[i] = sc.nextInt();
        }
        for(int i = 0;i<5;i++){
            System.out.println("El valor correspondiente al índice "+i+" es : "+arreglo[i]);
        }
        System.out.println("Su arreglo es : ");
        for(int i = 0;i<5;i++){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println();
    }
}