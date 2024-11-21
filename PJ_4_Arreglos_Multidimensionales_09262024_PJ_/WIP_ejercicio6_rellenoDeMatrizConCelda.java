
import java.util.Scanner;

//Codifique un programa que solicite al usuario un valor para la
//celda y que solicite la posición donde se desea almacenar el valor,
//cree una instancia de la clase Celda, asigne los valores cargados
//por el usuario y agregue la instancia a la lista matrizCuadrada;
//repita este proceso hasta que el usuario ingrese como valor la
//cadena “FIN”.

//Muestre por pantalla los valores cargados en matrizCuadrada.

//Codifique un método que reciba como parámetro los valores fila y
//columna y retorne el valor almacenado, en caso de que la fila y la
//columna no exista retorne el mensaje “La fila y columna indicada
//no ha sido asignada”

public class WIP_ejercicio6_rellenoDeMatrizConCelda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de un lado de la matriz con la que se trabajará");
        Matriz matriz = new Matriz(sc.nextInt());
        while(true){
            System.out.println("Está a punto de cargar o ver una celda, escriba FIN para mostrar la matriz y terminar el programa, o |ENTER| para seguir.");
            String opcion = sc.nextLine();
            if(opcion.equalsIgnoreCase("FIN")){
                break;
            }else{
                System.out.println("Escriba | 1 | para cargar una celda, o escriba | 2 | para ver una celda.");
                opcion = sc.nextLine();
                if(opcion.equals("1")){
                    System.out.println("Escriba el índice de la fila : ");
                    int fila = Integer.parseInt(sc.nextLine());
                    System.out.println("Escriba el índice de la columna : ");
                    int columna = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese el valor de la celda : ");
                    String valor = sc.nextLine();
                    cargarCelda();
                }else{
                    System.out.println("Escriba el índice de la fila : ");
                    int fila = sc.nextInt();
                    System.out.println("Escriba el índice de la columna : ");
                    int columna = sc.nextInt();
                    mostrarValor(fila, columna, matriz);
                }
            }
        }
        sc.close();
        mostrarMatriz();
    }

    //La función mostrarValor muestra el valor almacenado en la posición que indique el usuario,
    //Si la posición no existe, devuelve el mensaje "La fila y columna indicada no ha sido asignada".

    public static void mostrarValor(int fila, int columna, Matriz matriz){
        
    }

    public static void mostrarMatriz(){

    }

    public static void cargarCelda(){
        
    }
}
