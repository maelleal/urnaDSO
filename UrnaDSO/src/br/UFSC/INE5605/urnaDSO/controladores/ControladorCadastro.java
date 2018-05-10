/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.urnaDSO.controladores;

import br.UFSC.INE5605.urnaDSO.telas.TelaCadastro;
import br.UFSC.INE5605.urnaDSO.controladores.ControladorPartido;
import br.UFSC.INE5605.urnaDSO.entidades.ZonaEleitoral;
/**
 *
 * @author rodri
 */
public class ControladorCadastro {
    
    private TelaCadastro telaCadastro;
    private ControladorPrincipal ctrlPrincipal;
    private ControladorEleitor ctrlEleitor;
    private ControladorCandidato ctrlCandidato;
    private ControladorPartido ctrlPartido;
    private ZonaEleitoral zonaEleitoral;

    public ControladorCadastro(ControladorPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
        this.telaCadastro = new TelaCadastro(this);
       
    }
    
    public void iniciaCadastro() {
        telaCadastro.exibeMenuCadastro();
        
    }
    
    public void executaOpcaoCadastro(int opcaoCadastro){
        if (opcaoCadastro == 4) {
           ctrlEleitor.exibeMenuEleitores();
        }
        if (opcaoCadastro == 5) {
           ctrlCandidato.incluiCandidato();
        }
        if (opcaoCadastro == 6) {
           ctrlPartido.incluiPartidoPolitico();
        }
        
    }
     
}
