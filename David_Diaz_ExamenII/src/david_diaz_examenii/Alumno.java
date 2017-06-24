package david_diaz_examenii;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Alumno extends Soldado{
    private String apodo;
    private int numero_cuenta;
    private int edad;
    private int resistencia;
    private int grado_academico;
    private String mochila;
    private int poder_fuego;
    public Alumno() {
    }

    public Alumno(String apodo, int numero_cuenta, int edad, int resistencia, int grado_academico, String mochila, int poder_fuego) {
        this.apodo = apodo;
        this.numero_cuenta = numero_cuenta;
        this.edad = edad;
        this.resistencia = resistencia;
        this.grado_academico = grado_academico;
        this.mochila = mochila;
        this.poder_fuego = poder_fuego;
    }
    
    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getGrado_academico() {
        return grado_academico;
    }

    public void setGrado_academico(int grado_academico) {
        this.grado_academico = grado_academico;
    }

    public String getMochila() {
        return mochila;
    }

    public void setMochila(String mochila) {
        this.mochila = mochila;
    }
    
    public int getPoder_fuego() {
        return poder_fuego;
    }

    public void setPoder_fuego(int poder_fuego) {
        this.poder_fuego = poder_fuego;
    }
    
    @Override
    public String toString() {
        return "Alumn " + apodo;
    }
    
}
