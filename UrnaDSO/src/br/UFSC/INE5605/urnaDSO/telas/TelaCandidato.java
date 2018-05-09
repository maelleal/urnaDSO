/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.urnaDSO.telas;

import br.UFSC.INE5605.urnaDSO.controladores.ControladorCandidato;
import br.UFSC.INE5605.urnaDSO.entidades.Candidato;
import java.util.Scanner;

/**
 *
 * @author Ismael
 */
public class TelaCandidato {
    private Scanner teclado;
    private ControladorCandidato ctrlCandidato;
    
    public TelaCandidato (ControladorCandidato ctrlCandidato){
        this.teclado = new Scanner(System.in);
        this.ctrlCandidato = ctrlCandidato;
    }
    
    public void incluiDeputado () {
        System.out.println("Candidato a Deputado Adcicionado com Sucesso");
    }
    public void incluiGovernador () {
        System.out.println("Candidato a Governador Adcicionado com Sucesso");
    }
    public void candidatoExistente() {
        System.out.println("Candidato Existente");
    }
    public void excluiDeputado () {
        System.out.println("Candidato a Deputado Excluído com Sucesso");
    }
    public void excluiGovernador () {
        System.out.println("Candidato a Governador Excluído com Sucesso");
    }
    public void candidatoInexistente() {
        System.out.println("Candidato Inexistente");
    }

    public void exibeCandidato(Candidato candidato) {
        System.out.println("Candidato: "+ candidato.getNome());
    }
    
    
}
