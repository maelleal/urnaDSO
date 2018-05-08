/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.urnaDSO.telas;

import br.UFSC.INE5605.urnaDSO.controladores.ControladorCandidato;
import java.util.Scanner;

/**
 *
 * @author Ismael
 */
public class TelaCandidato {
    private Scanner teclado;
    private ControladorCandidato ctrlCandidato;
    
    public TelaCandidato (){
        this.teclado = new Scanner(System.in);
        ControladorCandidato ctrlCandidato = new ControladorCandidato();
    }
    
    public void adicionaDeputado () {
        System.out.println("Candidato a Deputado Adcicionado com Sucesso");
    }
    public void adicionaGovernador () {
        System.out.println("Candidato a Governador Adcicionado com Sucesso");
    }
    public void candidatoExistente() {
        System.out.println("Candidato Existente");
    }
    
}
