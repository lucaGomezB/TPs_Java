//1- Cree la clase java Computadora la cual debe contener los siguientes atributos privados:
public class computadora {
    private String marca;
    private String modelo;
    private long codigoBarras;
    private double precioTotal;
    private double porcentajeAumento;
    private double montoFinal;
    private String [][] componentes;
    //Genere los correspondientes métodos públicos get / set. 10%
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(long codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getPorcentajeAumento() {
        return porcentajeAumento;
    }

    public void setPorcentajeAumento(double porcentajeAumento) {
        this.porcentajeAumento = porcentajeAumento;
    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }
    public String[][] getComponentes() {
        return componentes;
    }
    public int getPrecio(int fila){
        int precio = Integer.parseInt(this.componentes[fila][2]);
        return precio;
    }
    public void setComponentes(int filas, int columnas) {
        this.componentes = new String[filas][columnas];
    }
    public void agregarComponente(String[][] arregloComponentes, int contadorComponentes){
        this.componentes[contadorComponentes][0] = arregloComponentes[0][0];
        this.componentes[contadorComponentes][1] = arregloComponentes[0][1];
        this.componentes[contadorComponentes][2] = arregloComponentes[0][2];
        this.componentes[contadorComponentes][3] = arregloComponentes[0][3];
    }
    public void mostrarComputadora(int contadorComponentes){
        System.out.println("La computadora especificada es:");
        System.out.println("Marca : "+this.marca);
        System.out.println("Modelo : "+this.modelo);
        System.out.println("Código de barras : "+this.codigoBarras);
        System.out.println("Año : 2024");
        System.out.println("Código Item     |    Denominación   |   Precio");
        for(int i = 0;i < contadorComponentes;i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(this.componentes[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
