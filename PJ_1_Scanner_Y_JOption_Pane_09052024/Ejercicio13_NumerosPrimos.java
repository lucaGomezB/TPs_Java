
import java.util.Scanner;

/* Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel
solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible
entre 5, sin embargo, 17 si es primo. Un buen truco para calcular la raíz cuadrada del numero e
ir comprobando que si es divisible desde ese número hasta 1.
NOTA: Si se introduce un número menor o igual que 1, directamente es no primo. */
public class Ejercicio13_NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese un número : ");
        double numero = sc.nextInt();
        int contador = 0;
        if(numero <= 1){
            System.out.println("Su número no es primo.");
        }else{
            for (int i = 1; i <= numero; i++) {
                if((numero % i) == 0){
                    contador++;
                }else if(contador >= 3){break;}
            }
            if(contador == 2){
                System.out.println("Su número es primo.");
            }else{
                System.out.println("Su número no es primo.");
            } 
        }  
    }
}
