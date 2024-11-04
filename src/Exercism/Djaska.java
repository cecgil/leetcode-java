package Exercism;

import java.util.Scanner;

public class Djaska {
    private int V;
    private int[][] graph;

    public Djaska(int vertices) {
        V = vertices;
        graph = new int[V][V];
    }

    private int minimumDistance(int[] distances, boolean[] visited) {
        int minDistance = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!visited[v] && distances[v] <= minDistance) {
                minDistance = distances[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    private void printPath(int[] distances, int[] parent, int source, int destination) {
        System.out.print("Caminho mínimo entre " + source + " e " + destination + ": ");
        int crawl = destination;
        System.out.print(crawl);

        while (parent[crawl] != -1) {
            System.out.print(" <- " + parent[crawl]);
            crawl = parent[crawl];
        }

        System.out.println("\nCusto total: " + distances[destination]);
    }

    public void dijkstra(int source, int destination) {
        int[] distances = new int[V];
        boolean[] visited = new boolean[V];
        int[] parent = new int[V];

        for (int i = 0; i < V; i++) {
            distances[i] = Integer.MAX_VALUE;
            visited[i] = false;
            parent[i] = -1;
        }

        distances[source] = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = minimumDistance(distances, visited);
            visited[u] = true;

            for (int v = 0; v < V; v++) {
                if (!visited[v] && graph[u][v] != 0 && distances[u] != Integer.MAX_VALUE && distances[u] + graph[u][v] < distances[v]) {
                    distances[v] = distances[u] + graph[u][v];
                    parent[v] = u;
                }
            }
        }

        printPath(distances, parent, source, destination);
    }

    // Programa principal para testar o algoritmo
    public static void main(String[] args) {
        int vertices = 5;
        int[][] graph = {{0, 3, 2, 0, 0}, {3, 0, 1, 5, 0}, {2, 1, 0, 3, 6}, {0, 5, 3, 0, 4}, {0, 0, 6, 4, 0}};
        int source = 0;
        int destination = 4;

        Djaska dijkstra = new Djaska(vertices);
        dijkstra.graph = graph;

        dijkstra.dijkstra(source, destination);
    }
}

// Fonte: Chat GPT