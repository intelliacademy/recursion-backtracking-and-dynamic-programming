package com.intelliacademy.recursion.lesson.cp4;

public class RussianPeasant {
    private final EvenAndOdd evenAndOdd = new EvenAndOdd();
    public int multiply(int a, int b){
        if(a == 0)
            return 0;
        else if(this.evenAndOdd.isEven(a))
            return multiply(a/2, b*2);
        else
            return b + multiply(a/2, b*2);
    }
}
class RussianPeasantTest{
    public static void main(String[] args) {
        RussianPeasant russianPeasant = new RussianPeasant();
        System.out.println(russianPeasant.multiply(50, 50));
    }

}