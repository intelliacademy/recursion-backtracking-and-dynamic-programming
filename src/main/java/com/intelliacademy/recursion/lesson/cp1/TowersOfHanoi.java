package com.intelliacademy.recursion.lesson.cp1;

public class TowersOfHanoi {
    /**
     * n is the number of disks and source, destination and auxiliary are the names of the rods.
     * @param n number of disks . n = 1 is the base case and smallest disk.
     */
    public void solve(int n,char source,char destination,char auxiliary){
        if(n==1){
            System.out.println("Move disk 1 from "+source+" to "+destination);
            return;
        }
        solve(n-1,source,auxiliary,destination);
        System.out.println("Move disk "+n+" from "+source+" to "+destination);
        solve(n-1,auxiliary,destination,source);
    }
}

class TowersOfHanoiMain{
    public static void main(String[] args) {
        TowersOfHanoi towersOfHanoi=new TowersOfHanoi();
        towersOfHanoi.solve(10,'A','C','B');
    }
}

