import java.util.Scanner;

public class Estructuras {
    public static void main(String[] args) {

        //Variable
        //int edad = 18;

        //Constante
        // final double PI = 3.14519;


        Scanner ingreso = new Scanner(System.in);

        System.out.println("ingrese la edad");
        int edad = ingreso.nextInt();


        if (edad >= 18){
            System.out.println("mayor de edad");
        } else {
            System.out.println("menor de edad");
        }


    }
}
