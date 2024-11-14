import java.util.HashMap;
import java.util.Scanner;
public class FuncionesAgenda {
    public static void menu(HashMap<String, Long> agenda){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (true) { 
            System.out.println("Porfavor ingrese una opción : ");
            System.out.println(" 1. Agendar un teléfono \n 2. Buscar teléfono por nombre \n 3. Listar agenda \n 4. Salir "); 
            opcion = sc.nextInt();
            switch(opcion){
                case 1 -> agendarTelefono(agenda);
                case 2 -> buscarTelefonoPorNombre(agenda);
                case 4 -> System.out.println("");
                default -> System.out.println("Porfavor ingrese una opción entre 1 y 4");
            }
            if(opcion == 4){
                sc.close();
                break;
            }
        }
    }
    public static HashMap agendarTelefono(HashMap<String, Long> agenda){
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("Porfavor ingrese el nombre completo de la persona a agendar (o | SALIR | para dejar de agendar) : ");
            String nombreCompleto = sc.nextLine();
            System.out.println("");
            if(nombreCompleto.equalsIgnoreCase("SALIR")){
                return agenda;
            }
            System.out.println("Porfavor ingrese el teléfono de "+nombreCompleto);
            Long numeroTelefono = sc.nextLong();
            if(agenda.containsKey(nombreCompleto)){
                System.out.println("Esa persona ya fué agendada.");
            }else{
                agenda.put(nombreCompleto, numeroTelefono);
            }
        }
    }
    public static void buscarTelefonoPorNombre(HashMap<String, Long> agenda){
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese un nombre : ");
        String nombre = sc.nextLine();
        if(agenda.containsKey(nombre)){
            System.out.println("El número de teléfono de "+nombre+" es : "+agenda.get(nombre));
        }
    }
}
