/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.urnaDSO.controladores;

import br.UFSC.INE5605.urnaDSO.entidades.CARGO;
import br.UFSC.INE5605.urnaDSO.entidades.Candidato;
import br.UFSC.INE5605.urnaDSO.entidades.PartidoPolitico;
import br.UFSC.INE5605.urnaDSO.controladores.ControladorCandidato;

/**
 *
 * @author Ismael
 */
public class UrnaDSO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ControladorPrincipal ctrlPrincipal; 
        ctrlPrincipal = new ControladorPrincipal();
        ctrlPrincipal.inicializa();
    
    }
    
    
}
