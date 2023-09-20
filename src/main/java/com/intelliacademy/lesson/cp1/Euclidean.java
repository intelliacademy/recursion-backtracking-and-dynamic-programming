package com.intelliacademy.lesson.cp1;

public class Euclidean {
    public int gcd(int a, int b) {
        int c = 0;
        while (b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}

class EuclideanTest {
    public static void main(String[] args) {
        Euclidean e = new Euclidean();
        System.out.println(e.gcd(45, 20));
    }
}

