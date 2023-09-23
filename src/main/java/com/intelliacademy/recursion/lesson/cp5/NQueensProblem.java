package com.intelliacademy.recursion.lesson.cp5;

public class NQueensProblem {
    private final ChessTable chessTable;
    private final int queens;

    private NQueensProblem(ChessTable chessTable, int queens) {
        this.chessTable = chessTable;
        this.queens = queens;
    }

    public static NQueensProblem of(int size){
        return new NQueensProblem(ChessTable.of(size), size);
    }

    public void printTable(){
        this.chessTable.printTable();
    }
    public void solve() {

    }
}

class ChessTable{
    private char[] columns = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    private int[] rows = {1, 2, 3, 4, 5, 6, 7, 8};
    private char[][] table;
    private int size;

    public static ChessTable of(int size){
        var table =  new ChessTable(size + 1);
        table.init();
        return table;
    }

    private void init(){
        for(int i = 0; i < this.size; i++){
            for(int j = 0; j < this.size; j++){
                this.table[i][j] = '□';
            }
        }
    }

    private ChessTable(int size){
        this.size = size;
        this.table = new char[size][size];
    }

    public void printTable(){
        for(int i = 0; i < this.size; i++){
            for(int j = 0; j < this.size; j++){
                if (i == 0 && j == 0)
                    System.out.print("  ");
                else if (i == 0)
                    System.out.print(this.columns[j - 1] + " ");
                else if (j == 0)
                    System.out.print(this.rows[i - 1] + " ");
                else
                    System.out.print(this.table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void placeQueen(int row, int column){
        this.table[row][column] = '■';
    }

    public void removeQueen(int row, int column){
        this.table[row][column] = '□';
    }

    public boolean isSafe(int row, int column){
        return this.table[row][column] == '□';
    }

    public int getSize(){
        return this.size;
    }

    public char[][] getTable(){
        return this.table;
    }

}

class NQueensProblemTest{
    public static void main(String[] args) {
        NQueensProblem nQueensProblem = NQueensProblem.of(8);
        nQueensProblem.printTable();
    }
}