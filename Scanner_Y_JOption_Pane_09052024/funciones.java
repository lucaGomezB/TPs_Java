public class funciones{
    public void mostrarOperaciones(double numero1, double numero2){
        System.out.println("La suma de los 2 números es : "+(numero1+numero2));
        System.out.println("La resta del primero con el segundo es : "+(numero1-numero2));
        System.out.println("La resta del segundo con el primero es : "+(numero2-numero1));
        System.out.println("La multiplicación de los 2 números es : "+(numero1*numero2));
        System.out.println("La división del primer número con el segundo es : "+(numero1/numero2)+" . Su módulo es : "+(numero1 % numero2));
        System.out.println("La división del segundo número con el primero es : "+(numero2/numero1)+" . Su módulo es : "+(numero1 % numero2));

    }
}