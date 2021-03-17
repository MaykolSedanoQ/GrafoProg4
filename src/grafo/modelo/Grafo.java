/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo.modelo;

import com.grafo.modelo.excepcion.GrafoExcepcion;
import java.util.List;
import grafo.modelo.Vertice;
import grafo.modelo.Arista;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mayko
 */
public abstract class Grafo implements Serializable{

    //atributos
    private List<Vertice> vertices;
    private List<Arista> aristas;
    private short consecutivo;

    //--------------------------------------//
    //constructores
    public Grafo() {
        
        this.vertices = new ArrayList<>();
        this.aristas = new ArrayList<>();
    }

    //--------------------------------------//
    //get y set
    public List<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertice> vertices) {
        this.vertices = vertices;
    }

    public List<Arista> getAristas() {
        return aristas;
    }

    public void setAristas(List<Arista> aristas) {
        this.aristas = aristas;
    }

    public short getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(short consecutivo) {
        this.consecutivo = consecutivo;
    }

    //------------------------------------------//
    //metodos
    //Adicionar vertice
  public void adicionarVertice(Object dato)
    {
        Vertice nuevo= new Vertice(dato,++ consecutivo );
        vertices.add(nuevo);        
    }

   public void adicionarArista(Arista arista) throws GrafoExcepcion
    {
        if(validarExistenciaArista(arista))
        {
            throw new GrafoExcepcion("Ya existe la arista");
        }
        aristas.add(arista);
    }
    
    public abstract boolean  validarExistenciaArista(Arista arista);
    
    public abstract List<Arista> obtenerAdyacencias(int origen);
    

    
//    public boolean validarExistenciaArista(Arista arista) {
//        //List<Arista>aristasOrigen= new ArrayList<>();
//        for (Arista ari : this.aristas) {
//            if (ari.equals(arista)) {
//                return true;
//            }
//        }
//        return false;
//    }

    //--------------------------------------------//

}
