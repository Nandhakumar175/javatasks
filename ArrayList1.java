package com.Ebrain;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the start number: ");
        int start = input.nextInt();

        System.out.print("Enter the end number: ");
        int end = input.nextInt();

        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = start; i <= end; i++) {
            numbers.add(i);
        }

        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of all numbers: " + sum);

        
        int multiplesSum = 1;
        for (int num : numbers) 
             {
                multiplesSum *= num;
            }
        
        System.out.println("multiples of all numbers: " + ~multiplesSum);

        
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        ArrayList<Integer> addNumbers = new ArrayList<Integer>();
        for(int num : numbers) {
        	if (num % 2 != 0) {
        		addNumbers.add(num);
        	}
        }
        
        int evenSum = 0;
        for (int num : evenNumbers) {
            evenSum += num;
        }
        System.out.println("Sum of even numbers: " + evenSum);

        
        int oddSum = 0;
        int oddMultiples = 1;
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddSum += num;
                oddMultiples *= num;
            }
        }
        System.out.println("Separate list of addNumbers and evennumber  : "+ "evenNumbers:" + evenNumbers + "  addNumbers:" +  addNumbers );
        System.out.println("Sum and Multiples of all odd numbers: " + oddSum + "  and  " + oddMultiples);
        

      
        int evenMultiples = 1;
        for (int num : evenNumbers) {
            evenMultiples *= num;
        }
        System.out.println("Sum and Multiples of all even numbers: "+ evenSum +" and  " + evenMultiples);
    }
}