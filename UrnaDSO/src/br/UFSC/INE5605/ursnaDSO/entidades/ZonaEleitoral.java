/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.ursnaDSO.entidades;

import java.util.ArrayList;

/**
 *
 * @author Ismael
 */
public class ZonaEleitoral {
    
    private int zona;
    private ArrayList<Eleitor>eleitores;
    private ArrayList<SecaoEleitoral>secoes;

    public ZonaEleitoral(int zona) {
        this.zona = zona;
        this.eleitores = new ArrayList();
        this.secoes = new ArrayList();
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }
    
    public ArrayList<Eleitor> getEleitores(){
        return eleitores;
    }
    
    public ArrayList<SecaoEleitoral> getSecoes(){
        return secoes;
    }
    
}
