package david_diaz_examenii;
import javax.swing.JOptionPane;

public class Aleman extends Soldado{
    private String alias;
    private int edad;
    private String casta;
    private int resistencia;
    private String tipo_arma;
    private int poder_fuego;
    public Aleman() {
    }

    public Aleman(String alias, int edad, String casta, int resistencia, String tipo_arma, int poder_fuego) {
        this.alias = alias;
        this.edad = edad;
        this.casta = casta;
        this.resistencia = resistencia;
        this.tipo_arma = tipo_arma;
        this.poder_fuego = poder_fuego;
    }

    

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCasta() {
        return casta;
    }

    public void setCasta(String casta) {
        this.casta = casta;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getTipo_arma() {
        return tipo_arma;
    }

    public void setTipo_arma(String tipo_arma) {
        this.tipo_arma = tipo_arma;
    }

    public int getPoder_fuego() {
        return poder_fuego;
    }

    public void setPoder_fuego(int poder_fuego) {
        this.poder_fuego = poder_fuego;
    }
    
    @Override
    public String toString() {
        return "Aleman " + alias;
    }
    
}
