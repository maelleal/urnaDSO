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
public enum CARGO {
    
    
    GOVERNADOR(00),
    DEPUTADO(0000);
    
    public int cargo;
        CARGO (int cargoPolitico) {
            cargo = cargoPolitico;
        }
   
}
