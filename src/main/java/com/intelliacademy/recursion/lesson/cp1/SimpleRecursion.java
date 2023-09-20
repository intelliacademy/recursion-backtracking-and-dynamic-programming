package com.intelliacademy.recursion.lesson.cp1;

public class SimpleRecursion {
    public static void main(String[] args) {
        var result = sum(100);
        System.out.println(result);
    }

    public static int sum(int n){
        if(n == 0) return 0;
        else return n + sum(n - 1);
    }
}
