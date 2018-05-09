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
public enum CARGO {
    
    
    GOVERNADOR(01),
    DEPUTADO(02);
    
    public int cargo;
        CARGO (int cargoPolitico) {
            cargo = cargoPolitico;
        }
   
}