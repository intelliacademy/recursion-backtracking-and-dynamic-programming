package com.intelliacademy.recursion.lesson.cp4;

public class EvenAndOddProblem {
    public boolean isEven(int number){
        return (number ^ 1) == number + 1;
    }
    public boolean isOdd(int number){
        return (number ^ 1) == number - 1;
    }
}
class EvenAndOddTest{
    public static void main(String[] args) {
        EvenAndOddProblem evenAndOddProblem = new EvenAndOddProblem();
        System.out.println(evenAndOddProblem.isEven(51));
        System.out.println(evenAndOddProblem.isOdd(51));
    }

}
