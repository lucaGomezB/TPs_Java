/* Crea un array o arreglo unidimensional con un tamaño de 5, asignale los valores
numéricos manualmente (los que tú quieras) y muestralos por pantalla. Solicite los
números mediante un bucle. */
import java.util.Scanner;
public class punto2_array5Numeros{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[5];
        for(int i = 0;i<5;i++){
            System.out.println("Porfavor ingrese un número");
            numeros[i] = sc.nextDouble();
        }
        System.out.println("Su arreglo es :");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i]+" ");
        }
    }
}