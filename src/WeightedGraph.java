import java.util.*;

// Class to represent a weighted graph
public class WeightedGraph<V> {
    private Map<V, Vertex<V>> vertices; // Map of vertices in the graph
    private boolean directed; // Indicates if the graph is directed

    // Constructor to initialize the graph
    public WeightedGraph(boolean directed) {
        this.directed = directed;
        this.vertices = new HashMap<>(); // Initialize the map of vertices
    }

    // Method to add a vertex to the graph
    public void addVertex(V data) {
        if (!vertices.containsKey(data)) { // If the vertex is not already present
            vertices.put(data, new Vertex<>(data)); // Add the vertex to the map
        }
    }

    // Method to add an edge to the graph
    public void addEdge(V sourceData, V destData, double weight) {
        addVertex(sourceData);
        addVertex(destData);
        Vertex<V> source = vertices.get(sourceData);
        Vertex<V> dest = vertices.get(destData);
        source.addAdjacent(dest, weight);
        if (!directed) { // If the graph is undirected
            dest.addAdjacent(source, weight);
        }
    }

    // Method to get a vertex by its data
    public Vertex<V> getVertex(V data) {
        return vertices.get(data);
    }

    // Method to get all vertices in the graph
    public Collection<Vertex<V>> getAllVertices() {
        return vertices.values();
    }
}
