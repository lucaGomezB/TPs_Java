//Qué sucede si se intenta acceder a un elemento fuera del tamaño del array?
public class punto1{
    public static void main(String[] args) {
        int vector [];
        vector = new int[13];
        for(int i = 0; i < 14 ; i++){
            vector[i] = i + 1;
            System.out.println("El valor del subíndice "+i+" es : "+vector[i]);
        }

    }
}
//Si la condición de este for fuese i < 13, no ocurriría algo, sin embargo, ya que la condición de finalización
//es superior a la requerida, nos tira un error:
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
//at punto1.main(punto1.java:7)
//
//Esto significa que el programa no pudo acceder al índice 13, porque la longitud del array es de 13, 
//pero se cuenta el 0.