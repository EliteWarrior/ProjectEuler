package net.projecteuler;

import java.util.Scanner;

public class Euler1 {

	   public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            System.out.println(- calculateSum(15,n) +calculateSum(3,n)+ calculateSum(5,n) );
	        }
	    }
	    
	    public static long calculateSum(int val, int limit){
	        int count = (limit -1)/val;
	        return 1l* val * count* (count + 1) /2;
	    }
}
