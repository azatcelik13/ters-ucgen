package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inp =new Scanner(System.in);
        int n ;
        System.out.print("kaç basamaklı sayı gireceksiniz=");
        n= inp.nextInt();
        for(int i=0;i<n;i++){

            for(int j=0;j<=i;j++){
                System.out.print(" ");

            } for(int k=2*n-1;k>=(2*i+1);k--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
