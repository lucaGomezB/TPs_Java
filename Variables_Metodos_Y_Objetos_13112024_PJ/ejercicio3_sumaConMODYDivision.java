
import java.util.Scanner;

/*Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos (100 -
999) y por medio del uso de las operaciones matemáticas módulo 10 y división
por 10 efectué la suma de los 3 dígitos del número. Ejemplo ingreso 563, salida
del algoritmo 14. */
public class ejercicio3_sumaConMODYDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese un número de 3 dígitos.");
        int numero = 0;
        while(true){
            numero = sc.nextInt();
            if(numero>99 && numero<1000){
                break;
            }else{System.out.println("Porfavor ingrese un número de 3 dígitos.");}
        } 
        System.out.println("La suma entre cada uno de los dígitos es : "+funciones.sumaMedianteModuloYDivision(numero));
    }
}
