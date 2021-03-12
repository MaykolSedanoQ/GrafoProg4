/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo.modelo.dijkstra;

import grafo.modelo.Grafo;
import grafo.modelo.Vertice;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mayko
 */
public class Dijkstra implements Serializable {

    private short origen;
    private short destino;
    private List<VerticeDijkstra> verticesD;
    // private List<VerticeDijkstra> rutaCorta;
    private int marcados;
    private Grafo grafo;

    //constructor
    public Dijkstra(short origen, short destino, Grafo grafo) {
        this.origen = origen;
        this.destino = destino;
        this.grafo = grafo;
        //crear los vertices Dijkstra
        llenarVesticesDijkstra();
    }

    private void llenarVesticesDijkstra(){
        
        verticesD= new ArrayList<>();
        
        for(Vertice verGrafo: grafo.getVertices()){
            
            //Parado en un vertice del grafo
            VerticeDijkstra vertD= new VerticeDijkstra(verGrafo.getCodigo(),null,(short)0);
            verticesD.add(vertD);
        }
    }
    public List<VerticeDijkstra> calcularDijkstra() {

        VerticeDijkstra vertActual;
        //1-Pararme en el origen
        vertActual = obtenerVerticexCodigo(origen);
        //null y peso 0
        
        
        
        
        /*
        1-Pararme en el origen
        2-Asigno de donde viene y el peso acumlado
        3-Obtengo las adyacencas
        4-Visito todas las adyacencias
        5-Cada abyancencia actualizo su origen y peso acumulado
        cuando es menor
        6-Marco en el que estoy parado
        verificar si ya todos estan marcados (finalizar) voy a l punto 8
        Cuando todos los verticesD estencen marcados = verticesD.size()
        7-salto a la adyacencia menor no marcada
        8- Sacar la ruta me paro en el destino y empiezo a devolverme
         */
        
        return null;
    }

    
    public VerticeDijkstra obtenerVerticexCodigo(short codigo){
        //Los objetos son referencias en memoria

        for(VerticeDijkstra vertD:verticesD){
            if(vertD.getCodigo()== codigo){
                return vertD;
            }
        }
  
        return null;
    }
    
    private void actualizarAdyacencias(VerticeDijkstra actual){
        
        //obtener las adyacencias de verticesD recorriendo las aristas del grafo
        //actualizo los pesos y anterior de las adyacencias 
        //Si esta nulo el anterior actualizo el anterior con el vertice actual
        //Si no esta nulo comparo si es menor que el peso acumulado para actualiuzar
        
    }
    
    
    
    //Solo get para que solo vean la iunformacion pero no la modifiquen
    public short getOrigen() {
        return origen;
    }

    public short getDestino() {
        return destino;
    }

    public List<VerticeDijkstra> getVertices() {
        return verticesD;
    }

    public int getMarcados() {
        return marcados;
    }

    public Grafo getGrafo() {
        return grafo;
    }

}
