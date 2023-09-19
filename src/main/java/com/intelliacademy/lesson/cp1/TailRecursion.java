package com.intelliacademy.lesson.cp1;

public class TailRecursion {
    /**
     *  If the recursion function call occurs at the end of the function then
     *  it is called tail recursion
     */
    public static void main(String[] args) {
        execute(10);
    }

    /**
     * Son əməliyyatın nəticəsinə ehtiyac yoxdur.
     */
    public static void execute(int n){
        if (n == 0) return;
        System.out.println("Something to it " + n);
        execute(n - 1);
    }


}
