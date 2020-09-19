package hw3;

import java.util.Random;
import java.util.Scanner;

public class Three_functions {
	
	
	public void reverseString() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		StringBuilder reverseString = new StringBuilder(str);
		//String result = reverseString.reverse().toString();
		System.out.println(reverseString.reverse().toString());
		sc.close();
		
	}
	
	public void isPalindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a String to test: ");
		String str = sc.nextLine();
		StringBuilder reverseString = new StringBuilder(str);
		reverseString.reverse();
		String data = reverseString.toString();
		if(str.equals(data)) {
			System.out.println("Your String" + " "+ str + " is a Palindrome");
		}else {
			System.out.println("Your String - " + " "  + str + ":" + " is not a palindrome");
		}
		
		sc.close();
	}
	
	public void randBetween() {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("Please enter your first number: ");
		int int1 = sc1.nextInt();
		
		System.out.print("Please enter your second number :");
		int int2 = sc2.nextInt();
		
		System.out.println("The two numbers you chose are :" + int1 + " and " +  int2);
		
		Random r = new Random();
		
		// double r = (Math.random()*((int2 - int1 )+1))+int1;

		int random_num = int1 + (int)(Math.random() * ((int2 - int1) + 1));
		
		 System.out.println("Your random number is : " + random_num);
		 
	}
	
}
