package graphs;

import java.util.*;

public class G1 {

    public static class Graph {
        private Map<Integer, List<Integer>> map = new HashMap<>();

        void createVertex(int s) {
            map.put(s, new LinkedList<>());
        }

        void addEdge(int u, int v, boolean directed) {

            if (!map.containsKey(u))
                createVertex(u);
            if (!map.containsKey(v))
                createVertex(v);

            map.get(u).add(v);

            if (directed == false) {
                map.get(v).add(u);
            }
        }

        void print() {
            for (Integer i : map.keySet()) {
                System.out.print(i + " => ");
                for (Integer j : map.get(i)) {
                    System.out.print(j + ", ");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        Graph gr = new Graph();

        gr.addEdge(0, 1, false);
        gr.addEdge(1, 2, false);
        gr.addEdge(1, 3, false);
        gr.print();
    }
}