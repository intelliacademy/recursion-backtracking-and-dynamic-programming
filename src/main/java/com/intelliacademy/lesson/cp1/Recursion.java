package com.intelliacademy.lesson.cp1;

public class Recursion {
    public void func1(){
        System.out.println("func1() executed");
        this.func2();
    }

    public void func2(){
        System.out.println("func2() executed");
        this.func3();
    }

    public void func3(){
        System.out.println("func3() executed");
        this.func4();
    }

    public void func4(){
        System.out.println("func4() executed");
    }
}

class Main {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        recursion.func1();
    }
}