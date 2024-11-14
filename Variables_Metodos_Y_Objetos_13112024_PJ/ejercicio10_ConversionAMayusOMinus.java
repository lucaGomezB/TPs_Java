
import java.util.Scanner;

/*Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el
usuario lo pida y mostraremos el resultado por pantalla. */
public class ejercicio10_ConversionAMayusOMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese una frase");
        String frase = sc.nextLine();
        int opcion = 0;
        while(true){
            System.out.println("Escriba 1 si desea convertir la frase a mayúsculas, o 2 si la quiere convertir a minúsculas. También puede escribir 3 para salir.");
            opcion = sc.nextInt(); 
            switch(opcion){
                case 1 -> frase = frase.toUpperCase();
                case 2 -> frase = frase.toLowerCase();
            }
            if(opcion == 3){
                break;
            }
            System.out.println("Su frase es : "+frase);
        }
    }
}
