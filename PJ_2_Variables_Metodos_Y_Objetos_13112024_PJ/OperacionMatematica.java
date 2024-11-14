/* Con dos atributos numéricos decimales,
valor1 y valor2 y un atributo String de nombre operación. Cree los
correspondientes métodos get/set. 
Agregue a la clase los siguientes 5 métodos:
private double sumarNumeros(){
return valor1 + valor2;
}
private double restarNumeros(){
return valor1 - valor2;
}
private double multiplicarNumeros(){
return valor1 * valor2;
}
private double dividirNumeros(){
return valor1 / valor2;
}
El quinto método será el siguiente:
public double aplicarOperacion(String operacion){
…………………..
} */
public class OperacionMatematica {
    Double valor1 = 0.0;
    Double valor2 = 0.0;
    String operacion = "";

    public Double getValor1() {
        return valor1;
    }

    public void setValor1(Double valor1) {
        this.valor1 = valor1;
    }

    public Double getValor2() {
        return valor2;
    }

    public void setValor2(Double valor2) {
        this.valor2 = valor2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    private double sumarNumeros(){
        return this.valor1 + this.valor2;
    }
    private double restarNumeros(){
        return this.valor1 - this.valor2;
    }
    private double multiplicarNumeros(){
        return this.valor1 * this.valor2;
    }
    private double dividirNumeros(){
        return this.valor1 / this.valor2;
    }
    public double aplicarOperacion(String operacion){
        double resultado = 0.0;
        switch(operacion){
            case "+" -> resultado = sumarNumeros();
            case "-" -> resultado = restarNumeros();
            case "*" -> resultado = multiplicarNumeros();
            case "/" -> resultado = dividirNumeros();
        }
        return resultado;
    }
}
