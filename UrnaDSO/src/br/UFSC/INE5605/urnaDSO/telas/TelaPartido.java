/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.urnaDSO.telas;

import br.UFSC.INE5605.urnaDSO.controladores.ControladorCadastro;
import br.UFSC.INE5605.urnaDSO.controladores.ControladorPartido;
import java.util.Scanner;

/**
 *
 * @author ismael
 */
public class TelaPartido {
    private ControladorPartido ctrlPartido;
    private Scanner teclado;

    public TelaPartido(ControladorPartido ctrlPartido) {
        this.ctrlPartido = ctrlPartido;
        this.teclado = new Scanner(System.in);
    }

    
    public void adicionaPartido(){
        System.out.println("Partido Adicionado com Sucesso");
    }
    public void excluiPartido(){
        System.out.println("Partido Excluído com Sucesso");
    }
    public void partidoExistente(){
        System.out.println("Partido Existente");
    }
    public void partidoInexistente() {
        System.out.println("Partido Inexistente");
    }
    
    
    
    
    
    
    
    
    
    
}
