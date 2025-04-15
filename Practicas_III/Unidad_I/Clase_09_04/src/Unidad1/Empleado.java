package Unidad1;

import java.util.Scanner;

public class Empleado {

    //Atributos de la clase
    private int legajo;
    private String nombre;
    private float sueldo;

    //Variable publica y estatica para sueldo basico
    public static float sueldoBasico = 10000;

    //metodo constructor por defecto
    public Empleado(){
        this.legajo = 0;
        this.nombre = new String();
    }

    //Constructor parametrizado
    public Empleado(int legajo, String nombre, float sueldo){
        this.legajo = legajo;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    //Metodos getters y setters
    public int getLegajo(){
        return legajo;
    }

    public void setLegajo(int legajo){
        this.legajo = legajo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(){
        this.nombre = nombre;
    }

    public float getSueldo(){
        return sueldo;
    }

    public void setSueldo(float sueldo){
        this.sueldo = sueldo;
    }

    //metodo principal
    public static void main(String args[]) {

        //creamos 2 instancias de Empleado usando diferentes constructores
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado(1, "Pepe", 12000);

        //mostrar sueldos
        System.out.println("El sueldo del empleado " + e1.getNombre() + " es:" + e1.getSueldo());
        System.out.println("El sueldo del empleado " + e2.getNombre() + " es:" + e2.getSueldo());
        System.out.println("El sueldo básico es: " + Empleado.sueldoBasico);


    }

}