//Este programa pide un DNI, 
//y al número ingresado le calcula una letra (conseguir DNI % 23).
//Con el método obtenerLetra(int numeroDNI), se busca en un array de caracteres y se le asigna una letra
import java.util.Scanner;
public class punto10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arreglo [];
        arreglo = new String[23]; 
        arreglo[0] =  "T"; arreglo[1] = "R"; arreglo[2] = "W"; arreglo[3] = "A"; arreglo[4] = "G"; arreglo[5] = "M"; arreglo[6] = "Y"; arreglo[7] = "F"; arreglo[8] = "P"; arreglo[9] = "D"; arreglo[10] = "X"; arreglo[11] = "B"; arreglo[12] = "N"; arreglo[13] = "J"; arreglo[14] = "Z"; arreglo[15] = "S"; arreglo[16] = "Q"; arreglo[17] = "V";  arreglo[18] = "H";  arreglo[19] = "L";  arreglo[20] = "C";  arreglo[21] = "K";  arreglo[22] = "E";
        System.out.println("Porfavor ingrese el número de su DNI : ");
        int numeroDNI = sc.nextInt();
        System.out.println("Su DNI con la letra es : "+numeroDNI+obtenerLetra(numeroDNI, arreglo));
    }
    public static String obtenerLetra(int numeroDNI, String arreglo[]){
        String letra = "";
        for (int i = 0; i < numeroDNI%23; i++) {
            letra = arreglo[i];
        }
        return letra;
    }
}