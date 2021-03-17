/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo.modelo.dijkstra;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author mayko
 */
public class VerticeDijkstra implements Serializable{
    
    //atributos
    private int codigo;
    private VerticeDijkstra anterior;
    private short peso;
    private boolean marcado;
   
    
    
    //constructor

    public VerticeDijkstra(int codigo, VerticeDijkstra anterior, short peso) {
        this.codigo = codigo;
        this.anterior = anterior;
        this.peso = peso;
    }

   
//get y set

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    public VerticeDijkstra getAnterior() {
        return anterior;
    }

    public void setAnterior(VerticeDijkstra anterior) {
        this.anterior = anterior;
    }

    public short getPeso() {
        return peso;
    }

    public void setPeso(short peso) {
        this.peso = peso;
    }

    public boolean isMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }

    
    
   
    
    
}
