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
import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String valorCelda = "";
        int fila = 0;
        int columna = 0;
        while(true){
            System.out.println("Para salir del programa, escriba | FIN | ");
            System.out.println("Porfavor ingrese un valor para la celda : ");
            valorCelda = sc.next();
            if(valorCelda.equals("FIN")){
                break;
            } 
            System.out.println("A continuación, ingresará la posición en la que se almacenará su valor : ");
            System.out.println("    Porfavor ingrese una fila.");
            fila = sc.nextInt();
            System.out.println("    Porfavor ingrese una columna.");
            columna = sc.nextInt();
            Celda celda = new Celda(fila,columna,valorCelda);
            Matriz.setCelda(fila, columna, celda);
        }
    }

    //La función mostrarValor muestra el valor almacenado en la posición que indique el usuario,
    //Si la posición no existe, devuelve el mensaje "La fila y columna indicada no ha sido asignada".

    public static void mostrarValor(int fila, int columna){
        
    }
}
