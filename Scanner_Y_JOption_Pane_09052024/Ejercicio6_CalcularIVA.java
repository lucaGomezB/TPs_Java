import java.util.Scanner;
/*Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule
el precio final con IVA. El IVA sera una constante que sera del 21%. */
public class Ejercicio6_CalcularIVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese un precio (Si es decimal, separe la parte decimal con coma.):");
        double precio = sc.nextDouble();
        System.out.println("El valor de su precio con el Impuesto del Valor Agregado es : "+funciones.obtenerPrecioConIVA(precio));
    }
}
