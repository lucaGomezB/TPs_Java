
import java.util.Calendar;
import java.util.Date;

public class funciones {
    //Suma de los dígitos de un número mediante módulo y división :
    public static int sumaMedianteModuloYDivision(int numero){
        int digito1 = (numero/10)/10;
        int digito2 = (numero/10)%10;
        int digito3 = numero%10;
        int suma = digito1+digito2+digito3;
        return suma;
    }
    //División de un valor en cantidades de billetes : 
    public static void mostrarCantidadesDeBilletes(double dinero){
        double[] denominaciones = {200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.25, 0.1, 0.05};
        for (double denominacion : denominaciones) {
            int cantidadBilletesMonedas = (int)(dinero / denominacion);
            dinero -= cantidadBilletesMonedas * denominacion;
            if(cantidadBilletesMonedas != 0){
                System.out.println("Cantidad de $" + denominacion + ": " + cantidadBilletesMonedas);
            }
        }
    }
    //Mostrador de cantidades de vocales :
    public static void MostrarCantidadDeVocales(String cadena){
        int a = 0,e = 0, i= 0, o=0, u=0;
        for (int j = 0; j < cadena.length(); j++) {
            switch(cadena.charAt(j)){
                case 'A' -> a++;
                case 'E' -> e++;
                case 'I' -> i++;
                case 'O' -> o++;
                case 'U' -> u++;
            }
        }
        System.out.println("La cantidad de vocales | A | es "+a);
        System.out.println("La cantidad de vocales | E | es "+e);
        System.out.println("La cantidad de vocales | I | es "+i);
        System.out.println("La cantidad de vocales | O | es "+o);
        System.out.println("La cantidad de vocales | U | es "+u);
    }
    //Reemplazador de letras por letras en un String :
    public static String ReemplazarAPorE(String cadena){
        //String newString = originalString.replace(oldChar, newChar);
        String cadenaAPorE = cadena.replace('a', 'e');
        cadenaAPorE = cadenaAPorE.replace('A', 'E');
        return cadenaAPorE;
    }
    //Reemplazador de letras por ASCII en cadenas : 
    public static String ReemplazarCaracterPorASCII(String cadena){
        String nuevaCadena = "";
        for (int i = 0; i < cadena.length(); i++) {
            nuevaCadena += ((int)cadena.charAt(i));
            nuevaCadena += " ";
        }
        return nuevaCadena;
    }
    //Convertidor de fecha a Date :
    public static String devolverFechaString(Date fecha){
        String fechaString = fecha.toString();
        return fechaString;
    }
    //Creador de Date a partir de 3 int : 
    public static Date crearFechaDate(int dia, int mes, int anio){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, dia);
        calendar.set(Calendar.MONTH, (mes - 1));
        calendar.set(Calendar.YEAR, anio);
        Date fechaDate = calendar.getTime();
        return fechaDate;
    }
    //Sumador recursivo de dígitos : 
    public static int sumaDeDigitosRecursiva(int numero){
        if (numero == 0) {
            return 0;
        } else {
            return numero % 10 + sumaDeDigitosRecursiva(numero / 10);
        }
    }
    //
    public static void mostradorYCasteador(double valorDecimal){
        short valorShort = ((short) valorDecimal);
        System.out.println("Valor short  = "+ valorShort);
        int valorEntero = ((int)valorDecimal);
        System.out.println("Valor entero = "+ valorEntero);
        long valorLong = ((long)valorDecimal);
        System.out.println("Valor long = "+ valorLong);
        String valorString = String.valueOf(valorDecimal);
        System.out.println("Valor String = " + valorString);
        float valorFloat = ((float) valorDecimal);
        System.out.println("Valor float = "+ valorFloat);
    }
}
