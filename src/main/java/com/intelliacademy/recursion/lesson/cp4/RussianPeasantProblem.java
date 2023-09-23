package com.intelliacademy.recursion.lesson.cp4;

public class RussianPeasantProblem {
    private final EvenAndOddProblem evenAndOddProblem = new EvenAndOddProblem();

    /**
     * This method multiplies two numbers using Russian Peasant Algorithm
     * <br>
     * a * b = 2*a * b/2 if b is even
     * <br>
     * a * b = 2*a * b/2 + a if b is odd
     */
    public int multiply(int a, int b){
        if(a == 0 || b == 0) return 0;
        else if(this.evenAndOddProblem.isEven(b))
            return multiply(2*a, b/2);
        else
            return a + multiply(2*a, b/2);
    }
}
class RussianPeasantTest{
    public static void main(String[] args) {
        RussianPeasantProblem russianPeasant = new RussianPeasantProblem();
        System.out.println(russianPeasant.multiply(50, 50));
    }

}