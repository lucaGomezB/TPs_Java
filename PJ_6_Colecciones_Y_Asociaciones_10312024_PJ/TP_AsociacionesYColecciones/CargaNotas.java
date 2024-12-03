import java.util.ArrayList;
import java.util.Scanner;
public class CargaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadNotas = 0;
        double sumaNotas = 0;
        //En la clase CargaNotas debera declarar una variable que permita contener un
        //conjunto de Alumnos:       
        ArrayList<Alumno> alumnos = new ArrayList<>();
        //El algoritmo debe permitir cargar N cantidad de alumnos y para cada alumno N
        //cantidad de Notas.
        System.out.println("Porfavor ingrese la cantidad de alumnos que cargará : ");
        int cantidadAlumnos = sc.nextInt();
        System.out.println("Porfavor ingrese la cantidad de notas a ser ingresadas : ");
        while (cantidadNotas < 1) {
            //Valide que se ingrese al menos 1 nota. 
            cantidadNotas = sc.nextInt();   
        } 
        for (int i = 0; i < cantidadAlumnos; i++) {
            Alumno alumno = new Alumno();
            System.out.println("Porfavor ingrese el nombre completo del alumno : ");
            String nombreCompleto = sc.next();
            alumno.setNombreCompleto(nombreCompleto);
            sumaNotas = 0;
            for (int j = 0; j < cantidadNotas; j++) {
                Nota nota = new Nota();
                if (j>0) {
                    System.out.println("Porfavor ingrese otro nombre de cátedra : ");
                }else{
                System.out.println("Porfavor ingrese el nombre de la cátedra : ");
                }
                String catedra = sc.next();
                nota.setCatedra(catedra);
                System.out.println("Porfavor ingrese la nota de dicha cátedra : ");
                double notaExamen = sc.nextDouble();
                nota.setNotaExamen(notaExamen);
                System.out.println(nota.getNotaExamen());
                sumaNotas += nota.getNotaExamen();
                alumno.setNotas(nota);
            }
            alumno.calcularPromedio(cantidadNotas, sumaNotas);
            alumnos.add(alumno);
        }
        //Al finalizar la carga de los alumnos y sus notas mostrar la
        //información cargada y para cada alumno mostrar el promedio de las notas que
        //posee.
        for (Alumno datosAlumno : alumnos) {
            System.out.println("Alumno : "+datosAlumno.getNombreCompleto());
            for (int i = 0; i < cantidadNotas; i++) {
                ArrayList<Nota> calificaciones = datosAlumno.getNota();
                Nota calificacion = calificaciones.get(i);
                System.out.println("    Catedra : "+calificacion.getCatedra()+" | Nota : "+calificacion.getNotaExamen());
            }
            System.out.println("");
        }
    }
}
