/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.ursnaDSO.controladores;

import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class TelaPrincipal {
    
    private ControladorPrincipal ctrlPrincipal;
    private Scanner teclado;

    public TelaPrincipal(ControladorPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
        this.teclado = new Scanner(System.in);
    }
    
    
    
}
