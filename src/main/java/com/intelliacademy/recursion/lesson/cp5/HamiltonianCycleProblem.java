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
        if (findFeasibleSolution(1)) {
            showHamiltonianPath();
        } else {
            System.out.println("No feasible solution...");
        }
    }

    private void showHamiltonianPath() {

    }

    private boolean findFeasibleSolution(int i) {
        return false;
    }

}

class HamiltonianCycleProblemTest{
    public static void main(String[] args) {

    }

}
