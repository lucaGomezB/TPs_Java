import java.util.ArrayList;
public class Matriz {
    ArrayList<ArrayList<Celda>> matrizCuadrada;
    public Matriz(int filas, int columnas) {
        matrizCuadrada = new ArrayList<>(filas);
        for (int i = 0; i < filas; i++) {
            matrizCuadrada.add(new ArrayList<>(columnas));
        }
    }
    public void setCelda(int fila, int columna, Celda valor) {
        if (fila < 0 || fila >= matrizCuadrada.size() || columna < 0 || columna >= matrizCuadrada.get(fila).size()) {
            throw new IndexOutOfBoundsException("Índices inválidos : " + fila + ", " + columna);
        }
        matrizCuadrada.get(fila).set(columna, new Celda(fila, columna, valor));
    }
}