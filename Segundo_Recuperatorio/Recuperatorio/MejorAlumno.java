/*Cree una nueva clase MejorAlumno que contendrá una variable global (array) de clase
Alumno [] alumnos
Además deberá definir una array de 2 dimensiones llamado alumnosDB que contendrá la
siguiente información */

import java.util.Scanner;

public class MejorAlumno {
    public static Alumno [] ALUMNOS = new Alumno[5];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] alumnosDB = new String[5][3];
        alumnosDB[0][0] = "70105";
        alumnosDB[0][1] = "Nolasco";
        alumnosDB[0][2] = "Federico";
        alumnosDB[1][0] = "71321";
        alumnosDB[1][1] = "Alonso";
        alumnosDB[1][2] = "Damián";
        alumnosDB[2][0] = "72987";
        alumnosDB[2][1] = "Oviedo";
        alumnosDB[2][2] = "Hernán";
        alumnosDB[3][0] = "73258";
        alumnosDB[3][1] = "Valencia";
        alumnosDB[3][2] = "Diego";
        alumnosDB[4][0] = "74741";
        alumnosDB[4][1] = "Aveni";
        alumnosDB[4][2] = "Martin";
        //Las columnas del arreglo se corresponden a Legajo, Apellido, Nombre
/* Y el método main que deberá ejecutar el siguiente procedimiento
a- Deberá realizar la iteración de cada fila del array alumnosDB
b- Para cada iteración, cree una instancia de la clase alumno, y asigne los valores en los
atributos correspondientes, para el array notas solicite la cantidad de notas a ingresar
(valide que la cantidad sea mayor a 0) y carguelas, validando que se encuentre en el rango
permitido del 0 al 10, caso contrario muestre el mensaje “La nota ingresada no es válida” y
solicite la nota nuevamente.*/
        int notasAIngresar = 0;
        System.out.println("Porfavor ingrese la cantidad de notas a ingresar : ");
        notasAIngresar = obtenerCantidadDeNotas(sc, notasAIngresar);
        double[] notas = new double[notasAIngresar];
        for(int i = 0;i <5;i++){
            Alumno alumno = new Alumno(Integer.valueOf(alumnosDB[i][0]),alumnosDB[i][1],alumnosDB[i][2]);
            for (int j = 0; j < notasAIngresar; j++) {
                while (true) { 
                    System.out.println("Porfavor ingrese una nota entre 0 y 10");
                    int nota = sc.nextInt();
                    if(nota >= 0 && nota <= 10 ){
                        notas[j] = nota;
                        break;
                    }else{System.out.println("La nota ingresada no es válida.");}
                }
            }
            System.out.println("Ha finalizado la carga de notas de "+alumno.apellido);
            /*c- Al finalizar la carga de notas calcule el promedio de las notas y asigne el valor en el atributo
            promedioNotas*/
            double promedio = 0;
            for(int j = 0; j < notasAIngresar; j++){
                promedio += notas[j];
            }
            promedio /= notasAIngresar ;
            alumno.promedioNotas = promedio;
            alumno.notas = notas;
            ALUMNOS[i] = alumno;
            //d. Cargue el objeto Alumno creado en el array alumnos.
        }
        /*3- Repita los pasos indicados en el punto 2.b, 2.c y 2.d para cada uno de los alumnos del array*/
        /*Muestre por pantalla una lista de los alumnos cargados en alumnos y su promedio con el
        siguiente formato: */
        System.out.println("");
        System.out.println("La lista de alumnos cargados es : ");
        System.out.println(" Legajo |  Apellido,Nombre  | Promedio");
        for(Alumno alumno : ALUMNOS){
            System.out.println(" "+alumno.legajo+" | "+alumno.apellido+" "+alumno.nombre+" | "+alumno.promedioNotas);
        }
        /*Finalmente determine el alumno con el mejor promedio comparando el atributo
        promedioNotas determinado anteriormente. Muestre por pantalla la totalidad de los datos
        del alumno con el mejor promedio.*/
        int posicionMejorPromedio = 0;
        for (int i = 0; i < 4; i++) {
            if(ALUMNOS[i+1].promedioNotas >= ALUMNOS[i].promedioNotas){
                posicionMejorPromedio = i+1;
            }
        }
        System.out.println("");
        System.out.println("El alumno con el mejor promedio es : ");
        System.out.println("Apellido :  "+ALUMNOS[posicionMejorPromedio].apellido);
        System.out.println("Nombre :  "+ALUMNOS[posicionMejorPromedio].nombre);
        System.out.println("Legajo :  "+ALUMNOS[posicionMejorPromedio].legajo);
        System.out.print("Notas :  ");
        for (int i = 0; i < notasAIngresar; i++) {
            System.out.print(ALUMNOS[posicionMejorPromedio].notas[i]+" | ");
        }
        System.out.println("");
        System.out.println("Promedio : "+ALUMNOS[posicionMejorPromedio].promedioNotas);
    }

    public static int obtenerCantidadDeNotas(Scanner sc, int notasAIngresar){
        while (true) { 
            notasAIngresar = sc.nextInt();
            if(notasAIngresar > 0){
                return notasAIngresar;
            }else{
                System.out.println("Porfavor ingrese una cantidad mayor a 0.");
            }
        }
    }
}
