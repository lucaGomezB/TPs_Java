/* Crea un programa que permita al usuario ingresar un conjunto de 20 números enteros
aleatorios en un array unidimensional. El programa debe calcular la suma de los números
pares y la suma de los números impares por separado, y luego mostrar los resultados. */
import java.util.Scanner;

public class punto7_sumatoriaCondicional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosAleatorios = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.println("Porfavor ingrese un número entero : ");
            numerosAleatorios[i] = sc.nextInt();
        }
        int sumatoriaPares = 0;
        int sumatoriaImpares = 0; 
        for (int i = 0; i < 20; i++) {
            if(numerosAleatorios[i] % 2 == 0){
                sumatoriaPares += numerosAleatorios[i];
            }else{
                sumatoriaImpares += numerosAleatorios[i];
            }
        }
        System.out.println("La sumatoria de los números pares es : "+sumatoriaPares+"\n La sumatoria de los números impares es : "+sumatoriaImpares);
    }
}