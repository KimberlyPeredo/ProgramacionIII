package Ejercicio6;
import Ejercicio6.Pojos.Mes;

import java.util.Scanner;

public class Ejercicio6 {
    Mes[] meses=new Mes[12];
    Scanner sc;
    public Ejercicio6(){
        meses[0]= new Mes(1,"Enero",31);
        meses[1]= new Mes(2,"Febrero",28);
        meses[2]= new Mes(3,"Marzo",31);
        meses[3]= new Mes(4,"Abril",30);
        meses[4]= new Mes(5,"Mayo",31);
        meses[5]= new Mes(6,"Junio",30);
        meses[6]= new Mes(7,"Julio",31);
        meses[7]= new Mes(8,"Agosto",31);
        meses[8]= new Mes(9,"Septiembre",30);
        meses[9]= new Mes(10,"Octubre",31);
        meses[10]= new Mes(11,"Noviembre",30);
        meses[11]= new Mes(12,"Diciembre",31);
        sc=new Scanner(System.in);
    }
    public void ejecutar(){
        System.out.println("Introduzca el nummero del mes:");
        int numero=sc.nextInt();

        Mes mes=meses[numero-1];

        //System.out.println("Mes: "+ mes.getNombre());
        //System.out.println("Cantidad de dias: "+ mes.getCantidadDias());
        System.out.println(mes);
    }
}
