package com.intelliacademy.recursion.lesson.cp2;

public class BinarySearch {

    public void find(int[] arr,int item,int start,int end){
        int mid = (start+end)/2;
        if(arr[mid]==item){
            System.out.println("Item found at index "+mid);
        }
        else if(arr[mid]>item){
            find(arr,item,start,mid-1);
        }
        else{
            find(arr,item,mid+1,end);
        }
    }

}

class BinarySearchTest {
    public static void main(String[] args) {

    }
}
