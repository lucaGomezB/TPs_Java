//Como transformo una variable tipo Double a una variable tipo double.
public class ejercicio16_DoubleAdouble {
    public static void main(String[] args) {
        System.out.println("Una variable de tipo Double se puede castear a una de tipo double : ");
        Double dobleDouble = 0.0;
        double dobledouble = (double)dobleDouble;
        dobledouble++;
        System.out.println(dobledouble);
    }
}
