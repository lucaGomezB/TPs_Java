
import java.util.ArrayList;

public class RemitoVenta {
    String nombreCliente;
    Long numeroRemito;
    ArrayList<RemitoVentaDetalle> detallesRemito = new ArrayList<>();
    Double totalVenta; //sera la suma del atributo subtotal de los detalleRemito asociados
    public void obtenerTotalVenta(ArrayList<RemitoVentaDetalle> detallesRemito){
        this.totalVenta = 0.0;
        for (RemitoVentaDetalle detalle : detallesRemito) {
            this.totalVenta += detalle.subtotal;
        }
    }
}
