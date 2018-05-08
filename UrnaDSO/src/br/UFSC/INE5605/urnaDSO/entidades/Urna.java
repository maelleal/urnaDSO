/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.urnaDSO.entidades;

/**
 *
 * @author Ismael
 */
public class Urna {
    
    private int urna;
    private SecaoEleitoral secao;
    private ZonaEleitoral zona;

    public Urna(int urna, SecaoEleitoral secao, ZonaEleitoral zona) {
        this.urna = urna;
        this.secao = secao;
        this.zona = zona;
    }

    public int getUrna() {
        return urna;
    }

    public void setUrna(int urna) {
        this.urna = urna;
    }

    public SecaoEleitoral getSecao() {
        return secao;
    }

    public void setSecao(SecaoEleitoral secao) {
        this.secao = secao;
    }

    public ZonaEleitoral getZona() {
        return zona;
    }

    public void setZona(ZonaEleitoral zona) {
        this.zona = zona;
    }
    
    
    
}
