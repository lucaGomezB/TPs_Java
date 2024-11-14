//El siguiente programa busca secuencialmente en un arreglo generado aleatoriamente, busca si hay un número
//repetido en el arreglo y lo muestra. Si no lo hay, muestra un mensaje.
import java.util.Random;
public class punto6{
    public static void main(String[] args) {
        Random rand = new Random();
        int contador = 0;
        int posicion = 0;
        int arreglo[];
        arreglo = new int[50];
        //Acá se rellena el arreglo
        for(int i = 0 ; i < 50 ; i++){
            arreglo[i] = rand.nextInt(100);
        }
        //Acá se busca secuencialmente en el arreglo
        for (int i = 0; i < 50; i++) {
            if(contador > 1){
                break;
            }
            for (int o = 0; o < 50; o++) {
                if(arreglo[i] == arreglo[o]){
                    contador++;
                    if(contador > 1){
                        posicion = o;
                        break;
                    }
                }
            }
        }
        //Acá se muestra el mensaje apropiado
        switch(contador){
            case 2 ->{
                System.out.println("Hay un número repetido en el arreglo en el índice "+posicion);
            }
            default -> {
                System.out.println("No se encontraron números repetidos en el arreglo.");
            }
        }
    }
}