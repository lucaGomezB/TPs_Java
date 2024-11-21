/* Escriba una aplicación para almacenar aleatoriamente 20 números enteros positivos pares
del 1 al 100, de los cuales se desea saber:
a) su promedio aritmético
b) cuántos de los números son iguales al promedio aritmético
c) cuántos de los números son mayores que el promedio aritmético
d) cuántos de los números son menores que el promedio aritmético */
import java.util.Random;
public class punto5_generadorNumerosAleatoriosYClasificador{
    public static void main(String[] args) {
        Random rand = new Random();
        int arreglo [];
        int nro = 0;
        boolean condicion = true;
        arreglo = new int[20];
        for(int i = 0 ; i < 20 ; i++){
            condicion = true;
            while(condicion){
                nro = rand.nextInt(100);
                if(nro % 2 == 0){
                    arreglo[i] = nro;
                    condicion = false;
                }
            }
        }
        int promedio = getPromedio(arreglo);
        System.out.println("El promedio de los números generados es : "+promedio);
        int cantNumerosIguales = 0;
        int cantNumerosMayores = 0;
        int cantNumerosMenores = 0;
        for(int i = 0 ; i < 20 ; i++){
            if(promedio == arreglo[i]){
                cantNumerosIguales++;
            }else if(promedio > arreglo[i]){
                cantNumerosMenores++;
            }else if(promedio < arreglo[i]){
                cantNumerosMayores++;
            }
        }
        System.out.println("La cantidad de números iguales al promedio es : "+cantNumerosIguales);
        System.out.println("La cantidad de números mayores al promedio es : "+cantNumerosMayores);
        System.out.println("La cantidad de números menores al promedio es : "+cantNumerosMenores);
    }

    //Esta función obtiene el promedio

    public static int getPromedio(int arreglo[]){
        int promedio = 0;
        int vueltas = 0;
        for (int i = 0 ; i < 20 ; i++) {
            promedio += arreglo[i];
            vueltas++;
        }
        promedio = promedio / vueltas;
        return promedio;
    }
}