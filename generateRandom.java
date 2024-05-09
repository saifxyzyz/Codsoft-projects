// Java program to demonstrate working of 
// Math.random() to generate random numbers
import java.util.*;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class generateRandom
{
	public static void main(String args[])
	{
		Random rand = new Random();
		int n1 = rand.nextInt(100);
		System.out.println("Random number is "+n1);
		while(true){
			Scanner num = new Scanner(System.in);
			int uNum;
			System.out.print("Enter your guess:");
			uNum = num.nextInt();
			if(uNum == n1){
				System.out.print("Correct!!!");
				break;

			} else if(uNum > n1){
				System.out.print("Too high");
				
			} else if(uNum < n1){
				System.out.println("Too low");
				

			} else{
				System.out.println("Invalid input");
			}
		}


	}
}
