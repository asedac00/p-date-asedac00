package es.unileon.prg.date;
/**
 * Clase donde esta el main de la clase Date
 * @author Ana Sedano Cañas
 * @version Inicial
 *   
 */

public class MainDate {
/**
 * Método principal de la clase Date
 * @param args Argumentos main
 */
public static void main(String[] args) {

    Date today;

    try {
        today = new Date(15, 10, 2017);
        System.out.println(today.toString());
    } catch (DateException e) {
        System.out.println(e.getMessage());
    }

}

}
