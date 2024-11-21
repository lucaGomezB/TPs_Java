//El siguiente programa le permite al usuario ingresar 4 países y 3 ciudades a cada uno de esos países usando
//un array multidimensional de 4x4
import java.util.Scanner;
public class ejercicio1_asignacionCiudadesPorPais{
    public static void main(String[] args) {
        //Acá se define el array
        String[][] paises_y_ciudades;
        paises_y_ciudades = new String[4][4];
        //Acá se llaman las funciones creadas debajo
        paises_y_ciudades = rellenarArreglo(paises_y_ciudades);
        imprimirArreglo(paises_y_ciudades);
    }

    //Con esta función se rellena el arreglo, también se define sc por conveniencia solo acá ya que el resto del programa no lo usa.

    public static String[][] rellenarArreglo(String[][] paises_y_ciudades){
        Scanner sc = new Scanner(System.in);
        //Acá empieza el bucle for principal, que pide el país. En ambos bucles hago uso de las vairables que aumentan
        //para hacer un poco más "responsive" los pedidos.
        for (int i = 0; i < 4; i++) {
            if(i == 0){
            System.out.println("Porfavor ingrese un país : ");
            }else{System.out.println("Porfavor ingrese otro país");}
            paises_y_ciudades[i][0] = sc.next();
            //Acá empieza el bucle for anidado que pide las ciudades.
            for (int o = 1; o < 4; o++) {
                if(o == 1){
                System.out.println("Porfavor ingrese una ciudad de ese país : ");
                }else{System.out.println("Porfavor ingrese otra ciudad : ");}
                paises_y_ciudades[i][o] = sc.next();
            }
        }
        return paises_y_ciudades;
    }

    //Esta función imprime el arreglo multidimensional rellenado previamente.

    public static void imprimirArreglo(String[][] paises_y_ciudades){
        System.out.println("Los países ingresados son : ");
        System.out.println("País : "+paises_y_ciudades[0][0]+" | Ciudades : "+paises_y_ciudades[0][1]+" , "+paises_y_ciudades[0][2]+" , "+paises_y_ciudades[0][3]);
        System.out.println("País : "+paises_y_ciudades[1][0]+" | Ciudades : "+paises_y_ciudades[1][1]+" , "+paises_y_ciudades[1][2]+" , "+paises_y_ciudades[1][3]);
        System.out.println("País : "+paises_y_ciudades[2][0]+" | Ciudades : "+paises_y_ciudades[2][1]+" , "+paises_y_ciudades[2][2]+" , "+paises_y_ciudades[2][3]);
        System.out.println("País : "+paises_y_ciudades[3][0]+" | Ciudades : "+paises_y_ciudades[3][1]+" , "+paises_y_ciudades[3][2]+" , "+paises_y_ciudades[3][3]);
    }
}