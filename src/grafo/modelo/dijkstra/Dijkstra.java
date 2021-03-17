/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo.modelo.dijkstra;

import grafo.modelo.Arista;
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
        llenarVerticesDjikstra();
    }

       private void llenarVerticesDjikstra()
    {
        verticesD= new ArrayList<>();
        //Recorre todos los vertices del grafo
        for(Vertice vertGrafo: grafo.getVertices())
        {
            //Parado en un vertice del grafo
            VerticeDijkstra vertD= new VerticeDijkstra(
                    vertGrafo.getCodigo(),null,(short)0);
            verticesD.add(vertD);
        }
    }
    
//    private void llenarVesticesDijkstra() {
//
//        verticesD = new ArrayList<>();
//        //Recorre todos los vertices del grafo
//        for (Vertice vertGrafo : grafo.getVertices()) {
//            //Parado en un vertice del grafo
//            VerticeDijkstra vertD = new VerticeDijkstra(
//                    vertGrafo.getCodigo(), null, (short) 0);
//            verticesD.add(vertD);
//        }
//    }
//    

    public List<VerticeDijkstra> calcularDijkstra() {

        VerticeDijkstra vertActual;
        //1-Pararme en el origen
        vertActual = obtenerVerticexCodigo(origen);
        //null y peso 0
        /*        
        2. Asigno de donde viene y peso acumulado  (Faltante)      
        3. obtengo las adyancencias del vertice en el que estoy
        (Diferente si el grafo es dirigido o no dirigido
         */
        List<Arista> adyacencias = grafo.obtenerAdyacencias(vertActual.getCodigo());
        /*
        4. Visito todas las adyancencias        
        5. Cada adyacencia actualizo su origen y peso acumulado
           cuando es menor
         */
        for (Arista ari : adyacencias) {
            VerticeDijkstra visitado = obtenerVerticexCodigo(ari.getDestino());
            //Actualizarle su origne y peso
            if (visitado.getAnterior() == null) {
                //NO ha sido visitado
                visitado.setAnterior(vertActual);
                visitado.setPeso((vertActual.getPeso() + ari.getPeso()));

            } else {
                short pesoAcumulado = (short) (vertActual.getPeso() + ari.getPeso());
                if (pesoAcumulado < visitado.getPeso()) {
                    visitado.setAnterior(vertActual);
                    visitado.setPeso(pesoAcumulado);
                }
            }
        }
        /*
        6.  a) Marco en el que estoy parado            
             b)verificar si ya todos estan marcados (Finishing) voy al punto 8
            cuando todos vertcesD esten marcado - marcados = verticesD.size() (Faltante)
         */
        vertActual.setMarcado(true);

        /*
        7. Salto a la adyacencia menor no marcada        
        
        8. Sacar la ruta - Me paro en el destino y empiezo a devolverme
         */
        return null;
    }

    public VerticeDijkstra obtenerVerticexCodigo(int codigo) {
        //Los objetos son referencias en memoria

        for (VerticeDijkstra vertD : verticesD) {
            if (vertD.getCodigo() == codigo) {
                return vertD;
            }
        }

        return null;
    }

    private void actualizarAdyacencias(VerticeDijkstra actual) {

        //obtener las adyacencias de verticesD recorriendo las aristas del grafo
        //actualizo los pesos y anterior de las adyacencias 
        //Si esta nulo el anterior actualizo el anterior con el vertice actual
        //Si no esta nulo comparo si es menor que el peso acumulado para actualiuzar
    }

    private VerticeDijkstra obtenerAdyacenciaMenorNoVisitada(List<Arista> adyacencias) {
        return null;
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
