/* Escriba una aplicación que:
a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un
arreglo unidimensional.
b) determine y muestre el mayor de los números en el arreglo
c) determine y muestre el menor de los números del arreglo calcule y muestre el rango
(diferencia entre el mayor y el menor) de los elementos en el arreglo */

import java.util.Scanner;

public class punto4_rellenoYDeterminacionDeArreglo {
    public static void main(String[] args) {
        double[] numerosDecimales = new double[20];
        numerosDecimales = rellenarArreglo(numerosDecimales);
        averiguadorDePosicionYDiferencia(numerosDecimales);
    }
    public static double[] rellenarArreglo(double[] numerosDecimales){
        //Esto hace que el usuario rellene el arreglo.
        for (int i = 0; i < 20; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Porfavor ingrese un número : ");
            numerosDecimales[i] = sc.nextDouble();
        }
        return numerosDecimales;
    }
    public static void averiguadorDePosicionYDiferencia(double[] numerosDecimales){
        //Esto determina mayor, menor y rango del arreglo : 
        double menor = numerosDecimales[0];
        double mayor = numerosDecimales[0]; 
        for (int i = 0; i < 20; i++) {
            if(numerosDecimales[i] > mayor){
                mayor = numerosDecimales[i];
            }else if (numerosDecimales[i] < menor){
                menor = numerosDecimales[i];
            }
        }
        System.out.println("El mayor número en su arreglo es : "+mayor+" | El menor es : "+menor);
        System.out.println("El rango es : "+(mayor - menor));
    }
}
