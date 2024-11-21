//Este programa pide un número x entero mayor o igual que 3 y menor o igual que 10.
//Crea una matriz de longitud [x], [x], de tipo int
//El usuario llena la matriz.
//Se suman las columnas de la matriz, renglón por renglón, llenando un arreglo columna por columna
//Se suman los resultados de las columnas para dar un número que se muestra en pantalla.
import java.util.Scanner;
public class ejercicio3_sumatoriaDeMatriz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condicion = true;
        int x = 0;
        while(condicion){
            System.out.println("Porfavor ingrese un número entero mayor o igual que 3 y menor o igual que 10.");
            x = sc.nextInt();
            if(x >=3){
                if(x <= 10){
                        condicion = false;
                }
            }
        }
        int[][] matriz = new int[x][x];
        matriz = llenarMatriz(matriz,sc,x);
        int[] arreglo = new int[x];
        arreglo = llenarArreglo(matriz,x,arreglo);
        System.out.println("La suma de las columnas individuales es : ");
        for (int i = 0; i < x; i++) {
            System.out.println("Columna "+(i+1)+" : "+arreglo[i]);
        }
        System.out.println("La suma del arreglo es : "+devolverEntero(arreglo, x));
    }

    //Esta función hace que el usuario llene la matriz.

    public static int[][] llenarMatriz(int[][] matriz,Scanner sc,int x){
        System.out.println("Porfavor llene la matriz de "+x+" x "+x);
        for (int i = 0; i < x; i++) {
            for (int o = 0; o < x; o++) {
                matriz[i][o] = sc.nextInt();
            }
        }
        return matriz;
    }

    //Esta función llena el arreglo.

    public static int[] llenarArreglo(int[][] matriz, int x, int[] arreglo){
        int suma = 0;
        for(int i = 0;i < x;i++){
            suma = 0;
            for (int o = 0; o < x; o++) {
                suma += matriz[o][i];
            }
            arreglo[i] = suma;
        }
        return arreglo;
    }

    //Esta función devuelve un número entero, la suma del arreglo.

    public static int devolverEntero(int[] arreglo, int x){
        int nro = 0;
        for (int i = 0; i < x; i++) {
            nro += arreglo[i];
        }
        return nro;
    }
}