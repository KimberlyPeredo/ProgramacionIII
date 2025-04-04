package Ejercicio11;

public class Ejercicio11 {
    int[][] diagonal;
    public  Ejercicio11(){
        diagonal=new int[5][5];
    }
    public void ejecutar(){
        for(int i=0;i< diagonal.length;i++){
            for(int j=0;j<diagonal.length;j++){
                if (i==j){
                    diagonal[i][j]=1;
                }else {
                    diagonal[i][j]=0;
                }
            }
        }
        for(int i=0;i< diagonal.length;i++){
            for(int j=0;j<diagonal.length;j++){
                System.out.print(diagonal[i][j]+" ");
            }
            System.out.println();
        }
    }
}
