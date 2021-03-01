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
    private short codigo;
    private Object dato;
    
    //fin de atributos
    
    //----------------------------------------------------------//
    
    //Constructor vacio y lleno

    
    
    public Vertice() {
    }

    public Vertice(Object dato,short codigo) {
        this.codigo = codigo;
        this.dato = dato;
    }
    
   //----------------------------------------------------------//

    //Get y set

    public short getCodigo() {
        return codigo;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Vertice{" + "codigo=" + codigo + ", dato=" + dato + '}';
    }
    
    
}
