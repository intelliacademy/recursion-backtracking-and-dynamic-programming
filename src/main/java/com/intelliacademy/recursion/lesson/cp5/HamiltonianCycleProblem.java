package com.intelliacademy.recursion.lesson.cp5;

public class HamiltonianCycleProblem {
    private int vertices;
    private int[] hamiltonianPath;

    private int[][] adjacencyMatrix;

    public HamiltonianCycleProblem(int[][] adjacencyMatrix) {
        this.vertices = adjacencyMatrix[0].length;
        this.hamiltonianPath = new int[this.vertices];
        this.hamiltonianPath[0] = 0;
        this.adjacencyMatrix = adjacencyMatrix;
    }


    public void solve() {
        hamiltonianPath[0] = 0;
        if (findFeasibleSolution(1)) {
            showHamiltonianPath();
        } else {
            System.out.println("No feasible solution...");
        }
    }

    private void showHamiltonianPath() {
        System.out.println("Hamiltonian cycle exists: ");
        for (int i = 0; i < hamiltonianPath.length; i++) {
            System.out.print(hamiltonianPath[i] + " ");
        }
        System.out.println(hamiltonianPath[0]);
    }

    private boolean findFeasibleSolution(int position) {
        if (position == this.vertices) return adjacencyMatrix[hamiltonianPath[position-1]][hamiltonianPath[0]] == 1;
        for (int vertexIndex = 1; vertexIndex < this.vertices; vertexIndex++) {
            if (isValid(vertexIndex, position)) {
                hamiltonianPath[position] = vertexIndex;
                if (findFeasibleSolution(position + 1)) {
                    return true;
                }
                //backtrack
            }
        }
        return false;
    }

    private boolean isValid(int vertex, int actualPosition) {
        //first criterion: whether two nodes are connected?
        if (adjacencyMatrix[hamiltonianPath[actualPosition - 1]][vertex] == 0) {
            return false;
        }
        //second criterion: whether we have visited it or not?
        for (int i = 0; i < actualPosition; i++) {
            if (hamiltonianPath[i] == vertex) {
                return false;
            }
        }
        return true;
    }



}

class HamiltonianCycleProblemTest{
    private static int[][] matrix = {
            {0,1,0,0,0,1},
            {1,0,1,0,0,0},
            {0,1,0,0,1,0},
            {0,0,0,0,1,1},
            {0,0,1,1,0,1},
            {1,0,0,1,1,0}
    };

    public static void main(String[] args) {
        HamiltonianCycleProblem hamiltonianCycleProblem = new HamiltonianCycleProblem(matrix);
        hamiltonianCycleProblem.solve();
    }

}
