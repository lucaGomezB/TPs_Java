
import java.util.Random;
import java.util.Scanner;

public class funciones {
    public static void mostrarArreglo(int[] arreglo){
        //Esta función muestra un arreglo con un for-each
        System.out.println("Su arreglo es :");
        for(int variable : arreglo){
            System.out.print(variable+" ");
        }
    }
    public static int[] rellenarConMultiplos(int[] arreglo){
        //Esta función rellena con los múltiplos de un número un arreglo
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese un número : ");
        int numero = sc.nextInt();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = numero * (i+1);
        }
        sc.close();
        return arreglo;
    }
    public static int generarNumeroEnteroPositivoPar(){
        Random rand = new Random();
        int numeroEnteroPositivoPar = 1;
        while(numeroEnteroPositivoPar % 2 != 0){
            numeroEnteroPositivoPar = (rand.nextInt(100)+1);
        }
        return numeroEnteroPositivoPar;
    }
}
