package ejercicios_arreglos;
import java.util.Locale;
import  java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
public class Ejercicio6 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    LocalDate fechaActual = LocalDate.now();
    DateTimeFormatter formatoddMMyyy = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int i = 0; i < 7; i++) {
        String fechaFormateada = fechaActual.plusDays(i).format(formatoddMMyyy);
            LocalDate fecha = fechaActual.plusDays(i);
            DayOfWeek diaSemana = fecha.getDayOfWeek();
            String diaEnEspanol = diaSemana.getDisplayName(java.time.format.TextStyle.FULL, Locale.forLanguageTag("es-ES"));
            System.out.println(diaEnEspanol +" "+ fechaFormateada);
        }
    }
}
