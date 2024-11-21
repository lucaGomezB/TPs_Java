//El siguiente programa pide por pantalla 2 valores enteros, los guarda en x e y
//Crea el array 1 [x][y] de tipo entero y lo llena el usuario
//Crea el array 2 [y][x] de tipo entero y lo llena el usuario
//Crea el array 3 [x][y] de tipo entero y es rellenado por la multiplicación de las filas del primer array por las columnas del array 2
import java.util.Scanner; 
public class ejercicio2_multiplicacionEntreMatrices{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese un número entero");
        int x = sc.nextInt();
        System.out.println("Porfavor ingrese otro número entero");
        int y = sc.nextInt();
        int[][] arreglo1 = new int[x][y];
        arreglo1 = rellenarArreglo1(arreglo1,x,y,sc);
        int[][] arreglo2 = new int[y][x];
        arreglo2 = rellenarArreglo2(arreglo2,x,y,sc);
        int[][] arreglo3 = new int [x][y];
        arreglo3 = rellenarArreglo3(arreglo3,arreglo1,arreglo2,sc,x,y);
    }

    //Esta función rellena el arreglo1 y lo muestra por pantalla.

    public static int[][] rellenarArreglo1(int[][] arreglo1,int x,int y,Scanner sc){
        for (int i = 0; i < x; i++) {
            if(i == 0){
            System.out.println("Porfavor ingrese un número entero");
            }else{System.out.println("Porfavor ingrese otro número entero");}
            arreglo1[i][0] = sc.nextInt();
            for (int o = 1; o < y; o++) {
                System.out.println("Porfavor ingrese otro número entero");
                arreglo1[i][o] = sc.nextInt();
            }
        }
        //Rodeo el bucle for con print "" para que se vea mejor.
        System.out.println("");
        System.out.println("La matriz ingresada es : ");
        System.out.println("");
        for(int i = 0; i < arreglo1.length; i++){
            System.out.println("Fila "+(i+1)+" contiene a : ");
            for (int o = 0; o < arreglo1[0].length; o++) {
                System.out.println("    Columna "+(o+1)+" es : "+arreglo1[i][o]);
            }
        }
        System.out.println("");
        return arreglo1;
    }

    //Esta función rellena al arreglo2 y lo muestra por pantalla.

    public static int[][] rellenarArreglo2(int[][] arreglo2,int x,int y,Scanner sc){
        for (int i = 0; i < y; i++) {
            if(i == 0){
            System.out.println("Porfavor ingrese un número entero");
            }else{System.out.println("Porfavor ingrese otro número entero");}
            arreglo2[i][0] = sc.nextInt();
            for (int o = 1; o < x; o++) {
                System.out.println("Porfavor ingrese otro número entero");
                arreglo2[i][o] = sc.nextInt();
            }
        }
        System.out.println("");
        System.out.println("La matriz ingresada es : ");
        System.out.println("");
        for(int i = 0; i < arreglo2.length; i++){
            System.out.println("Fila "+(i+1)+" contiene a : ");
            for (int o = 0; o < arreglo2[0].length; o++) {
                System.out.println("    Columna "+(o+1)+" es : "+arreglo2[i][o]);
            }
        }
        System.out.println("");
        return arreglo2;
    }

    //Esta función rellena el arreglo3 y lo muestra por pantalla. !!! IMPORTANTE !!! El número de columnas en la primera matriz debe ser igual al número de filas de la seguda.

    public static int[][] rellenarArreglo3(int[][] arreglo3,int[][] arreglo1,int[][] arreglo2,Scanner sc,int x,int y){ 
         //arreglo1 tiene más filas
        for (int i = 0; i < x; i++){
            for (int o = 0; o < y; o++) {
                arreglo3[i][o] = arreglo1[i][o] * arreglo2[o][i];
            }
        }
        System.out.println("");
        System.out.println("El resultado de la tercera matriz surge de la multiplicación  : ");
        System.out.println("");
        for(int i = 0; i < arreglo3.length; i++){
            System.out.println("Fila "+(i+1)+" contiene a : ");
            for (int o = 0; o < arreglo3[0].length; o++) {
                System.out.println("    Columna "+(o+1)+" es : "+arreglo3[i][o]);
            }
        }
        System.out.println("");
        return arreglo3;
    }
}
