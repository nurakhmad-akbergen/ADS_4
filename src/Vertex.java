import java.util.*;

// Class to represent a vertex in a graph
public class Vertex<V> {
    private V data; // The data stored in the vertex
    private Map<Vertex<V>, Double> adjacentVertices; // Map of adjacent vertices and edge weights

    // Constructor to initialize the vertex with data
    public Vertex(V data) {
        this.data = data;
        this.adjacentVertices = new HashMap<>(); // Initialize the map of adjacent vertices
    }

    // Getter for the data
    public V getData() {
        return data;
    }

    // Method to add an adjacent vertex with a specified edge weight
    public void addAdjacent(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight); // Add the adjacent vertex and weight to the map
    }

    // Getter for the map of adjacent vertices
    public Map<Vertex<V>, Double> getAdjacent() {
        return adjacentVertices;
    }

    // Override toString method to return the string representation of the data
    @Override
    public String toString() {
        return data.toString();
    }
}
