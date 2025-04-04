package Ejercicio9.Pojos;

public class Dia {
    private  double temperaturaMinima;
    private double temperaturaMaxima;
    private double temperaturaMedia;
    public  Dia(double temperaturaMinima, double temperaturaMaxima, double temperaturaMedia){
        this.temperaturaMinima=temperaturaMinima;
        this.temperaturaMaxima=temperaturaMaxima;
        this.temperaturaMedia=temperaturaMedia;
    }

    @Override
    public String toString() {
        return "Dia{" +
                "temperaturaMinima=" + temperaturaMinima +
                ", temperaturaMaxima=" + temperaturaMaxima +
                ", temperaturaMedia=" + temperaturaMedia +
                '}';
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }
}
