package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {
    String[] original;
    String[] inverso;
    Scanner scanner;

    public  Ejercicio_2(){
        original= new String[5];
        inverso= new String[5];
        scanner =new Scanner(System.in);
    }
    public void ejecutar(){
        for (int i=0; i< original.length; i++){
            System.out.println("Original [" +i+ "]: ");
            String cadena=scanner.nextLine();

            original[i]=cadena;
        }
        int indiceOriginal=0;
        int indiceInverso=4;
        while (indiceOriginal< original.length){
            inverso[indiceInverso]=original[indiceOriginal];
            indiceOriginal++;
            indiceInverso--;
        }
        for (int i=0;1<inverso.length;i++){
            System.out.println("Inversor [" +i+ "]: "+inverso[i]);
        }
    }

}
