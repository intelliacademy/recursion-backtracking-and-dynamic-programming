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
        if (this.chessTable.setQueen(0)) {
            printTable();
        } else {
            System.out.println("No solution found...");
        }
    }
}

class ChessTable{
    private char[] columns = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    private int[] rows = {1, 2, 3, 4, 5, 6, 7, 8};
    private char[][] table;
    private int size;

    private int queens;

    public static ChessTable of(int size){
        var table =  new ChessTable(size);
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
        this.table = new char[size + 1][size + 1];
        this.queens = size;
    }

    public void printTable(){
        for(int i = 0; i <= this.size; i++){
            for(int j = 0; j <= this.size; j++){
                if (i == 0 && j == 0)
                    System.out.print("  ");
                else if (i == 0)
                    System.out.print(this.columns[j - 1] + " ");
                else if (j == 0)
                    System.out.print(this.rows[i - 1] + " ");
                else
                    System.out.print(this.table[i - 1][j - 1] + " ");
            }
            System.out.println();
        }
    }

    public boolean setQueen(int column){
        if(column == this.size) return true;
        for(int row = 0; row < this.queens; row++){
            if(isSafe(row, column)){
                this.placeQueen(row, column);
                if(this.setQueen(column + 1)) return true;
                else this.removeQueen(row, column);
            }
        }
        return false;
    }

    public void placeQueen(int row, int column){
        System.out.println("Placing queen at: " + this.columns[column] + (row + 1));
        this.table[row][column] = '■';
    }

    public void removeQueen(int row, int column){
        System.out.println("Removing queen from: " + this.columns[column] + (row + 1));
        this.table[row][column] = '□';
    }


    public boolean isSafe(int row, int column){
        if (column == queens) return true;
        else if (isSafeSameRow(row, column)) return false;
        else if (isSafeDiagonalLeftToRight(row, column)) return false;
        else if (isSafeDiagonalRightToLeft(row, column)) return false;
        else return true;
    }

    private boolean isSafeDiagonalRightToLeft(int row, int column) {
        for (int i = row, j = column; i < this.size && j >= 0; i++, j--) {
            if (this.table[i][j] == '■') {
                return false;
            }
        }
        return false;
    }
    private boolean isSafeDiagonalLeftToRight(int row, int column) {
        for (int i = row, j = column; i >= 0 && j >= 0; i--, j--) {
            if (this.table[i][j] == '■') {
                return true;
            }
        }
        return false;
    }

    private boolean isSafeSameRow(int row, int column) {
        for (int i = 0; i < column; i++) {
            if (this.table[row][i] == '■') {
                return true;
            }
        }
        return false;
    }


}

class NQueensProblemTest{
    public static void main(String[] args) {
        NQueensProblem nQueensProblem = NQueensProblem.of(8);
        nQueensProblem.solve();
    }
}