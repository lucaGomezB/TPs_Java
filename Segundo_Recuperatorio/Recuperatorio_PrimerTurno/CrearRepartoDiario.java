
import java.util.ArrayList;
import java.util.Scanner;

public class CrearRepartoDiario {
    public static ArrayList<Articulo> articulosDisponibles = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        articulosDisponibles.add(new Articulo("10", "Filtro de Aceite", 10000.0));
        articulosDisponibles.add(new Articulo("20", "Filtro de Aire", 8000.0));
        articulosDisponibles.add(new Articulo("30", "Filtro de Combustible", 7500.0));
        articulosDisponibles.add(new Articulo("40", "Aceite de Motor sw/10", 25000.0));
        articulosDisponibles.add(new Articulo("50", "Correa de Distribución", 20000.0));
        RepartoDiario repartoDiario = new RepartoDiario();
        System.out.println("Porfavor ingrese la fecha del reparto : ");
        repartoDiario.fecha = sc.nextLine();
        cargaDeRemitosVenta(repartoDiario,sc);
        repartoDiario.obtenerTotalReparto(repartoDiario.remitosVenta);
        mostrarRepartoDiario(repartoDiario);
    }

    public static void cargaDeRemitosVenta(RepartoDiario repartoDiario, Scanner sc){
        //Acá se cargan los Remitos de Venta.
        while(true){
            RemitoVenta remitoVenta = new RemitoVenta();
            System.out.println("Porfavor ingrese el nombre del cliente : ");
            remitoVenta.nombreCliente = sc.nextLine();
            System.out.println("Porfavor ingrese el número de remito : ");
            remitoVenta.numeroRemito = Long.valueOf(sc.nextLine());
            remitoVenta.detallesRemito = cargaDetallesRemito(sc, remitoVenta);
            remitoVenta.obtenerTotalVenta(remitoVenta.detallesRemito);
            repartoDiario.remitosVenta.add(remitoVenta);
            System.out.println("Desea cargar más remitos? S | N");
            String opcionContinuar = continuar(sc);
            if(opcionContinuar.equalsIgnoreCase("N")){
                break;
            }
        }
    }

    public static ArrayList<RemitoVentaDetalle> cargaDetallesRemito(Scanner sc, RemitoVenta remitoVenta){
        while(true){
            RemitoVentaDetalle remitoVentaDetalle = new RemitoVentaDetalle();
            System.out.println("Porfavor ingrese una cantidad : ");
            remitoVentaDetalle.cantidad = Integer.valueOf(sc.nextLine());
            remitoVentaDetalle.articulo = verificarYObtenerArticulo(remitoVentaDetalle, sc);
            System.out.println("Desea cargar más detalles? S | N");
            String opcionContinuar = continuar(sc);
            remitoVentaDetalle.obtenerSubtotal(remitoVentaDetalle.articulo);
            remitoVenta.detallesRemito.add(remitoVentaDetalle);
            if(opcionContinuar.equalsIgnoreCase("N")){
                break;
            }
        }
        remitoVenta.obtenerTotalVenta(remitoVenta.detallesRemito);
        return remitoVenta.detallesRemito;
    }

    public static Articulo verificarYObtenerArticulo(RemitoVentaDetalle remitoVentaDetalle, Scanner sc){
        while(true){
            System.out.println("Ingrese el código del artículo: ");
            boolean elArticuloExiste = false;
            String codigoArticulo = sc.nextLine();
            for(int i = 0; i < 5; i++){
                Articulo articuloActual = articulosDisponibles.get(i);
                if((articuloActual.getCodigo()).equals(codigoArticulo)){
                    System.out.println("Se ha cargado su detalle de remito.");
                    return articuloActual;
                }
            }
            if(elArticuloExiste == false){
                System.out.println("El código es incorrecto, ingrese nuevamente");
            }
        }
    }

    public static void mostrarRepartoDiario(RepartoDiario repartoDiario){
        for (RemitoVenta remitoVenta : repartoDiario.remitosVenta) {
            System.out.println();
            System.out.println("RepartoDiario");
            System.out.println("Fecha : "+repartoDiario.fecha);
            System.out.println("-------------Remitos del Reparto-------------");
            System.out.println("Nombre del Cliente : "+remitoVenta.nombreCliente);
            System.out.println("Numero del Remito : "+remitoVenta.numeroRemito);
            System.out.println("Cantidad Items | Denominacion Artículo | Precio Unitario | Subtotal");
            for(RemitoVentaDetalle remitoVentaDetalle : remitoVenta.detallesRemito){
                System.out.println("\t"+remitoVentaDetalle.cantidad + "\t | " + remitoVentaDetalle.articulo.getDenominacion() + " | " + remitoVentaDetalle.articulo.getPrecio() + " | "+ remitoVentaDetalle.subtotal);
            }
            System.out.println("Total Remito de venta : "+remitoVenta.totalVenta);
            System.out.println("---------------------------------------------");
        }
        System.out.println("");
        System.out.println("Monto Total del Reparto : "+repartoDiario.totalReparto);
    }

    public static String continuar(Scanner sc){
        //Con esto se decide si continuar con la carga.
            while (true) { 
                String opcion = sc.nextLine();
                if(opcion.equalsIgnoreCase("S") || opcion.equalsIgnoreCase("N")){
                    return opcion;
                }else{System.out.println("Porfavor escriba solo S o N .");}
            }
    }
}
