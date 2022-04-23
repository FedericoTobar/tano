/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalalumnos;

/**
 *
 * @author Tano
 */
public class Nota {
    private int codigoCatedra;
    private String valorNota;

    public Nota(int codigoCatedra, String valorNota) {
        this.codigoCatedra = codigoCatedra;
        this.valorNota = valorNota;
    }

    public Nota() {
    }

    public int getCodigoCatedra() {
        return codigoCatedra;
    }

    public void setCodigoCatedra(int codigoCatedra) {
        this.codigoCatedra = codigoCatedra;
    }

    public String getValorNota() {
        return valorNota;
    }

    public void setValorNota(String valorNota) {
        this.valorNota = valorNota;
    }
    
    
}
