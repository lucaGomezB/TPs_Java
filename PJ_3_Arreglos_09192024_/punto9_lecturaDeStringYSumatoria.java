
import java.util.Scanner;

/* Solicite al usuario el ingreso de una cadena de números separadas por guiones medio, por
ejemplo:
45-9-8-6-45-23-21-74-96-32-45-25
Posteriormente aplique el método SPLIT de los String de Java para convertir la cadena en
un arreglo, y calcular la suma total de los elementos y el valor promedio calculado. */
public class punto9_lecturaDeStringYSumatoria{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese números separados por guiones (-)");
        String cadena = sc.nextLine();
        String[] numerosString = cadena.split("-");
        int suma = 0;
        for (String numeroStr : numerosString) {
            int numero = Integer.parseInt(numeroStr);
            suma += numero;
        }
        System.out.println("La sumatoria de los números ingresados es : "+suma);
        System.out.println("El promedio de los números ingresados es : "+((double) (suma / numerosString.length)));
    }
}