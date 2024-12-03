public class RemitoVentaDetalle {
    Integer cantidad;
    Articulo articulo;
    Double subtotal; //será el resultante de multiplicar la cantidad por el precio del articulo
    public void obtenerSubtotal(Articulo articulo){
        this.subtotal = articulo.getPrecio() * this.cantidad;
    }
}
