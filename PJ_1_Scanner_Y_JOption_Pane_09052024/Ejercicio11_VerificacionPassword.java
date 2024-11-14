
import java.util.Scanner;

/*Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te
pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá más la contraseña y 
mostrara un mensaje diciendo “Acceso Correcto”. Piensa bien en la condición de
salida (3 intentos y si acierta sale, aunque le queden intentos). */
public class Ejercicio11_VerificacionPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "abc123";
        String intento = "";
        System.out.println("Porfavor introduzca la contraseña : ");
        for (int i = 0; i < 3; i++) {
            intento = sc.nextLine();
            if(intento.equals(password)){
                System.out.println("Acceso correcto.");
                break;
            }else if (i == 2) {
                System.out.println("Se acabaron sus intentos, intente de nuevo más tarde.");
            }else{
                System.out.println("Contraseña incorrecta.");
            }
        }
    }
}
