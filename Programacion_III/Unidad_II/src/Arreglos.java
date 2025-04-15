public class Arreglos {
    public static void main(String[] args) {

        //Declaracion
        int[] numeros;

        //Inacializacion
        numeros = new int[5];

        //Declaracion + inicializacion
        //String[] nombres = new String[5];

        String[] dias = {"Domingo","Lunes","Martes","Miercoles","Juenves"};

        //For Clasico: mas rapido
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i]);
            System.out.println(dias[i]);
            //System.out.println(nombres[i]);
        }

        //For.each: menos verboso
        for(String dia : dias){
            System.out.println("El dia es: "+ dia);
        }

        int[][] matriz = new int[2][2];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j <matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}
