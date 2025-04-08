public class Cadenas {
    public static void main(String[] args) {
        String mensaje = "Esta es una cadena";


        System.out.println(mensaje.length());
        System.out.println(mensaje.toLowerCase());
        System.out.println(mensaje.toUpperCase());
        System.out.println(mensaje.trim());
        System.out.println(mensaje.charAt(0));


        //Comparacion de cadenas

        String mismaCadena ="Esta es una cadena";

        System.out.println(mensaje.equals(mismaCadena));
        System.out.println(mensaje.equalsIgnoreCase("ESTA cadena"));

        System.out.println(mensaje.startsWith("ES"));
        System.out.println(mensaje.endsWith("mensaje"));

        System.out.println(mensaje.compareTo("Esta es una cadena"));

        System.out.println(mensaje.contains("E"));


        String candena = "A";
        char letra = 'A';




    }
}
