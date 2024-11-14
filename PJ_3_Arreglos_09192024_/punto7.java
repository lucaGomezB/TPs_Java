//El siguiente programa permite al usuario ingresar 20 números, que serán sumados acorde a su grupo : 
//pares e impares.
import java.util.Scanner;
public class punto7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaPares = 0;
        int sumaImpares = 0; 
        int arreglo [];
        arreglo = new int[20];
        System.out.println("Porfavor ingrese 20 números, por separado.");
        for (int i = 0; i < 20; i++) {
            arreglo[i] = sc.nextInt();
            if(arreglo[i] % 2 == 0){
                sumaPares += arreglo[i];
            }else{
                sumaImpares += arreglo[i];
            }
        }
        System.out.println("La suma de los números pares es : "+sumaPares);
        System.out.println("La suma de los números impares es : "+sumaImpares);
    }
}