package Ejercicio8;

import java.util.Random;

public class Tablero {
    private static final int FILAS = 8;
    private static final int COLUMNAS = 8;
    private static final int MINAS = 10;
    private static final int MINA = -1;

    private int[][] tablero;
    private boolean[][] descubierto;

    public Tablero() {
        tablero = new int[FILAS][COLUMNAS];
        descubierto = new boolean[FILAS][COLUMNAS];
        colocarMinas();
        calcularPistas();
    }
    // Coloca minas aleatoriamente en el tablero
    private void colocarMinas() {
        Random random = new Random();
        int minasColocadas = 0;

        while (minasColocadas < MINAS) {
            int fila = random.nextInt(FILAS);
            int columna = random.nextInt(COLUMNAS);

            if (tablero[fila][columna] != MINA) {
                tablero[fila][columna] = MINA;
                minasColocadas++;
                }
            }
        }
    // Calcula cuántas minas hay alrededor de cada casilla
    private void calcularPistas() {
        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                if (tablero[fila][columna] == MINA) continue;

                int contador = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        int nf = fila + i;
                        int nc = columna + j;
                        if (nf >= 0 && nf < FILAS && nc >= 0 && nc < COLUMNAS && tablero[nf][nc] == MINA) {
                            contador++;
                        }
                    }
                }
                tablero[fila][columna] = contador;
            }
        }
    }
    // Revela una casilla y devuelve si es una mina
    public boolean descubrirCasilla(int fila, int columna) {
        if (descubierto[fila][columna]) return false;
            descubierto[fila][columna] = true;
            if (tablero[fila][columna] == MINA) {
                return true; // Perdiste
            }
            if (tablero[fila][columna] == 0) {
                revelarCeldasVacias(fila, columna);
            }
            return false;
        }
    // Revela recursivamente las celdas vacías
    private void revelarCeldasVacias(int fila, int columna) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int nf = fila + i;
                int nc = columna + j;

                if (nf >= 0 && nf < FILAS && nc >= 0 && nc < COLUMNAS && !descubierto[nf][nc]) {
                    descubierto[nf][nc] = true;
                    if (tablero[nf][nc] == 0) {
                        revelarCeldasVacias(nf, nc);
                    }
                }
            }
        }
    }

    // Verifica si el jugador ha ganado
    public boolean haGanado() {
        int casillasDescubiertas = 0;
        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                if (descubierto[fila][columna]) {
                    casillasDescubiertas++;
                }
            }
        }
        return casillasDescubiertas == (FILAS * COLUMNAS - MINAS);
    }

    // Imprime el tablero visible (con casillas ocultas)
    public void imprimirTablero() {
        System.out.println("\nTABLERO:");
        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                if (!descubierto[fila][columna]) {
                    System.out.printf("%-3s", "-");  // Casilla no descubierta
                } else if (tablero[fila][columna] == MINA) {
                    System.out.printf("%-3s", "X");  // Mina
                } else if (tablero[fila][columna] == 0) {
                    System.out.printf("%-3s", " ");  // Espacio vacío para el "0"
                } else {
                    System.out.printf("%-3d", tablero[fila][columna]);  // Número de minas adyacentes
                }
            }
            System.out.println();  // Salto de línea después de cada fila
        }
    }

    // Imprime el tablero completo al final del juego
    public void imprimirTableroFinal() {
        System.out.println("\nTABLERO FINAL:");
        for (int fila = 0; fila < FILAS; fila++) {
            for (int columna = 0; columna < COLUMNAS; columna++) {
                if (tablero[fila][columna] == MINA) {
                    System.out.printf("%-3s", "X");  // Mina
                } else if (tablero[fila][columna] == 0) {
                    System.out.printf("%-3s", " ");  // Espacio vacío para el "0"
                } else {
                    System.out.printf("%-3d", tablero[fila][columna]);  // Número de minas adyacentes
                }
            }
            System.out.println();  // Salto de línea después de cada fila
        }
    }
}

