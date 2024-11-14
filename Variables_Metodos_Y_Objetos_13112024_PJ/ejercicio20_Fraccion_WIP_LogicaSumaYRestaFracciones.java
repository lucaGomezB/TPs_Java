/* Cree una clase Fracción con dos atributos numéricos enteros, numerador y
denominador. Agregue un constructor sobrecargado (debe contener como
parámetros el numerador y el denominador) que cree el objeto Fracción
correspondiente.
Agregue a la clase los siguientes 4 métodos e implemente los mismos:
public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
……….
}
public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
……….
}
public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
……….
}
public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
……….
} */
public class Fraccion_WIP_L {
    int numerador;
    int denominador;
    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
        if(f1.denominador != f2.denominador){
            f2.denominador *= f1.denominador;
            f2.numerador *= f1.denominador;
        }
        Fraccion fraccionNueva = new Fraccion((f1.numerador + f2.numerador), f1.denominador);
        return fraccionNueva;
    }
    public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
        ……….
    }
    public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
        ……….
    }
    public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
        ……….
    }
}
