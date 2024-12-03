public class Articulo {
    private String codigo;
    private String denominacion;
    private Double precio;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Articulo(String codigo, String denominacion, Double precio) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.precio = precio;
    }
}
