package com.intelliacademy.lesson.cp1;

public class HeadRecursion {
    /**
     *  If the recursion function call occurs at the beginning of the function then
     *  it is called tail recursion
     */
    public static void main(String[] args) {
        execute(10);
    }

    /**
     * Son əməliyyatın nəticəsinə ehtiyac vardır.
     * Daha cox resursa ehtiyaci vardir cunki state saxlayir
     */
    public static void execute(int n){
        if (n == 0) return;
        execute(n - 1);
        System.out.println("Something to it " + n);
    }
}
