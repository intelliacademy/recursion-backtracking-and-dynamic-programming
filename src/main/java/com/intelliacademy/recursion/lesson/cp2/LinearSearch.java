package com.intelliacademy.recursion.lesson.cp2;

public class LinearSearch {
    public int iterative(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public int recursive(int[] arr, int target) {
        return recursive(arr, target, 0);
    }

    private int recursive(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return recursive(arr, target, index + 1);
    }
}

class LinearSearchTest{
    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(ls.recursive(arr, 3));
    }
}
