//En este programa, el usuario puede ingresar conjuntos de números en un array de 10 índices,
//Luego, el usuario puede ingresar un número, y si este coincide con uno en el array,
//crea un nuevo array sin ese número.
//
//El programa cumple con la consigna, sin embargo, no he podido hacer un loop infinito de remoción de elemento
//y creación de array.
import java.util.Scanner;
public class WIP_punto12_creadorNuevoArregloSinNumeroDeUsuario{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nroEliminado = 0;
        int size = 0;
        int index = 0;
        int arreglo[];
        arreglo = new int[10];
        System.out.println("Porfavor ingrese 10 números, uno después del otro.");
        for (int i = 0; i < 10; i++) {
            arreglo[i] = sc.nextInt();
        }
        System.out.println("Porfavor ingrese un número para eliminar del array. O escriba 0 para salir.");
        nroEliminado = sc.nextInt();
        size = 0;
        for(int num : arreglo){
            if(num != nroEliminado){
                size++;
            }
        }
        int arreglo2[];
        arreglo2 = new int[size];
        index = 0;
        for(int num : arreglo){
            if(num != nroEliminado){
                arreglo2[index] = num;
                index++;
            }
        }
        System.out.println("Su nuevo arreglo es : ");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println(arreglo2[i]);
        }
    }
}