
import java.util.Scanner;

/*Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no
(siendo sábado y domingo no laborales). Usa un switch para ello. Valida que el número
ingresado sea un valor entre 1 y 7, caso contrario solicite el valor nuevamente. */
public class Ejercicio12_SwitchDiasSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = 0;
        System.out.println("Porfavor ingrese un día de la semana para averiguar si es laborable (1.Lunes, 2.Martes, ... , 7.Domingo).");
        while (true) { 
            dia = sc.nextInt();
            if(dia>0 && dia<8){
                break;
            }else{System.out.println("Porfavor ingrese un número entre 1 y 7.");}
        }
        String diaString="";
        switch(dia){
            case 1 -> diaString = "Laborable";
            case 2 -> diaString = "Laborable";
            case 3 -> diaString = "Laborable";
            case 4 -> diaString = "Laborable";
            case 5 -> diaString = "Laborable";
            case 6 -> diaString = "No laborable";
            case 7 -> diaString = "No laborable";
        }
        System.out.println("Su día es : "+diaString);
    }
}
