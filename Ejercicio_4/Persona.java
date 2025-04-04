package Ejercicio_4;

import java.util.Calendar;
import java.util.Date;

public class Persona {
    String nombre;
    String primerApellido;
    String segundoApellido;
    Date fechaNacimiento;
    Integer numeroCI;
    String complemento;

    public Persona(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, Integer numeroCI, String complemento) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCI = numeroCI;
        this.complemento = complemento;
    }

    public Integer calcularEdad() {
        Calendar nacimiento = Calendar.getInstance();
        nacimiento.setTime(fechaNacimiento);
        Calendar hoy = Calendar.getInstance();
        int edad = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);
        if (hoy.get(Calendar.DAY_OF_YEAR) < nacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }

    public Boolean ciComplemento() {
        if (complemento != null && !complemento.isEmpty()) {
            return true;
        }
        return false;
    }

}