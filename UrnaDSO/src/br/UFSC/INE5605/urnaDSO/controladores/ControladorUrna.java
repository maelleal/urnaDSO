/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.urnaDSO.controladores;

import br.UFSC.INE5605.urnaDSO.interfaces.ICandidato;
import br.UFSC.INE5605.urnaDSO.telas.TelaUrna;
import br.UFSC.INE5605.urnaDSO.entidades.Cargo;
import br.UFSC.INE5605.urnaDSO.entidades.Candidato;
import br.UFSC.INE5605.urnaDSO.entidades.Eleitor;
import br.UFSC.INE5605.urnaDSO.entidades.PartidoPolitico;
import br.UFSC.INE5605.urnaDSO.entidades.SecaoEleitoral;
import br.UFSC.INE5605.urnaDSO.entidades.Urna;
import br.UFSC.INE5605.urnaDSO.entidades.Voto;
import br.UFSC.INE5605.urnaDSO.entidades.ZonaEleitoral;
import java.util.ArrayList;

/**
 *
 * @author Ismael
 */
public class ControladorUrna {
    
    private TelaUrna telaUrna;
    private ArrayList<Voto>listaVotosDeputados;
    private ArrayList<Voto>listaVotosGovernadores;
    private ArrayList<Urna>urnas;

    public ControladorUrna() {
        this.telaUrna = new TelaUrna(this);
        this.listaVotosDeputados = new ArrayList();
        this.listaVotosDeputados = new ArrayList();
        this.urnas = new ArrayList();
    }
    
    
    
    
    public void iniciarVotacao(){
        telaUrna.exibeMenuVotacao();
    }
        //verifica se o eleitor já votou
        /*Eleitor eleitor = new Eleitor(tituloEleitoral);
        if(!eleitor.getJaVotou()) {
        
        ControladorUrna.this.incluiVotoGovernador();
            telaUrna.votoRealizado();
            eleitor.setJaVotou(true);
        } else {
            telaUrna.eleitorJaVotou();
        }

              
    }
    
    public void adicionaVotoDeputado (int op) {
        if (op == 1) {
        //adiciona voto
        this.listaVotosDeputados.add(voto);
        } else if (op == 2){
            op = 0;  
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
                    telaUrna.confirmaCandidato(candidato);
                    
                } else {
                    telaUrna.confirmaCandidato(candidato);
                } 
            } else {
                telaUrna.confirmaCandidato(candidato);
            }
            
        }
                   
    }
    
    */
}
