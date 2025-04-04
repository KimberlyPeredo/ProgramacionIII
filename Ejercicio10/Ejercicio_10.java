package Ejercicio10;

public class Ejercicio_10 {
    int[][] matriz;


    public Ejercicio_10() {
        matriz = new int[5][5];
    }


    public void ejecutar() {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int aleatorio = (int) (Math.random() * 9 + 1);

                matriz[i][j] = aleatorio;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
        System.out.println("\nSuma de filas: ");
        for (int i=0; i<matriz.length; i++){
            int suma =0;
            for (int j =0; j < matriz[i].length; j++){
                suma += matriz[i][j];
            }
            System.out.println("Suma fila " +i + ": " +suma);
        }
        System.out.println("\nSuma de columnas: ");
        for (int j =0; j< matriz[0].length; j++){
            int suma =0;
            for (int i=0; i<matriz.length; i++){
                suma += matriz[i][j];
            }
            System.out.println("Suma columna " +j + ": " +suma);
        }
    }
}

