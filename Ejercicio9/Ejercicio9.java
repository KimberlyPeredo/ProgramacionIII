package Ejercicio9;
import Ejercicio9.Pojos.Dia;

import java.util.Scanner;

public class Ejercicio9 {
    Dia[] dias;
    Scanner sc;
    public Ejercicio9(){
        dias=new Dia[5];
        sc=new Scanner(System.in);
    }
    public void ejecutar(){
        for (int i=0;i< dias.length;i++){
            System.out.println("Temperatura minima dias[" + i + "]: ");
            double minima= sc.nextDouble();

            System.out.println("Temperatura maxima dias[" + i + "]: ");
            double maxima= sc.nextDouble();

            double media=(minima+maxima)/2.0;

            Dia dia=new Dia(minima, maxima, media);
            dias[i]=dia;
        }
        System.out.println("\nTemperaturas medias: ");
        for (int i=0; i<dias.length; i++){
            System.out.println("Temperaturas media dias[" + i + "]: " +dias[i].getTemperaturaMedia());
        }
        for (int i=0;i<dias.length-1; i++){
            for (int j=0;j< dias.length-1-i;j++){
                if (dias[j].getTemperaturaMinima()>dias[j+1].getTemperaturaMinima()){
                    Dia auxiliar=dias[j];
                    dias[j]=dias[j+1];
                    dias[j+1]=auxiliar;
                }
            }
        }System.out.println("\nTemperaturas minimas: ");
        for (int i=0; i<2; i++){
            System.out.println("Temperaturas minima dias[" + i + "]: " +dias[i].getTemperaturaMinima());
        }
        System.out.println("Introduzca una temperatura:");
        double temperatura=sc.nextDouble();
        int contador=0;
        for (int i=0;i<dias.length;i++){
            if (temperatura==dias[i].getTemperaturaMaxima()){
                System.out.println(dias[i]);
                contador++;
            }
        }
        if (contador==0){
            System.out.println("No existe ninguna temperatura maxima que coincida con la temperatura ingresada.");
        }
    }
}
