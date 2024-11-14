import java.util.Scanner;
/*Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta,
multiplicación, división y módulo (resto de la división).*/
public class Ejercicio3_Operaciones{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese un número : ");
        double numero1 = sc.nextDouble();
        System.out.println("Porfavor ingrese otro número : ");
        double numero2 = sc.nextDouble();
        funciones.mostrarOperaciones(numero1, numero2);
    }
}