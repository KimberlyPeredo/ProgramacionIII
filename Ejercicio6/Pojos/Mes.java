package Ejercicio6.Pojos;

public class Mes {
    private int numero;
    private String nombre;
    private int cantidadDias;

    public Mes(int numero, String nombre, int cantidadDias){
        this.numero=numero;
        this.nombre=nombre;
        this.cantidadDias=cantidadDias;
    }

    @Override
    public String toString() {
        return "Mes: " + nombre + ", Cantidad de dias: "+ cantidadDias;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }
}
