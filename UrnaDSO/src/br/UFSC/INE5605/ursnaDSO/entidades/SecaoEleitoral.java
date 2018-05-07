/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.ursnaDSO.entidades;

/**
 *
 * @author Ismael
 */
public class SecaoEleitoral {
    
    private int secao;
    private ZonaEleitoral zona;

    public SecaoEleitoral(int secao, ZonaEleitoral zona) {
        this.secao = secao;
        this.zona = zona;
    }

    public int getSecao() {
        return secao;
    }

    public void setSecao(int secao) {
        this.secao = secao;
    }

    public ZonaEleitoral getZona() {
        return zona;
    }

    public void setZona(ZonaEleitoral zona) {
        this.zona = zona;
    }
    
    
}
