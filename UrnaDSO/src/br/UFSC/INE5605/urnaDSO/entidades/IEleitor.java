/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.urnaDSO.entidades;

/**
 *
 * @author rodri
 */
public interface IEleitor {
    
    public void cadastraEleitor(Eleitor e);
    
    public void excluirEleitor(Eleitor e);
    
    public void exibeEleitores();   
    
    
}
