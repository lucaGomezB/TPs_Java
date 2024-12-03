
import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurante {
    public static void main(String[] args) {
        /* Con este código se crea un ArrayList que contiene objetos de tipo Plato
        Se crean objetos de tipo Plato, con sus correspondientes Ingredientes.  
        */
        Scanner sc = new Scanner(System.in);
        ArrayList<Plato> platos = new ArrayList<Plato>();
        while (true) {
            System.out.println("A continuación, cargará un plato :");
            platos.add(crearPlato(sc));
            System.out.println("Desea cargar otro plato?  S | N");
            String opcion = continuar(sc);
            if(opcion.equalsIgnoreCase("N")){
                System.out.println("Ha finalizado la carga de platos.");
                break;
            }
        }
        mostrarMenuRestaurante(platos);
    }
    public static Plato crearPlato(Scanner sc){
        //Con esto se crea un nuevo objeto Plato.
        Plato plato = new Plato();
        plato.Ingredientes = new ArrayList<>();
        System.out.println("Porfavor ingrese el nombre del plato : ");
        plato.nombreCompleto = sc.nextLine();
        System.out.println("Porfavor ingrese el precio de su plato : ");
        plato.precio = Double.valueOf(sc.nextLine());
        String opcionBebida = "";
        while(true){
            System.out.println("Es su plato una bebida? S | N");
            opcionBebida = sc.nextLine();
            if (opcionBebida.equalsIgnoreCase("S") || opcionBebida.equalsIgnoreCase("N")) {
                break;
            }else{System.out.println("Porfavor ingrese solo S o N .");}
        }
        plato.esBebida = opcionBebida.equalsIgnoreCase("S");
        if(plato.esBebida){
            return plato;
        }else{
            while(true){
                plato.Ingredientes.add(crearIngrediente(sc));
                System.out.println("Desea cargar otro ingrediente? S | N");
                String opcionContinuar = continuar(sc);
                if(opcionContinuar.equalsIgnoreCase("N")){
                    break;
                }
            }
        }
        return plato;
    }
    public static Ingrediente crearIngrediente(Scanner sc){
        //Con esto se crea un nuevo objeto Ingrediente.
        Ingrediente ingrediente = new Ingrediente();
        System.out.println("Porfavor ingrese el nombre del ingrediente : ");
        ingrediente.nombre = sc.nextLine();
        System.out.println("Porfavor ingrese la cantidad del ingrediente : ");
        ingrediente.cantidad = Double.valueOf(sc.nextLine());
        System.out.println("Porfavor ingrese la unidad de medida del ingrediente :");
        ingrediente.unidadDeMedida = sc.nextLine();
        return ingrediente;
    }
    public static String continuar(Scanner sc){
        //Con esto se decide si continuar con la carga de platos.
            while (true) { 
                String opcion = sc.nextLine();
                if(opcion.equalsIgnoreCase("S") || opcion.equalsIgnoreCase("N")){
                    return opcion;
                }else{System.out.println("Porfavor escriba solo S o N .");}
            }
    }
    public static void mostrarMenuRestaurante(ArrayList<Plato> platos){
        System.out.println("");
        System.out.println("-----------------MENÚ------------------");
        System.out.println("");
        for(Plato plato : platos){
            System.out.print(plato.nombreCompleto);
            if(plato.esBebida){
                System.out.println(" ( Bebida )");
            }else{System.out.println("");}
            System.out.println("Precio : $ "+plato.precio);
            if(!plato.esBebida){
                System.out.println("Contiene : ");
                for(Ingrediente ingrediente : plato.Ingredientes){
                    System.out.println("\t"+ingrediente.nombre +" "+ ingrediente.cantidad +" "+ ingrediente.unidadDeMedida);
                }  
            }
            System.out.println("");
            System.out.println("---------------------------------------");
            System.out.println("");
        }
    }
}
