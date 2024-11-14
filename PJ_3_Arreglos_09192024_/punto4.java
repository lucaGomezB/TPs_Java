//Esta aplicación lee 20 números decimales ingresados por teclado por el usuario y los coloca en un arreglo 
//unidimensional, 
//luego identifica al número más grande 
//y el más chico, 
//y muestra el rango.
import java.util.Scanner;
public class punto4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo [];
        arreglo = new int[20];
        System.out.println("Porfavor ingrese 20 números, uno a la vez.");
        for(int i=0 ; i<20 ; i++){
            arreglo[i] = sc.nextInt();
        }
        int numeroMayor = getNumeroMayor(arreglo);
        System.out.println("El número mayor del arreglo es : "+numeroMayor);
        int numeroMenor = getNumeroMenor(arreglo);
        System.out.println("El número menor del arreglo es : "+numeroMenor);
        System.out.println("El rango de los números ingresados es : "+(numeroMayor - numeroMenor));
    }

    //Esta función obtiene el número mayor.

    public static int getNumeroMayor(int arreglo[]){
        int numeroMayor = 0;
        for(int i=0 ; i<20 ; i++){
            if(numeroMayor < arreglo[i]){
                numeroMayor = arreglo[i];
            }
        }
        return numeroMayor;
    }

    //Esta función obtiene el número menor 

    public static int getNumeroMenor(int arreglo[]){
        int numeroMenor = arreglo[0];
        for(int i=0 ; i<20 ; i++){
            if(numeroMenor > arreglo[i]){
                numeroMenor = arreglo[i];
            }
        }
        return numeroMenor;
    }
}