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
public class Vertice {

    // Atributos 
    private Object dato;
    private int codigo;
    

    //fin de atributos
    //----------------------------------------------------------//
    //Constructor vacio y lleno
    public Vertice() {
    }

    public Vertice(Object dato, int codigo ) {
        this.dato = dato;
        this.codigo = codigo;

    }

    //----------------------------------------------------------//
    //Get y set

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    @Override
    public String toString() {
        return "Vertice{" + "codigo=" + codigo + ", dato=" + dato + '}';
    }

}
