/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.ursnaDSO.controladores;

import br.UFSC.INE5605.ursnaDSO.entidades.Eleitor;

/**
 *
 * @author Ismael
 */
public class ControladorUrna {
    
    public void votar (int tituloEleitoral){
        //verifica se o eleitor já votou
        Eleitor eleitor = new Eleitor(tituloEleitoral, secaoEleitoral, nome);
        if(!eleitor.jaVotou())) {
//??        incluiVotoDeputado;
//??        incluiVotoGovernador;
            System.out.println("Voto realizado com sucesso");
        } else {
             System.out.println("Eleitor Já votou");
        }
              
    }
    
        
    private void incluiVotoDeputado (int tituloEleitoral, int numeroCandidatoDeputado) throws Exception {
        Voto voto = new Voto();
        int op = 0;
        while (op != 1) {            
            //verifica se o candidato é válido
            if(ControladorCandidato.encontraCandidatoPeloNumero(numeroCandidatoDeputado)){
                //verifica se o cargoo está correto
                if(ControladorCandidato.verificaCargoDeputado(numeroCandidatoDeputado)) {
                    System.out.println("Candidato "+ candidato.getNomeCandidato);
                    System.out.println("1 - Confirma");
                    System.out.println("2 - Corrige");
//??                   op = TelaUrna.nextInt();
                    if (op == 1) {
                        //adiciona voto
                        listaVotosDeputado.add(voto);
                    } else if (op == 2){
                        op = 0;
                    }
                } else {
                    System.out.println("Candidato "+ candidato.getNomeCandidato);
                    System.out.println("1 - Confirma");
                    System.out.println("2 - Corrige");
//??                   op = TelaUrna.nextInt();
                    if (op == 1) {
                        //adiciona voto nulo
                        numeroCandidatoDeputado = 99;
                        listaVotosDeputado.add(voto);
                    } else if (op == 2){
                        op = 0;
                    }
                } 
            } else {
                System.out.println("Candidato "+ candidato.getNomeCandidato);
                    System.out.println("1 - Confirma");
                    System.out.println("2 - Corrige");
//??                   op = TelaUrna.nextInt();
                    if (op == 1) {
                        //adiciona voto nulo
                        numeroCandidatoDeputado = 99;
                        listaVotosDeputado.add(voto);
                    } else if (op == 2){
                        op = 0;
                    }
            }
            
        }
                   
    }
    
    
}
