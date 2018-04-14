package Aufgaben;

import java.util.Scanner;

public class Aufgabe2_1 
{

	public static void main(String[ ] args) 
	
	{
		System.out.print("Bitte geben Sie ihren Nachnamen ein:");
		String name = new Scanner(System.in).nextLine();
		
		System.out.print("Guten Tag, Herr/Frau " + name + "!");
	}

}
