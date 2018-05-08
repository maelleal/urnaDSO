/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.urnaDSO.telas;

import br.UFSC.INE5605.urnaDSO.controladores.ControladorCadastro;
import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class TelaCadastro {
    
    private ControladorCadastro ctrlCadastro;
    private Scanner teclado;

    public TelaCadastro(ControladorCadastro ctrlCadastro) {
        this.ctrlCadastro = ctrlCadastro;
        this.teclado = new Scanner(System.in);
        
    }
    
    
    
}
