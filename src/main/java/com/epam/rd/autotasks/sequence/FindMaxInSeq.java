package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        // Put your code here
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int max=Integer.MIN_VALUE;
        while (x!=0){
            max=Math.max(max,x);
            x=sc.nextInt();
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code


        System.out.println(max());
    }
}
