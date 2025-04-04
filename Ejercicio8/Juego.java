package Ejercicio8;

import java.util.Scanner;

public class Juego {
    private Tablero tablero;
    public void iniciar() {
        tablero = new Tablero();
        Scanner scanner = new Scanner(System.in);
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            tablero.imprimirTablero();

            System.out.print("Ingrese fila (0-7): ");
            int fila = scanner.nextInt();
            System.out.print("Ingrese columna (0-7): ");
            int columna = scanner.nextInt();

            if (fila < 0 || fila >= 8 || columna < 0 || columna >= 8) {
                System.out.println("Coordenadas fuera de rango, intente de nuevo.");
                continue;
            }

            boolean esMina = tablero.descubrirCasilla(fila, columna);

            if (esMina) {
                System.out.println("¡BOOM! Has pisado una mina. Fin del juego.");
                tablero.imprimirTableroFinal();
                juegoTerminado = true;
            } else if (tablero.haGanado()) {
                System.out.println("¡Felicidades! Has ganado.");
                tablero.imprimirTableroFinal();
                juegoTerminado = true;
            }
        }
    }
}
