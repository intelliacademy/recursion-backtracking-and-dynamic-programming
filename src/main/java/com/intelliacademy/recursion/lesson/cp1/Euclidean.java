package com.intelliacademy.recursion.lesson.cp1;

public class Euclidean {
    public int iterable(int a, int b) {
        int c = 0;
        while (b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public int recursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return recursive(b, a % b);
    }
}

class EuclideanTest {
    public static void main(String[] args) {
        Euclidean e = new Euclidean();
        System.out.println(e.recursive(45, 20));
    }
}

