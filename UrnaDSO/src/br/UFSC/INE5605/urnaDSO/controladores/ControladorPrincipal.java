
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.urnaDSO.controladores;

import br.UFSC.INE5605.urnaDSO.telas.TelaPrincipal;

/**
 *
 * @author rodri
 */
public class ControladorPrincipal {
    
    private TelaPrincipal telaPrincipal;

    public ControladorPrincipal() {
        this.telaPrincipal = new TelaPrincipal(this);
        
    }
    
    public void exibeMenuPrincipal(){
        telaPrincipal.exibeMenuPrincipal();
    }
    
    public void iniciarCadastro(){
        
    }
    
    public void iniciarVotacao() {
        
        
    }
    
    public void exibeResultado() {
        
    }
}