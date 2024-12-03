/*Escriba una aplicación para almacenar aleatoriamente 20 números enteros positivos pares
del 1 al 100, de los cuales se desea saber:
a) su promedio aritmético
b) cuántos de los números son iguales al promedio aritmético
c) cuántos de los números son mayores que el promedio aritmético
d) cuántos de los números son menores que el promedio aritmético */
public class punto5_identificadorNumerosAleatorios {
    public static void main(String[] args) {
        int[] enterosPositivosPares = new int[20];
        int numero = 0;
        for (int i = 0; i < 20; i++) {
            numero = funciones.generarNumeroEnteroPositivoPar();
            enterosPositivosPares[i] = numero;
        }
        System.out.println("Numeros generados aleatoriamente : ");
        for (int i = 0; i < 20; i++) {
            System.out.print(enterosPositivosPares[i] + " ");
        }
        System.out.println();
        int promedio = obtenerPromedio(enterosPositivosPares);
        System.out.println("El promedio de los números es : "+promedio);
        averiguarEstados(enterosPositivosPares, promedio);
    }

    public static int obtenerPromedio(int[] enterosPositivosPares){
        //Con esta función se obtiene el promedio del arreglo.
        int promedio = 0;
        for (int i = 0; i < 20; i++) {
            promedio += enterosPositivosPares[i];
        }
        promedio /= 20; 
        return promedio;
    }

    public static void averiguarEstados(int[] enterosPositivosPares, double promedio){
        /*Con este método se obtiene información del arreglo usando el promedio:
          Cantidad de números mayores, iguales o inferiores al promedio
        */
        int iguales = 0;
        int superiores = 0;
        int inferiores = 0;
        for (int i = 0; i < 20; i++) {
            if(enterosPositivosPares[i] == promedio){
                iguales++;
            }else if(enterosPositivosPares[i] >= promedio){
                superiores++;
            }else{
                inferiores++;
            }
        }
        System.out.println("En total, hay : \n"+iguales+" números iguales al promedio, \n"+superiores+" números superiores al promedio y \n"+inferiores+" números inferiores al promedio.");
    }
}