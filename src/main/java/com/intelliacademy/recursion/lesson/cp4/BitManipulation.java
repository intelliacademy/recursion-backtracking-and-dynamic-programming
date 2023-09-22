package com.intelliacademy.recursion.lesson.cp4;

public class BitManipulation {
    public int count(int number){
        System.out.println("Binary " + Integer.toBinaryString(number));
        System.out.println("Number " + number);
        int counter = 0;
        while (number != 0){
            counter ++;
            number >>= 1;
        }
        return counter;
    }
}

class BitManipulationTest{
    public static void main(String[] args) {
        BitManipulation bitManipulation = new BitManipulation();
        System.out.println(bitManipulation.count(50));
    }
}
