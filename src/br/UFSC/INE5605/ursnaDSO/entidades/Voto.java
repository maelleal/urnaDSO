/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.ursnaDSO.entidades;

/**
 *
 * @author Ismael
 */
public class Voto {
    
    private Candidato candidato;
    private CARGO cargo;
    

    public Voto(Candidato candidato, CARGO cargo, int turno) {
        this.candidato = candidato;
        this.cargo = cargo;
        this.turno = turno;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public CARGO getCargo() {
        return cargo;
    }

    public void setCargo(CARGO cargo) {
        this.cargo = cargo;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    
    
}
