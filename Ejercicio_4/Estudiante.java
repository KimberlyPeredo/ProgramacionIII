package Ejercicio_4;

import java.util.Date;

public class Estudiante extends Persona {
    String codigoSIS;

    public Estudiante(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, Integer numeroCI, String complemento, String codigoSIS) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento, numeroCI, complemento);
        this.codigoSIS = codigoSIS;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + primerApellido + " " + segundoApellido + ", Edad: " + calcularEdad() + ", CI: " + numeroCI + (ciComplemento() ? "-" + complemento : "") + ", Código SIS: " + codigoSIS;
    }

}