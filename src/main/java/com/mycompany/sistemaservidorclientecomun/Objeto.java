/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaservidorclientecomun;

import java.util.ArrayList;

/**
 *
 * @author juanc
 */
public class Objeto {
    
    private int referencia;
    private double largo;
    private double diametro;
    private double peso;
    private boolean tipo;
    private String msj = "";
    private ArrayList<Objeto> listaProductosAceptables;
    private ArrayList<Objeto> listaProductosDefectuosos;
    
    public Objeto(){
        
    }
    
    public Objeto(int referencia, double largo, double diametro, double peso, boolean t){
        this.referencia = referencia;
        this.largo = largo;
        this.diametro = diametro;
        this.peso = peso;
        this.tipo = t;
        
    }

    public ArrayList<Objeto> getListaProductosAceptables() {
        return listaProductosAceptables;
    }

    public ArrayList<Objeto> getListaProductosDefectuosos() {
        return listaProductosDefectuosos;
    }
    
    

    public void setListaProductosAceptables(ArrayList<Objeto> listaProductosAceptables) {
        this.listaProductosAceptables = listaProductosAceptables;
    }

    public void setListaProductosDefectuosos(ArrayList<Objeto> listaProductosDefectuosos) {
        this.listaProductosDefectuosos = listaProductosDefectuosos;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

    @Override
    public String toString() {
        return "Objeto{" + "referencia=" + referencia + ", largo=" + largo + ", diametro=" + diametro + ", peso=" + peso + ", tipo=" + tipo + ", msj=" + msj + '}';
    }

 
    
    
    
    
}
