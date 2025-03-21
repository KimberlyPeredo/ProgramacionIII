package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {
    int[] notas;
    Scanner scanner;
    public Ejercicio_3(){
        notas =new int[5];
        scanner=new Scanner(System.in);
    }
    public void ejecutar(){
        for (int i=0; i<notas.length; i++){
            System.out.println("notas[" +i+ "]: ");
            int nota=scanner.nextInt();
            notas[i]=nota;
        }
        double suma=0;
        double promedio;
        int minimo=10;
        int maximo=0;
        for (int i=0; i< notas.length; i++){
            System.out.println("notas[" +i+ "]"+notas[i]);
            suma+=notas[i];

            if (notas[i]<minimo){
                minimo=notas[i];
            }
            if (notas[i]>maximo){
                maximo=notas[i];
            }
        }
        promedio=suma/ notas.length;
        System.out.println("Promedio: "+promedio);
        System.out.println("Maximo: "+maximo);
        System.out.println("Minimo: "+minimo);
    }
}
