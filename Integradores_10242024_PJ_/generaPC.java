//Cree otra clase java GeneraPC que contenga el método main y una variable de clase (array
//de 2 dimensiones) con la siguiente definición: 5%
import java.util.Scanner;
public class generaPC {
    private  static String [][] componentesPc = {{"AAA","Placa Madre", "20000", "S"} , {"BBB","Procesador" ,
        "25000" , "S"} , {"CCC","Memoria RAM", "5000" , "S"} , {"DDD","Placa de Red", "3000" , "N"}
        , {"EEE","Disco Rigido SSD", "22000" , "S"} , {"FFF"," Placa de Video", "42000" , "N"} , {"GGG",
        "Monitor Led 21", "32000" , "N"} , {"HHH","Monitor Led 25", "41000" , "N"} , {"JJJ","Kit Teclado - Mouse", "9000" , "N"} , 
        {"KKK","Gabinete", "6500" , "S"}, {"LLL","Fuente Alimentación", "6500" , "S"}, {"MMM","Placa de Sonido", "16500" , "N"}};
        //Los valores del array se corresponden a:
        // El código del componente
        // La denominación del componente
        // El precio del componente
        // Es obligatorio ¿ S (Si), N (No)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        computadora computadora1 = new computadora();
        //En el método main de la clase GeneraPC:
        //a) Cree una instancia de la clase Computadora, solicite al usuario y asigne únicamente los
        //correspondientes atributos marca, modelo, y código de barras. Valide que el código de
        //barras tenga entre 7 y 15 caracteres inclusive, caso contrario solicite nuevamente el código
        //de barras. 10%
        long codigoBarras = 0;
        double contadorCodigoBarras = 0;
        System.out.println("Porfavor ingrese la marca : ");
        computadora1.setMarca(sc.nextLine());
        System.out.println("Porfavor ingrese el modelo : ");
        computadora1.setModelo(sc.nextLine());
        while(true){
            System.out.println("Porfavor ingrese un código de 7 y 15 dígitos.");
            codigoBarras = sc.nextLong();
            contadorCodigoBarras = Math.floor(Math.log10(Math.abs(codigoBarras))) + 1;
            if ((contadorCodigoBarras >= 7) && (contadorCodigoBarras < 15)) {
                computadora1.setCodigoBarras(codigoBarras);
                break;
            }
        }
        //b) Solicite al usuario que indique la cantidad de componentes que tendrá la computadora.
        //Valide que sea mayor o igual a 5 y menor o igual a 12, caso contrario solicite nuevamente la
        //cantidad. 10% 
        int cantidadComponentes = 0;
        while(true){
            System.out.println("Porfavor ingrese la cantidad de componentes que tendrá la computadora. Mínimo 5, máximo 12");
            cantidadComponentes = sc.nextInt();
            if(cantidadComponentes >= 5 && cantidadComponentes <= 12){
                break;
            }
        }
        //c)Inicialice el atributo componentes de la clase Computadora con el tamaño de la matriz, que
        //será equivalente a la cantidad de artículos ingresados en el punto anterior por 4 columnas
        //que se corresponderán con: 5%
        computadora1.setComponentes((cantidadComponentes), 4);
        //d) Posteriormente solicite al usuario el ingreso de los componentes, el proceso seria el siguiente: 30%
        //d.1) Muestro el mensaje Componentes de la Computadora
        System.out.println("Componentes de la Computadora");
        //Busque el código ingresado en el array de componentes
        String codigoComponente = "";
        int contador = 0;
        int contadorRecargo = 0;
        String[][] arregloComponentes = new String[1][4];
        for (int i = 0; i < cantidadComponentes; i++) { 
            //d.2) Muestro el mensaje “Ingrese el código del componente”
            System.out.println("Ingrese el código del componente");
            codigoComponente = sc.next();
            contador = 0;
                for (int j = 0; j < 12; j++) {
                    if (componentesPc[j][0].equals(codigoComponente)) {
                        contador++;
                        //d.3.2) Si encuentro el código del componente pero el mismo ya fue agregado
                        //anteriormente, emito el mensaje “El componente ya fue agregado anteriormente”
                        //y vuelvo a solicitar el ingreso del código.
                        if (contador > 1) {
                            System.out.println("El componente ya fué agregado anteriormente.");
                        }else{
                            //d.3.3) Si lo encuentra obtengo la información y la asigno en el array componentes de la
                            //clase Computadora en la posición adecuada, indicada en el punto c. Una forma de
                            //hacer esto es a través de un método público de la clase Computadora destinado
                            //para esta funcionalidad.
                            arregloComponentes[0][0] = componentesPc[j][0];
                            arregloComponentes[0][1] = componentesPc[j][1];
                            arregloComponentes[0][2] = componentesPc[j][2];
                            arregloComponentes[0][3] = componentesPc[j][3];
                            computadora1.agregarComponente(arregloComponentes, i);
                        }
                    }
                    if(componentesPc[j][3].equals('s')){
                        contadorRecargo++;
                    }
                }
                //d.3.1) Si no lo encuentro emito un mensaje por pantalla “El código ingresado es
                //incorrecto” y vuelvo a solicitar el ingreso del código.
                if (contador == 0) {
                    System.out.println("El código ingresado es incorrecto.");
                }
        }
        int suma = 0;
        double recargo = 0;
        double montoFinal = 1;
        //f) El monto final será equivalente a la suma de los precios de los componentes agregados más
        //el recargo calculado en caso de corresponder. 10%
        for (int i = 0; i < cantidadComponentes ; i++) {
            suma += computadora1.getPrecio(i);
        }
        //e) Al finalizar la carga de componentes, verifique que los 5 componentes marcados como
        //obligatorios se hayan agregado, caso contrario emita el mensaje “Atención, 1 o más de los
        //componentes obligatorios no fueron agregados, por este motivo se cobrara un recargo del 20%”. 10%
        if(contadorRecargo < 5){
            System.out.println("Atención, 1 o más de los componentes obligatorios no fueron agregados, por este motivo se cobrara un recargo del 20%.");
            recargo = 0.20;
        }
        montoFinal = suma + (suma * recargo);
        System.out.println("El monto final es : "+montoFinal);
        //g) Finalmente muestro por pantalla el mensaje “La computadora especificada es:” y la matriz generada. 10%
        computadora1.mostrarComputadora(cantidadComponentes);
    }
}
