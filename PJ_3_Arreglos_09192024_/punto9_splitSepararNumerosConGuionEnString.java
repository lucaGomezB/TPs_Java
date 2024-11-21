//El siguiente programa permite al usuario ingresar una cadena de números separados por guiones
//Con split, se convierte la cadena en un arreglo, calcula la suma total de los elementos y el promedio dado.
import java.util.Scanner;
public class punto9_splitSepararNumerosConGuionEnString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int promedio = 0; 
        System.out.println("Porfavor ingrese números separados solo por guiones (23-434-24-21...)");
        String cadena = sc.next();
        String regex = "[-\\s]";
        String[] arregloString = cadena.split(regex);
        int arregloInt[]=
        arregloInt = new int[arregloString.length];
        for (int i = 0; i < arregloInt.length; i++) {
            contador++;
            arregloInt[i] = Integer.parseInt(arregloString[i]);
            promedio += arregloInt[i];
        }
        System.out.println("La suma total de los elementos es : "+promedio);
        System.out.println("El promedio de la suma de los elementos es : "+(promedio / contador));
    }
}