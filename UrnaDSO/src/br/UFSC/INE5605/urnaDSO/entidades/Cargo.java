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
public enum Cargo {
    
    
    GOVERNADOR(00),
    DEPUTADO(00);
    
    public int cargo;
        Cargo (int cargoPolitico) {
            cargo = cargoPolitico;
        }
   
}
