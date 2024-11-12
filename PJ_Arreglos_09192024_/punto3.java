import java.util.Scanner;
//Al siguiente programa se le indica la longitud de un array mediante input, luego lo rellena con múltiplos de 
//un número pedido al usuario.

//Al final, escribe el array haciendo uso de otra función.
public class punto3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arreglo;
        System.out.println("Porfavor ingrese un número entero para definir la longitud del arreglo.");
        int longitudArreglo = sc.nextInt();
        arreglo = new int[longitudArreglo];
        System.out.println("Porfavor ingrese un número entero al que le quiera averiguar los múltiplos hasta la longitud del arreglo establecido.");
        int nroUsuario = sc.nextInt();
        escribirMultiplos(arreglo, nroUsuario, longitudArreglo);
        //
    }
    public static void escribirMultiplos(int arreglo [],int nroUsuario, int longitudArreglo){
        for(int i = 0; i < longitudArreglo;i++){
            arreglo[i] = nroUsuario * (i+1);
            System.out.println(arreglo[i]);
        }
    }
} 