//Acá el usuario llena los array, uno de 5 posiciones y otro de 10.
//Luego, un tercer arreglo de 5 posiciones contiene en cada casilla la suma de la multiplicación de 
//de cada elemento del array uno por los del array 2.
import java.util.Scanner;
public class punto11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese 5 números enteros : ");
        int array1[];
        array1 = new int[5];
        for (int i = 0; i < 5; i++){
            array1[i] = sc.nextInt();
        }
        System.out.println("Ahora ingrese 10 números enteros : ");
        int array2[];
        array2 = new int[10];
        for (int i = 0; i < 10; i++){
            array2[i] = sc.nextInt();
        }
        int array3[];
        array3 = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int e = 0; e < 10; e++) {
                array3[i] += array1[i] * array2[e];
            }
        }
        System.out.println("El primer array es : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("El segundo array es : ");
        for (int i = 0; i < 10; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("El tercer array es : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(array3[i]);
        }
    }
}