package practica_integradora_2;
import java.util.ArrayList;
import java.util.Scanner;

public class CalculoBonoSueldo_REVISAR {
    //Cree otra clase java CalculoBonoSueldo que contenga los siguientes atributos y el método main
    //donde:
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        String [][] haberes = {{"100","Presentismo", "9"} , {"101"," Titulo Profesional" , "9"} ,{"102","Horas Extraordinarias", "M"} , {"103","Horas Nocturnas", "M"} , {"104"," OtrosHaberes", "M"}};
        String [][] deducciones = {{"200","ObraSocial", "3"} , {"201","Jubilacion", "11"} , {"202","Sindicato", "2"} , {"203"," Seguro", "1.5"} , {"204","Otros", "M"}};
        ArrayList<Integer> codigosIngresados = new ArrayList<>();
        /*Los valores de los array se corresponden a:
         El código del ítem a liquidar
         La denominación del ítem a liquidar
         El porcentaje del ítem en relación al sueldo inicial o en caso de que el valor sea “M” a
        un valor numérico ingresado por el usuario.*/

        //Cree una instancia de la clase Empleado: 
        Empleado empleado = new Empleado();
        /*Solicite al usuario y asigne a los correspondientes atributos nombre completo del empleado,
        el cuil, el año de ingreso, mes y año de liquidación y el sueldo básico. Valide que el año de
        ingreso y liquidación no superen el año actual, si el valor supera el año mostrar un mensaje
        y solicitar el ingreso nuevamente. */
        System.out.println("Porfavor ingrese el nombre completo del empleado.");
        empleado.nombreEmpleado = sc.nextLine();
        System.out.println("Porfavor ingrese el CUIL del empleado.");
        empleado.cuil = sc.nextLong();
        while(true){
            System.out.println("Porfavor ingrese el año de ingreso del empleado. (No debe ser superior al actual)");
            empleado.anioIngreso = sc.nextInt();
            if(empleado.anioIngreso > 2024){
                System.out.println("Porfavor ingrese un año anterior al actual.");
            }else{
                break;
            }
        }
        System.out.println("Porfavor ingrese el mes de liquidación (1-12) : ");
        int mesLiquidacion = sc.nextInt();
        while (mesLiquidacion <= 12 && mesLiquidacion >= 1){
            System.out.println("Ingrese un valor dentro del rango especificado (1-12)");
            mesLiquidacion = sc.nextInt();
        }
        while(true){
            System.out.println("Porfavor ingrese el año de liquidación (No debe ser superior al actual):");
            int anioLiquidacion = sc.nextInt();
            if (anioLiquidacion > 2024){
                System.out.println("Porfavor ingrese un año anterior al actual.");
            }else{
                break;
            }
        }
        System.out.println("Porfavor ingrese el sueldo básico del empleado : ");
        empleado.sueldoBasico = sc.nextDouble();
        empleado.montoAntiguedad = (((2024 - empleado.anioIngreso)*0.02)*empleado.sueldoBasico); // Devuelve 0.02 por year.
    while(true){
        BonoSueldo bonoSueldo = new BonoSueldo();
        String [][] bonoCalculado = new String[10][4];
        System.out.println("Porfavor ingrese los Haberes del Empleado:");
        Integer codigoItem = 0;
        //Acá se cargan los códigos de items correspondientes a haberes.
        while (true){
            int restart = 0;
            while(true){
                restart = 0;
                System.out.println("Ingrese el código del ítem : ");
                codigoItem = sc.nextInt();
                for(int i = 0; i<codigosIngresados.size();i++){
                    if(codigoItem == codigosIngresados.get(i)){
                        System.out.println("El código "+codigoItem+" ya fue ingresado, porfavor ingrese otro");
                        restart = 1;
                        break;
                    }
                }
                if(restart == 0){
                    break;
                }
            }
            if(codigoItem == 000){
                if (codigosIngresados.size() > 0) {
                    System.out.println("Ha finalizado la carga de haberes.");
                    break;   
                }else{
                    System.out.println("Porfavor ingrese al menos 1 haber.");
                }
            }else{
                for (int filas = 0; filas < 5; filas++) {
                    if(codigoItem.toString().equals(haberes[filas][0])){
                        bonoCalculado[filas][0] = haberes[filas][0];
                        bonoCalculado[filas][1] = haberes[filas][1];
                        if(haberes[filas][2].equals("M")){
                            System.out.println("Porfavor ingrese el valor.");
                            Integer valorUsuario = sc.nextInt();
                            bonoCalculado[filas][2] = valorUsuario.toString();
                        }else{
                            bonoCalculado[filas][2] = haberes[filas][2];
                        }
                        restart = 0;
                        break;
                    }else{
                        restart = 1;
                    }
                }
                if(restart == 1){
                    System.out.println("No se ha podido encontrar su código");
                }else{
                    System.out.println("Su código fué ingresado exitosamente, para dejar de ingresar códigos, ingrese 000.");
                    codigosIngresados.add(codigoItem);
                }
            }
        }
        //Acá se cargan los codigos de items correspondientes a las deducciones
        System.out.println("Ingrese las deducciones del empleado : ");
        codigoItem = 0;
        while (true){
            int restart = 0;
            while(true){
                restart = 0;
                System.out.println("Ingrese el código del ítem : ");
                codigoItem = sc.nextInt();
                for(int i = 0; i<codigosIngresados.size();i++){
                    if(codigoItem == codigosIngresados.get(i)){
                        System.out.println("El código "+codigoItem+" ya fue ingresado, porfavor ingrese otro");
                        restart = 1;
                        break;
                    }
                }
                if(restart == 0){
                    break;
                }
            }
            if(codigoItem == 000){
                if (codigosIngresados.size() > 0) {
                    System.out.println("Ha finalizado la carga de haberes.");
                    break;   
                }else{
                    System.out.println("Porfavor ingrese al menos 1 haber.");
                }
            }else{
                for (int filas = 0; filas < 5; filas++) {
                    if(codigoItem.toString().equals(haberes[filas][0])){
                        bonoCalculado[filas+5][0] = deducciones[filas][0];
                        bonoCalculado[filas+5][1] = deducciones[filas][1];
                        if(haberes[filas][2].equals("M")){
                            System.out.println("Porfavor ingrese el valor.");
                            Integer valorUsuario = sc.nextInt();
                            bonoCalculado[filas+5][2] = valorUsuario.toString();
                        }else{
                            bonoCalculado[filas+5][2] = haberes[filas][2];
                        }
                        restart = 0;
                        break;
                    }else{
                        restart = 1;
                    }
                }
                if(restart == 1){
                    System.out.println("No se ha podido encontrar su código");
                }else{
                    System.out.println("Su código fué ingresado exitosamente, para dejar de ingresar códigos, ingrese 000.");
                    codigosIngresados.add(codigoItem);
                }
            }
        }
        double sumaHaberes = 0;
        for (int i = 0; i < 5; i++) {
            sumaHaberes += ((Double.parseDouble(bonoCalculado[i][2])/100)*empleado.sueldoBasico);
        }
        double sumaDeducciones = 0;
        for (int i = 5; i < 10; i++) {
            sumaDeducciones += ((Double.parseDouble(bonoCalculado[i][2])/100)*empleado.sueldoBasico);
        }
        /*Calcular el monto a liquidar al empleado que será equivalente a :
        (Sueldo Básico + Antigüedad + Suma de los Haberes) – (Suma de las Deducciones)
        Y asignar el resultante en el atributo montoLiquidacion de BonoSueldo*/
        bonoSueldo.setMontoLiquidacion((empleado.sueldoBasico + empleado.montoAntiguedad + sumaHaberes) - sumaDeducciones);
        /*Pregunte al usuario si desea generar un nuevo bono de sueldo, si la respuesta es afirmativa
        repita los pasos 2.d en adelante; caso contrario proceda a mostrar por pantalla el o los bonos
        cargados*/
        System.out.println("Desea generar un nuevo bono de sueldo? S/N");
        String respuestaUsuario = sc.next();
        if ((respuestaUsuario.toUpperCase()).equals("N")) {
            break;    
        }
    }

    }
}
