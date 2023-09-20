package com.intelliacademy.recursion.lesson.cp1;

public class AddingNumbers {
    static class IterationAddingNumbers{
        public int sum(int n){
            var sum  = 0;
            for (var i = 0;i <= n ; i++)
                sum+=n;
            return sum;
        }
    }

    static class RecursionAddingNumbers{
        public int sum(int n){
            if (n == 0) return 0;
            return n + sum(n - 1);
        }

        public long factorial(long n,long acc){
            if (n == 1) return acc;
            return factorial(n-1, n * acc);
        }
    }

    public static void main(String[] args) {
        RecursionAddingNumbers recursionAddingNumbers = new RecursionAddingNumbers();
        var result = recursionAddingNumbers.factorial(10,1);
        System.out.println(result);
    }
}
