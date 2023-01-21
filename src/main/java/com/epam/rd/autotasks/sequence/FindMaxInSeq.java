package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int max=0;
        while(x!=0){
            max=Math.max(max,x);
            x=sc.nextInt();
        }
        System.out.println(max);
    }
}
