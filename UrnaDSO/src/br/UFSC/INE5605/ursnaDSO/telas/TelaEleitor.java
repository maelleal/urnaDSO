/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.ursnaDSO.telas;

import br.UFSC.INE5605.ursnaDSO.controladores.ControladorEleitor;
import br.UFSC.INE5605.ursnaDSO.entidades.Eleitor;
import br.UFSC.INE5605.ursnaDSO.entidades.IEleitor;
import java.util.Scanner;

/**
 *
 * @author Ismael
 */
public class TelaEleitor implements IEleitor {
    
    private Scanner teclado;
    private ControladorEleitor ctrlEleitor;
    
    public TelaEleitor (){
        this.teclado = new Scanner(System.in);
        this.ctrlEleitor = new ControladorEleitor();
    }

    @Override
    public void cadastraEleitor(Eleitor e) {
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

    @Override
    public void excluirEleitor(Eleitor e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exibeEleitores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

   
}
