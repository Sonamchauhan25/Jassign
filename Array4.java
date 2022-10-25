package day5;

import java.util.Scanner;

//wap to ask 5 numbers from user and print them 
// perform sum of all the number
public class Array4 {

	public static void main(String[] args) {
		
		int p[]= new int[10];
		int sum=0;
		Scanner s= new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("enter number");
			p[i]= s.nextInt();
		    sum= sum+p[i];
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.print("  "+ p[i]);
		}

		System.out.println("sum of all array elements are ="+ sum);
	}

}
