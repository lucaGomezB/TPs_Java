/* Codifique un programa que solicite un número entero mayor a cero y que
mediante recursión sume todos los números números naturales desde el
número ingresado hasta 1.
Ejemplo: Ingreso 10
El programa debe sumar 10 + 9 + 8 +7 +6 + 5 + 4 + 3 + 2 + 1 */
import java.util.Scanner;

public class ejercicio21_SumaRecursiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese un número mayor a 0.");
        int numero = 0;
        while (true){
            numero = sc.nextInt();
            if(numero > 0){
                break;
            }else{System.out.println("Porfavor ingrese un número mayor a 0.");}
        }
        System.out.println("El resultado de la suma recursiva de su número es : "+realizarSumaRecursiva(numero));
    }
    public static int realizarSumaRecursiva(int numero){
        if (numero == 1) {
            return 1;
        } else {
            return numero + realizarSumaRecursiva(numero - 1);
        }
    }
}
