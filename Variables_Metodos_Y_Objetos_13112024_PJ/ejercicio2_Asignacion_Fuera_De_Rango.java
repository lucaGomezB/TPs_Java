
import java.math.BigInteger;

/*Si se asigna un valor a una variable fuera de rango (mayor de lo establecido)
¿Qué ocurre? ¿Existe alguna forma de resolverlo? Ejemplifique. */
public class ejercicio2_Asignacion_Fuera_De_Rango {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("12345678901234567890");
        System.out.println("Lo que ocurre al asignarse una variable fuera del rango establecido es un error de compilación : ");
        //int variable = 123145234243234234234234234234234242432454545454354535345;
        System.out.println("Hay varias formas de resolver esto : ");
        System.out.println("1. Se puede usar una variable de otro tipo, en este caso se podría usar long.");
        //long variable = 123145234243234234234234234234234242432454545454354535345;
        System.out.println("2. Se puede usar BigInteger para numeros que superan incluso la longitud máxima de long.");
        //bigInteger variable = 12314453453543453;
        System.out.println("Si es un número demasiado grande como para guardarlo en una variable, se puede guardar en un String (aunque es poco conveniente), o en un archivo de configuración como CSV o JSON.");
    }
}
