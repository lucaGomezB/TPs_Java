/*1- Cree la clase Alumno con los siguientes atributos
String apellido
String nombre
long legajo
double notas []
double promedioNotas 
Las notas deben ir desde el 0 al 10, aceptando números decimales */
public class Alumno{
    String apellido;
    String nombre;
    long legajo;
    double notas [] = new double[10];
    double promedioNotas;

    public Alumno(long legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }
}
