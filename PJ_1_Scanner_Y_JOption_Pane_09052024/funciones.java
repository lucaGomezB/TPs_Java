public class funciones{
    //Todas las Operaciones :
    public static void mostrarOperaciones(double numero1, double numero2){
        System.out.println("La suma de los 2 números es : "+(numero1+numero2));
        System.out.println("La resta del primero con el segundo es : "+(numero1-numero2));
        System.out.println("La resta del segundo con el primero es : "+(numero2-numero1));
        System.out.println("La multiplicación de los 2 números es : "+(numero1*numero2));
        System.out.println("La división del primer número con el segundo es : "+(numero1/numero2)+" . Su módulo es : "+(numero1 % numero2));
        System.out.println("La división del segundo número con el primero es : "+(numero2/numero1)+" . Su módulo es : "+(numero1 % numero2));
    }
    //Calcular precio con IVA :
    public static double obtenerPrecioConIVA(double precio){
        double precioIVA = precio + (precio * 0.21);
        return precioIVA;
    }
    //RNG entre 0 y 100 :
    public static int obtenerNumeroAleatorioEntre0y100(){
        int x = new Double(Math.random() * 100).intValue();
        return x;
    }
}