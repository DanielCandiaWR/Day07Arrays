package com.day07arrays.app;
import java.util.Scanner;
/*
* HackerRank 30 Days of Code
* ========== Day 07 Arrays ===========
* Given an array, A of N integers, prints A's elements in reverse order as a single line of space-separated numbers.
*/
public class Arrays {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Input the size of the array: ");
		int inputNumber = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		int[] array = new int[inputNumber];
		System.out.print("Input your numbers: ");
		String[] arrayItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for(int i = 0; i < inputNumber; i++) {
			int arrayItem = Integer.parseInt(arrayItems[i]);
			array[i] = arrayItem;
		}
		System.out.println("The result is: ");
		for(int i = array.length-1; i >=0; i--) {
			System.out.print(array[i]+" ");
		}
		scanner.close();
		
	}
}
