import java.util.Random;
import java.util.Scanner;
public class integradorT1{
    public static void main(String[] args){
        //Pida al usuario la dimensión de la matriz que se llenará. Valide que la dimensión ingresada
        //sea un número impar entre 3 y 15, caso contrario solicite nuevamente el valor
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int dimensionMatriz = 0;
        while (true) { 
        while (true) { 
            System.out.println("Porfavor ingrese un número impar entre 3 y 15.");    
            dimensionMatriz = sc.nextInt();
            if(dimensionMatriz % 2 != 0){
                if(dimensionMatriz >= 3 && dimensionMatriz <= 15){
                    break;
                }
            }
        }
        //Cree la matriz con el tamaño indicado, complete únicamente la última fila de la matriz de
        //forma manual con valores enteros no nulos solicitados al usuario, distintos a cero, entre 10
        //y 99. Valide que los números cumplan con el rango indicado caso contrario solicite el
        //numero nuevamente. El resto de las filas deberá completarse usando la función Random
        //para la generación de números aleatorios, también en el rango de 10 a 99. 25%
        int [][] matriz = new int[dimensionMatriz][dimensionMatriz];
        System.out.println("Porfavor ingrese "+dimensionMatriz+" numeros, entre 10 y 99 : ");
        for (int i = 0; i < dimensionMatriz; i++) {
            while(true){
                matriz[dimensionMatriz - 1][i] = sc.nextInt();
                if(matriz[dimensionMatriz - 1][i] >= 10 && matriz[i][dimensionMatriz - 1] <= 99){
                    break;
                }else{
                    System.out.println("Porfavor ingrese un número entre 10 y 99.");
                }
            }
        }
        System.out.println("");
        //El resto de las filas deberá completarse usando la función Random
        //para la generación de números aleatorios, también en el rango de 10 a 99. 25%
        for (int i = 0; i < dimensionMatriz-1; i++) {
            for (int j = 0; j < dimensionMatriz; j++) {
                matriz[i][j] = rand.nextInt(10,99);
            }
        }
        //Muestre por pantalla la matriz resultante del paso 2 5%
        for (int i = 0; i < dimensionMatriz; i++) {
            for (int j = 0; j < dimensionMatriz; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println();
        //Ejecute la función “obtenerValoresCentrales” y muestre por pantalla la matriz resultante del paso 4 5%
        int[] valoresCentrales = new int[9];
        valoresCentrales = obtenerValoresCentrales(matriz);
        System.out.println("Los valores centrales de la matriz son : ");
        for (int i = 0; i < 9; i++) {
            System.out.println(valoresCentrales[i]);
        }
        System.out.println("");
        //Ordene la matriz obtenida en el paso 4 de menor a mayor, aplicando método de la burbuja 5%
        int aux = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8-i; j++) {
                if(valoresCentrales[j] > valoresCentrales[j+1]){
                    aux = valoresCentrales[j+1];
                    valoresCentrales[j+1] = valoresCentrales[j];
                    valoresCentrales[j] = aux;
                }
            }
        }
        //Muestre por pantalla la matriz resultante del paso 6 5%
        System.out.println("Los valores centrales de la matriz, ordenados de menor a mayor son : ");
        for (int i = 0; i < 9; i++) {
            System.out.println(valoresCentrales[i]);
        }
        System.out.println("");

        //Al terminar el paso 8, muestre por pantalla el valor promedio calculado en el paso anterior y
        //finalmente pregunte al usuario si quiere finalizar el programa o desea iniciar nuevamente el
        //programa, si el usuario indica que quiere iniciar nuevamente el programa deberá comenzar
        //nuevamente con el paso 1, caso contrario el programa termina. 10%

        System.out.println("El promedio de las matrices es : "+calcularPromedioDeMatrices(matriz, valoresCentrales));
        System.err.println("Quiere terminar el programa? S / N");
        String opcion = sc.next();
        if (opcion.equals("n")) {
            System.out.println("Que tenga un lindo día!!!");
            break;
        }
        if (opcion.equals("N")){
            System.out.println("Que tenga un lindo día!!!");
            break;
        }
    }
}
    //Cree una función/método “obtenerValoresCentrales” que obtenga el valor central de la
    //matriz y los valores colindantes al centro de la matriz y los asigne en una matriz de 1
    //dimensión, retorne la matriz obtenida 20%
    public static int[] obtenerValoresCentrales(int[][] matriz){
        int[] arreglo = new int[9];
        int centroDeLaMatriz = matriz.length / 2;
        arreglo[0] = matriz[centroDeLaMatriz-1][centroDeLaMatriz-1];
        arreglo[1] = matriz[centroDeLaMatriz-1][centroDeLaMatriz];
        arreglo[2] = matriz[centroDeLaMatriz-1][centroDeLaMatriz+1];
        arreglo[3] = matriz[centroDeLaMatriz][centroDeLaMatriz-1];
        arreglo[4] = matriz[centroDeLaMatriz][centroDeLaMatriz];
        arreglo[5] = matriz[centroDeLaMatriz][centroDeLaMatriz+1];
        arreglo[6] = matriz[centroDeLaMatriz+1][centroDeLaMatriz-1];
        arreglo[7] = matriz[centroDeLaMatriz+1][centroDeLaMatriz];
        arreglo[8] = matriz[centroDeLaMatriz+1][centroDeLaMatriz+1];
        return arreglo;
    }

    //Cree una función “calcularPromedioDeMatrices” que reciba como parámetros la matriz
    //resultante en el paso 2 y la matriz resultante del paso 4, calcule el promedio de cada una de
    //las matrices, muestre los resultados por pantalla (suma total, cantidad de elementos y
    //promedio) y retorne finalmente el promedio de los 2 resultados calculados. 20%
    public static double calcularPromedioDeMatrices (int[][] matriz, int[] valoresCentrales){
        int suma = 0;
        int promedio1 = 0;
        int promedio2 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma total de los elementos en la matriz es de : "+suma);
        promedio1 = suma / (matriz.length * matriz.length);
        System.out.println("El promedio de la matriz es de : "+promedio1);
        for (int i = 0; i < 9; i++) {
            suma += valoresCentrales[i];
        }
        System.out.println("La suma total de los elementos en el arreglo es de : "+suma);
        promedio2 = suma / 9;
        System.out.println("El promedio del arreglo es de : "+promedio2);
        System.out.println("Las matrices contienen "+((matriz.length ^ 2)+9)+" elementos.");
        double promedioFinal = (promedio1+promedio2) / 2;
        return promedioFinal;
    }
}