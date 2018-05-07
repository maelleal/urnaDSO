/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.ursnaDSO.controladores;

import br.UFSC.INE5605.ursnaDSO.entidades.CARGO;
import br.UFSC.INE5605.ursnaDSO.entidades.Candidato;
import br.UFSC.INE5605.ursnaDSO.entidades.PartidoPolitico;
import java.util.ArrayList;

/**
 *
 * @author Ismael
 */
public class ControladorCandidato {

    private ArrayList<Candidato> candidatosDep = new ArrayList<>();
    private ArrayList<Candidato> candidatosGov = new ArrayList<>();

    public ControladorCandidato() {
    }
    
    public void incluiCandidato (CARGO cargo, PartidoPolitico partido, int numeroCandidato, String nome){
        Candidato candidato = new Candidato(cargo, partido, numeroCandidato, nome);
        if (cargo.equals(CARGO.DEPUTADO)) {
            candidatosDep.add(candidato);
        } else if(cargo.equals(CARGO.GOVERNADOR)) {
            candidatosGov.add(candidato);
        }
    }
}
