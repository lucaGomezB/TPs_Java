
import java.util.Scanner;

/* 
Crea un programa que calcule la letra de un DNI a partir del número de DNI que
introduzca el usuario. Es decir, se debe pedir el DNI sin la letra por teclado y el programa
nos devolverá el DNI completo (con la letra).
Para calcular la letra, se debe tomar el resto de dividir nuestro número de DNI entre 23.
El resultado debe estar por tanto entre 0 y 22.
Crea un método obtenerLetra(int numeroDNI) donde según el resultado de la anterior
fórmula busque en un array de caracteres la posición que corresponda a la letra. 
*/
public class punto10{
    public static String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringDni = "";
        while(true){
            System.out.println("Ingrese su DNI : ");
            stringDni = sc.next();
            if(stringDni.length() <= 9){
                break;
            }
        }
        int indiceLetra = (Integer.parseInt(stringDni) % 23);
        for (int i = 0; i < 23; i++) {
            if(indiceLetra == i){
                stringDni = stringDni.concat(letras[i]);
            }
        }
        System.out.println("Su DNI con letra es : "+stringDni);
    }
}