/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.urnaDSO.telas;

import br.UFSC.INE5605.urnaDSO.controladores.ControladorEleitor;
import br.UFSC.INE5605.urnaDSO.entidades.Eleitor;
import br.UFSC.INE5605.urnaDSO.interfaces.IEleitor;
import java.util.Scanner;

/**
 *
 * @author Ismael
 */
public class TelaEleitor {
    
    private Scanner teclado;
    private ControladorEleitor ctrlEleitor;
    
    public TelaEleitor (ControladorEleitor ctrlEleitor){
        this.teclado = new Scanner(System.in);
        this.ctrlEleitor = ctrlEleitor;
    }

   
    public void exibeMenuEleitores() {
        System.out.println("==== Cadastro de Eleitor ===="); 
        System.out.println(""); 
        System.out.println("Preencha os dados a seguir"); 
        System.out.println(""); 
        System.out.println("Nome do eleitor: ");
        String nome = teclado.next();
        System.out.println("Numero do titulo de eleitor: ");
        int tituloEleitoral = teclado.nextInt();
        System.out.println("Numero da secao: ");
        int secaoEleitoral = teclado.nextInt();
    }

  
    public void excluirEleitor(Eleitor e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    public void exibeEleitores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

   
}
