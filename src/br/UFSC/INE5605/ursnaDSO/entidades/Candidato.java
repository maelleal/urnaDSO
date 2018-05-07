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
public class Candidato extends Pessoa {
    
    
    private CARGO cargo;
    private PartidoPolitico partido;
    private int numeroCandidato;

    public Candidato(CARGO cargo, PartidoPolitico partido, int numeroCandidato, String nome) {
        super(nome);
        this.cargo = cargo;
        this.partido = partido;
        this.numeroCandidato = numeroCandidato;
    }


    public CARGO getCargo() {
        return cargo;
    }

    public void setCargo(CARGO cargo) {
        this.cargo = cargo;
    }

    public PartidoPolitico getPartido() {
        return partido;
    }

    public void setPartido(PartidoPolitico partido) {
        this.partido = partido;
    }

    public int getNumeroCandidato() {
        return numeroCandidato;
    }

    public void setNumeroCandidato(int numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    
    
    
}
