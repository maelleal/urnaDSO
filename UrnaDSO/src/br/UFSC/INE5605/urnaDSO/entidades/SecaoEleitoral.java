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
public class SecaoEleitoral {
    
    private int secao;
    private Urna urna;

    public SecaoEleitoral(int secao, Urna urna) {
        this.secao = secao;
        this.urna = new Urna(this);
        
    }

    public int getSecao() {
        return secao;
    }

    public void setSecao(int secao) {
        this.secao = secao;
    }

    public Urna getUrna() {
        return urna;
    }

    public void setUrna(Urna urna) {
        this.urna = urna;
    }
    
    
}
