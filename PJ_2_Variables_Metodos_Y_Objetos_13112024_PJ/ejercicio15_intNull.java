/* Indique qué sucede si realizo la siguiente declaración de variable:
int numero = null;
¿Qué debo modificar para poder asignar null a la variable? */
public class ejercicio15_intNull {
    public static void main(String[] args) {
        System.out.println("Si se intenta asignar int numero = null, recibiremos un error.");
        System.out.println("Para poder asignarlo a una variable, esta debe ser de tipo | por referencia |, o sea, Integer.");
        Integer numero = null;
        System.out.println(numero);
    }    
}
