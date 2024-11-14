import java.util.HashMap;

public class Ejercicio_HashMap{
    public static void main(String[] args){
        HashMap<String, Long> agenda = new HashMap<String, Long>();
        /*El algoritmo debe contener un menú inicial con 3 opciones
        1- Cargar Datos en la Agenda
        2- Buscar Teléfono por Nombre
        3- Listar Agenda
        El usuario deberá elegir que desea hacer: */
        FuncionesAgenda.menu(agenda);
    }
}