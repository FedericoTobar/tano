/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalalumnos;

import java.util.ArrayList;

/**
 *
 * @author Tano
 */
public class Alumno {
    private long legajo;
    private String nombreCompleto;
    private double promedioNotas;
    private String estado;
    private ArrayList <Nota> notas = new ArrayList();
    private ArrayList <Nota> notasRecuperatorios = new ArrayList();
    private ArrayList <Nota> notasFinales = new ArrayList();

    public Alumno(long legajo, String nombreCompleto, double promedioNotas, String estado, ArrayList<Nota> notas, ArrayList<Nota> notasRecuperatorios, ArrayList<Nota> notasFinales) {
        this.legajo = legajo;
        this.nombreCompleto = nombreCompleto;
        this.promedioNotas = promedioNotas;
        this.estado = estado;
        this.notas = notas;
        this.notasRecuperatorios = notasRecuperatorios;
        this.notasFinales = notasFinales;
    }

    public Alumno() {}

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public ArrayList<Nota> getNotasRecuperatorios() {
        return notasRecuperatorios;
    }

    public void setNotasRecuperatorios(ArrayList<Nota> notasRecuperatorios) {
        this.notasRecuperatorios = notasRecuperatorios;
    }

    public ArrayList<Nota> getNotasFinales() {
        return notasFinales;
    }

    public void setNotasFinales(ArrayList<Nota> notasFinales) {
        this.notasFinales = notasFinales;
    }

  
}
