/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.urnaDSO.controladores;

import br.UFSC.INE5605.urnaDSO.entidades.Eleitor;
import br.UFSC.INE5605.urnaDSO.entidades.SecaoEleitoral;
import br.UFSC.INE5605.urnaDSO.telas.TelaEleitor;
import java.util.ArrayList;

/**
 *
 * @author Ismael
 */
public class ControladorEleitor {

    private ArrayList<Eleitor> eleitores;
    private TelaEleitor telaEleitor;
    private ControladorCadastro ctrlCadastro;
    private ArrayList<SecaoEleitoral>secoes;
   

    public ControladorEleitor(ControladorCadastro ctrlCadastro) {
        this.eleitores = new ArrayList();
        this.telaEleitor = new TelaEleitor(this);
        this.ctrlCadastro = ctrlCadastro;
        this.secoes = new ArrayList();
    }
    
    
    
    //public void editaEleitor(Eleitor e)
    
    public Eleitor encontraEleitorPeloTitulo(int titulo){
        Eleitor a = null;
        for(Eleitor e : eleitores){
            if(e.getTituloEleitoral() == titulo){
                a = e;
            }      
        }
        return a;
    }
    
    public SecaoEleitoral encontraSecaoPeloNumero(int secaoEleitoral){
        SecaoEleitoral a = null;
        for(SecaoEleitoral s : secoes){
            if(s.getSecao() == secaoEleitoral){
                a = s;
            }      
        }
        return a;
    }
    
    
    public void exibeMenuEleitores(){
        telaEleitor.exibeMenuEleitores();
    }
    
    public void cadastraEleitor(int tituloEleitoral, int secaoEleitoral, String nome, String cidade){
        SecaoEleitoral secao = this.encontraSecaoPeloNumero(secaoEleitoral);
        
        Eleitor eleitor = new Eleitor(tituloEleitoral, secao, nome, cidade);
        eleitores.add(eleitor);
        secao.getEleitores().add(eleitor);
    }
    
    public void incluiSecao(){
        telaEleitor.incluirSecao();
    }
    
    public void cadastraSecao(int numeroSecao, String cidade){
        SecaoEleitoral secao = new SecaoEleitoral(numeroSecao, cidade);
        secoes.add(secao);
    }
    
    
    public void incluiEleitor(Eleitor e){
        eleitores.add(e);// TODO tratar exceções
    }
    
    public void excluirEleitor(Eleitor e){
        this.eleitores.remove(e);//TODO tratar exceções
    }
    
    public ArrayList<Eleitor> getEleitores(){
        return eleitores;
    }

    
    
}
