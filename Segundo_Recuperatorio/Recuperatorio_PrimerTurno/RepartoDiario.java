import java.util.ArrayList;

public class RepartoDiario{
    String fecha;
    ArrayList<RemitoVenta> remitosVenta = new ArrayList<>();
    Double totalReparto; //sera la suma del atributo totalVenta de los remitosVenta asociados
    public void obtenerTotalReparto(ArrayList<RemitoVenta> remitosVenta){
        this.totalReparto = 0.0;
        for(RemitoVenta remitoVenta : remitosVenta){
            this.totalReparto += remitoVenta.totalVenta;
        }
    }
}