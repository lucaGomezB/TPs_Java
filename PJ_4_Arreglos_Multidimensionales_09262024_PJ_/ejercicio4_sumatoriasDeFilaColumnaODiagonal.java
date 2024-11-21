//Este programa pide un número entero x mayor o igual que 4 y menor o igual que 10
//Crea int[x][x] matriz
//Se ofrecen 5 opciones al usuario
//Cada opción hace algo
import java.util.Scanner;
public class ejercicio4_sumatoriasDeFilaColumnaODiagonal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condicion = true;
        int x = 0;
        while(condicion){
            System.out.println("Porfavor ingrese un número entero mayor o igual que 4 y menor o igual que 10.");
            x = sc.nextInt();
            if(x >= 4){
                if(x <= 10){
                        condicion = false;
                }
            }
        }
        int[][] matriz = new int[x][x];
        System.out.println("Porfavor rellene la matriz.");
        for (int i = 0; i < x; i++) {
            for (int o = 0; o < x; o++) {
                matriz[i][o] = sc.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            System.out.println("Fila "+(i)+" :");
            for (int o = 0; o < x; o++) {
                System.out.println("    Columna "+(o)+" : "+matriz[i][o]);    
            }
        }
        //Acá empiezan las opciones del usuario
        System.out.println("a) Sumar una fila a elección.");
        System.out.println("b) Sumar una columna a elección.");
        System.out.println("c) Sumar la diagonal principal.");
        System.out.println("d) Sumar la diagonal inversa.");
        System.out.println("e) Calcular media de los valores de la matriz.");
        String opcion = sc.next();
        opcion = opcion.toLowerCase();
        int opcion1 = 0;
        int suma = 0; 
        int contador = 0;
        condicion = true;
        switch(opcion){
            case "a" ->{
                while(condicion){
                    System.out.println("Elija la fila : ");
                    opcion1 = sc.nextInt();
                    if(opcion1 <= matriz[0].length){
                        if(opcion1 >= 0){
                            condicion = false;
                        }
                    }
                }
                for (int i = 0; i < matriz[0].length; i++) {
                    suma += matriz[opcion1][i]; 
                }
                System.out.println("La suma de la fila "+opcion1+" es : "+suma);
            } 
            case "b" ->{
                while(condicion){
                    System.out.println("Elija la columna : ");
                    opcion1 = sc.nextInt();
                    if(opcion1 <= matriz.length){
                        if(opcion1 >= 0){
                            condicion = false;
                        }
                    }
                    for (int i = 0; i < matriz.length; i++) {
                        suma += matriz[i][opcion1];
                    }
                    System.out.println("La suma de la columna "+opcion1+" es : "+suma);
                }
            }
            case "c" ->{
                for (int i = 0; i < matriz.length; i++) {
                        suma += matriz[i][i];
                }
                System.out.println("La suma de la diagonal principal es : "+suma);
            } 
            case "d" ->{
                for(int i = ((matriz.length)-1); i >= 0; i--){
                        suma += matriz[contador][i];
                        contador++;                 
                }
                System.out.println("La suma de la diagonal inversa es : "+suma);
            }
            case "e" ->{
                for (int i = 0; i < matriz.length; i++) {
                    for (int o = 0; o < matriz[0].length; o++) {
                        suma += matriz[i][o];
                        contador++;
                    }
                }
                System.out.println("La media de los valores da la matriz es : "+(suma / contador));
            }       
        }
    }
}