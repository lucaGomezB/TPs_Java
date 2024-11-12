//Esta app carga 10 dígitos enteros del usuario en un arreglo.
//Luego, ordena de forma ascendente los dígitos en un arreglo, y en otro los ordena descendentemente.
import java.util.Scanner;
public class punto8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[];
        arreglo = new int[10];
        boolean condicion  = true;
        int contador = 0;
        int momentario = 0;
        System.out.println("Porfavor ingrese 10 dígitos, uno a la vez.");
        //Esto verifica que el número ingresado sea un dígito
        for(int i = 0 ; i<10 ; i++){
            condicion = true;
            while(condicion){
                arreglo[i] = sc.nextInt();
                if(arreglo[i] < 10){
                    if(arreglo[i] > -1){
                        condicion = false;
                    }else System.out.println("Porfavor ingrese un dígito válido");
                }else System.out.println("Porfavor ingrese un dígito válido");
            }
        }
        //Acá se crea un arreglo ordenado ASCENDENTEMENTE
        int arregloA[];
        arregloA = new int[10];
        //Con esto puedo copiar un arreglo, lo iba a hacer con un for, pero VSCode lo recomendó!
        System.arraycopy(arreglo, 0, arregloA, 0, 10);
        while(contador<9){
        for (int i = 0; i < arregloA.length - 1; i++) {
            if (arregloA[i] > arregloA[i+1]) {
                momentario = arregloA[i];
                arregloA[i] = arregloA[i+1];
                arregloA[i+1] = momentario;
                contador++;
            }
        }
        }
        //Acá se crea un arreglo ordenado DESCENDENTEMENTE
        int arregloD[];
        arregloD = new int[10];
        for (int i = 0; i < 10; i++){
            arregloD[i] = arregloA[contador];
            contador--;
        }
        //Acá se muestran los resultados : 
        System.out.println("El arreglo ingresado, ordenado de forma ascendente es : ");
        for (int i = 0; i < 10; i++) {
            System.out.println(arregloA[i]);
        }
        System.out.println("El arreglo ingresado, ordenado de forma descendente es : ");
        for (int i = 0; i < 10; i++) {
            System.out.println(arregloD[i]);
        }
    }
}