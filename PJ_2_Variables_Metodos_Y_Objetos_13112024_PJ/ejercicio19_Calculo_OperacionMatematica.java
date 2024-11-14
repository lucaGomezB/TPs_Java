/*Cree una clase OperacionMatematica 
...
Cree una clase Calculo que contenga un método main, donde cree una
instancia de la clase OperacionMatematica, asigne 2 valores para las variables
de la instancia y ejecute la función aplicarOperacion, pasando como parámetro
primero “+”, después “-”, a continuación “*” y finalmente “/”. Muestre por
pantalla el resultado de las operaciones.*/
import java.util.Scanner;
public class ejercicio19_Calculo_OperacionMatematica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor2 = 0;
        OperacionMatematica operacionMatematica = new OperacionMatematica(); 
        while (true) {
            System.out.println("Porfavor ingrese un valor decimal: ");
            double valor1 = sc.nextDouble();
            operacionMatematica.setValor1(valor1);
            System.out.println("Ingrese otro valor decimal distinto de 0 :");
            while (true) { 
                valor2 = sc.nextDouble();
                if(valor2 != 0){
                    break;
                }else{
                    System.out.println("Porfavor ingrese un número decimal distinto de 0.");
                }
            }
            operacionMatematica.setValor2(valor2);
            System.out.println("Se obtiene por resultado de las siguientes operaciones : ");
            System.out.println(valor1+" + "+valor2+" = "+operacionMatematica.aplicarOperacion("+"));
            
            System.out.println(valor1+" - "+valor2+" = "+operacionMatematica.aplicarOperacion("-"));
            
            System.out.println(valor1+" * "+valor2+" = "+operacionMatematica.aplicarOperacion("*"));
            
            System.out.println(valor1+" / "+valor2+" = "+operacionMatematica.aplicarOperacion("/"));
        }
    }   
}
