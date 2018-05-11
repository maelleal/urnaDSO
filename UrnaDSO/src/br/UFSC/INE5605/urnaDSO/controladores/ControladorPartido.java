/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5605.urnaDSO.controladores;

import br.UFSC.INE5605.urnaDSO.entidades.PartidoPolitico;
import br.UFSC.INE5605.urnaDSO.telas.TelaPartido;
import java.util.ArrayList;

/**
 *
 * @author Ivo Guilherme
 */
public class ControladorPartido {

    private ArrayList<PartidoPolitico> partidos;
    private TelaPartido telaPartido;

    public ControladorPartido() {
        this.partidos = new ArrayList();
        this.telaPartido = new TelaPartido(this);
    }

    public ArrayList<PartidoPolitico> getPartidos() {
        return partidos;
    }

    public void listaPartidos() {
        telaPartido.listaPartidos();
    }
    
    public void exibeMenuPartido(){
        telaPartido.exibeMenuPartido();
    }

    void incluiPartidoPolitico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void incluiPartido(String nomePartido) {
        PartidoPolitico partido = new PartidoPolitico(nomePartido);
        partidos.add(partido);
        
    
    }
}
