import java.util.ArrayList;
public class Alumno {
    private String nombreCompleto;
    private Long legajo;
    private ArrayList<Nota> notas;
    private Double promedio;

    //Agregue en la clase Alumno un método público que calcule el promedio de las notas que posee.
    public void calcularPromedio(){
        
        
        double promedio = sumaNotas / cantidadNotas;
        this.promedio = promedio;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Long getLegajo() {
        return legajo;
    }

    public void setLegajo(Long legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Nota> getNota() {
        return notas;
    }

    public void setNotas(Nota nota){
        notas.add(nota);
    }

    public Double getPromedio() {
        return promedio;
    }
}
