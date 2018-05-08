/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.urnaDSO.telas;

import java.util.Scanner;
import br.UFSC.INE5605.urnaDSO.controladores.ControladorUrna;
import br.UFSC.INE5605.urnaDSO.entidades.Candidato;
/**
 *
 * @author Ismael
 */
public class TelaUrna {
    
    private Scanner teclado;
    private ControladorUrna ctrlUrna;
    
    public TelaUrna (){
        this.teclado = new Scanner(System.in);
        this.ctrlUrna = new ControladorUrna();
    }
    
    public void confirmaCandidato (Candidato candidato) {
        System.out.println("Candidato "+ candidato.getNome());
        System.out.println("1 - Confirma");
        System.out.println("2 - Corrige");
    
    }
    
    public void votoRealizado() {
        System.out.println("Voto realizado com sucesso!");
    }
    
    public void eleitorJaVotou() {
        System.out.println("Eleitor já votou.");
    }
}
