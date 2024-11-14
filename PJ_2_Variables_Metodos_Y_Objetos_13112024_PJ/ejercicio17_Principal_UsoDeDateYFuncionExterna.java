/*Función estática que reciba como parámetro una fecha de tipo Date y retorne la fecha como una cadena.
public static String getFechaString(Date fecha){
……….
}
Cree una clase Principal que contenga un método main y haga uso de la función
getFechaString. */
import java.util.Date;
import java.util.Scanner;
public class ejercicio17_Principal_UsoDeDateYFuncionExterna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date fecha = new Date();
        System.out.println("La fecha actual es :"+funciones.devolverFechaString(fecha));
        System.out.println("Porfavor ingrese un día : ");
        int dia = sc.nextInt();
        System.out.println("Porfavor ingrese un mes : ");
        int mes = sc.nextInt();
        System.out.println("Porfavor ingrese un año : ");
        int anio = sc.nextInt();
        Date fechaPersonalizada = funciones.crearFechaDate(dia, mes, anio);
        System.out.println("Su fecha es : "+funciones.devolverFechaString(fechaPersonalizada));
    }
    /*En la clase FuncionesPrograma codifique una función estática que reciba como
    parámetro 3 valores enteros, día, mes, anio y retorne la fecha de tipo Date
    correspondiente.
    public static Date getFechaDate(int día, int mes, int anio){
    ……….
    }
    En la clase Principal creada en el punto anterior haga uso de la función
    getFechaDate. */
}
