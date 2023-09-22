package com.intelliacademy.recursion.lesson.cp4;

public class EvenAndOdd {
    public boolean isEven(int number){
        return (number ^ 1) == number + 1;
    }
    public boolean isOdd(int number){
        return (number ^ 1) == number - 1;
    }
}
class EvenAndOddTest{
    public static void main(String[] args) {
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        System.out.println(evenAndOdd.isEven(51));
        System.out.println(evenAndOdd.isOdd(51));
    }

}
