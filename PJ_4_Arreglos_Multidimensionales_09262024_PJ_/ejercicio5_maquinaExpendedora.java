//El siguiente programa tiene una matriz, con la que simula una máquina expendedora.
//También tiene un menú con el que el usuario puede interactuar.
import java.util.Scanner;
public class ejercicio5_maquinaExpendedora{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] maquina = new String[12][3];
        //Esto se puede declarar como en el video, ocupa menos líneas de código y toma menos tiempo hacerlo.
        //Acá se llena la primer columna
        maquina[0][0] = "KitKat";
        maquina[1][0] = "Chicles";
        maquina[2][0] = "Caramelos de Menta";
        maquina[3][0] = "Huevo Kinder";
        maquina[4][0] = "Chetoos";
        maquina[5][0] = "Twix";
        maquina[6][0] = "M&M's";
        maquina[7][0] = "Papas_Lays";
        maquina[8][0] = "Milkybar";
        maquina[9][0] = "Alfajor_Tofi";
        maquina[10][0] = "Lata_Coca";
        maquina[11][0] = "Chitos";
        //Acá se llena la segunda columna
        maquina[0][1] = "32";
        maquina[1][1] = "2";
        maquina[2][1] = "2";
        maquina[3][1] = "25";
        maquina[4][1] = "30";
        maquina[5][1] = "26";
        maquina[6][1] = "35";
        maquina[7][1] = "40";
        maquina[8][1] = "30";
        maquina[9][1] = "20";
        maquina[10][1] = "50";
        maquina[11][1] = "45";
        //Acá se llena la tercer columna
        maquina[0][2] = "10";
        maquina[1][2] = "50";
        maquina[2][2] = "50";
        maquina[3][2] = "10";
        maquina[4][2] = "10";
        maquina[5][2] = "10";
        maquina[6][2] = "10";
        maquina[7][2] = "20";
        maquina[8][2] = "10";
        maquina[9][2] = "15";
        maquina[10][2] = "20";
        maquina[11][2] = "0"; 

        //Ya se llenó la matriz maquina.
        boolean condicion = true;
        String opcion = "";
        int cantidadVendida = 0;
        String password = "";
        while(condicion){
            System.out.println("");
            System.out.println("Porfavor escriba la letra de una de las siguientes opciones : ");
            System.out.println("");
            System.out.println("a) Pedir golosina");
            System.out.println("b) Mostrar golosinas");
            System.out.println("c) Rellenar golosinas");
            System.out.println("d) Apagar máquina");
            System.out.println("");
            opcion = sc.next();
            opcion = opcion.toLowerCase();
            switch(opcion){
                case "a" ->{
                    int cantidadGolosinas = 0; 
                    System.out.println("Porfavor ingrese la golosina a pedir : ");
                    String golosinaPedida = sc.next();
                    for (int i = 0; i < maquina.length; i++) {
                        if(golosinaPedida.equals(maquina[i][0])){
                            System.out.println("Porfavor ingrese la cantidad de golosinas a retirar");
                            cantidadGolosinas = sc.nextInt();
                            if((Integer.parseInt(maquina[i][2]) - cantidadGolosinas) > 0){
                                maquina[i][2] = String.valueOf(Integer.parseInt(maquina[i][2]) - cantidadGolosinas);
                                cantidadVendida = cantidadGolosinas * Integer.parseInt(maquina[i][1]);
                                System.out.println("Transacción realizada, que tenga un buen día!");
                            }else{
                                System.out.println("La máquina dispone de "+maquina[i][2]+" golosinas, porfavor intente más tarde.");
                            }
                        }
                    }
                }
                case "b" ->{
                    mostrarGolosinas(maquina);
                }
                case "c" ->{
                    System.out.println("Porfavor introduzca la contraseña : ");
                    password = sc.next();
                    if(password.equals("AdminXYZ")){
                        maquina = rellenarGolosinas(maquina, sc);
                    }else{
                        System.out.println("Contraseña incorrecta, porfavor ingrese una contraseña válida.");
                    }
                }
                case "d" ->{
                    System.out.println("Hasta que concluyó la ejecución de este programa, se recaudó : $ "+cantidadVendida);
                    condicion = false;
                }
                default ->{
                    System.out.println("Porfavor ingrese una opción válida.");
                }
            }
        }
    }

    //Esta función muestra las golosinas.

    public static void mostrarGolosinas(String[][] maquina){
        System.out.println(" Golosina "+" Precio "+" Cantidad ");
        Integer cantidad = 0;
        for (int i = 0; i < maquina.length; i++) {
            cantidad = Integer.valueOf(maquina[i][2]);
            if (cantidad > 0){
                System.out.println(maquina[i][0]+" | "+maquina[i][1]+" | "+maquina[i][2]);
            }else{
                System.out.println(maquina[i][0]+" | "+maquina[i][1]+" | "+"No queda. Pídale al administrador que me ponga más.");
            }
        }
    }

    //Esta función busca la golosina pedida y le aumenta la cantidad que indica el usuario.

    public static String[][] rellenarGolosinas(String[][] maquina, Scanner sc){ 
        System.out.println("Porfavor ingrese la golosina : ");
        String golosina = sc.next();
        for (int i = 0; i < maquina.length; i++) {
            if(maquina[i][0].equals(golosina)){
                System.out.println("Porfavor ingrese la cantidad a incrementar : ");
                int cantidadInt = Integer.parseInt(maquina[i][2]);
                cantidadInt += sc.nextInt();
                maquina[i][2] = String.valueOf(cantidadInt);
                System.out.println("Cantidad aumentada.");
            }else{
                System.out.println("No se ha encontrado la golosina solicitada.");
            }
        }
        return maquina;
    }
}