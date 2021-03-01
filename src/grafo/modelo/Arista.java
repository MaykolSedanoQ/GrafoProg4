/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo.modelo;

/**
 *
 * @author mayko
 */
public class Arista {

    //atributos
    private short origen;
    private short destino;
    private short peso;

    //--------------------------------------------------------//
    //constructor vacio y lleno
    public Arista() {
    }

    public Arista(short origen, short destino, short peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }

    //--------------------------------------------------------//
    //get y set
    public short getOrigen() {
        return origen;
    }

    public void setOrigen(short origen) {
        this.origen = origen;
    }

    public short getDestino() {
        return destino;
    }

    public void setDestino(short destino) {
        this.destino = destino;
    }

    public short getPeso() {
        return peso;
    }

    public void setPeso(short peso) {
        this.peso = peso;
    }

    //--------------------------------------------------------//
    @Override
    public String toString() {
        return "Arista{" + "origen=" + origen + ", destino=" + destino + ", peso=" + peso + '}';
    }

     @Override
    public boolean equals(Object obj) {
        if(obj instanceof Arista)
        {            
            if( ((Arista) obj).getOrigen() == origen 
                    && ((Arista) obj).getDestino() == destino 
                    && ((Arista) obj).getPeso()== peso)
            {
                return true;
            }            
        }
        return false;
    }

    
    

}