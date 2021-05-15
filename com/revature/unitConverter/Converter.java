package com.revature.unitConverter;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Converter {
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public static void main(String[] args) {

		mainSelection();
		
	}
	
	public static void mainSelection(){
		int menuSelection = 1;
		Scanner s = new Scanner(System.in);
			while(menuSelection != 3) {
			
				System.out.println("=============================================================================== ");
				System.out.println("                             Conversion Table                                   ");
				System.out.println("=============================================================================== ");
				System.out.println("");
				System.out.println("");
				System.out.println("1. volume conversion ");
				System.out.println("");
				System.out.println("2. distance conversion ");
				System.out.println("");
				System.out.println("3. quit");
				System.out.println("");
				System.out.println("Please select an option: ");
				
				try {
					menuSelection = s.nextInt();
					
					switch(menuSelection) {
					case 1: vMenu();break;
					case 2:dMenu();break;
					case 3: System.out.println("program existing...");break;
					default: break;
					}
					
				}catch(Exception e) {
					System.out.println("please enter a number");
					System.out.println("Press any key to continue");
					s.nextLine();
					s.nextLine();
				}
				
		}
			s.close();
	}
	
	public static void vMenu() {
		int menuSelection = 1;
		Scanner s = new Scanner(System.in);
		while(menuSelection != 3) {
		
			System.out.println("=============================================================================== ");
			System.out.println("                             Volume Conversion Table                            ");
			System.out.println("=============================================================================== ");
			System.out.println("");
			System.out.println("");
			System.out.println("1. Teaspoons to Tablespoons ");
			System.out.println("");
			System.out.println("2. Teaspoons to Cups ");
			System.out.println("");
			System.out.println("3. back to main menu");
			System.out.println("");
			
			System.out.println("Please select an option: ");
			
			try {
				menuSelection = s.nextInt();
				
				switch(menuSelection) {
				case 1: teaToTable();break;
				case 2: teaToCup();break;
				case 3: break;
				default: break;
				}
				
			}catch(Exception e) {
				System.out.println("please enter a number");
				System.out.println("Press any key to continue");
				s.nextLine();
				s.nextLine();
			}
			
		}
	
	}
	
	
	public static void dMenu() {
		int menuSelection = 1;
		Scanner s = new Scanner(System.in);
		while(menuSelection != 3) {
		
			System.out.println("=============================================================================== ");
			System.out.println("                             Distance Conversion Table                            ");
			System.out.println("=============================================================================== ");
			System.out.println("");
			System.out.println("");
			System.out.println("1. Feet to Meters ");
			System.out.println("");
			System.out.println("2. Miles to Kelometers ");
			System.out.println("");
			System.out.println("3. back to main menu");
			System.out.println("");
			
			System.out.println("Please select an option: ");
			
			try {
				menuSelection = s.nextInt();
				
				switch(menuSelection) {
				case 1: feetToMeter();break;
				case 2: mileToKilo();break;
				case 3: break;
				default: break;
				}
				
			}catch(Exception e) {
				System.out.println("please enter a number");
				System.out.println("Press any key to continue");
				s.nextLine();
				s.nextLine();
			}
			
		}
		
		
	}
	
	public static void teaToTable() {
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("please enter teaspoon amount: ");
			try {
				Double tea = s.nextDouble();
				System.out.println(tea + " tsp = "+ df2.format(tea*0.333333333) + " tbsp");
				break;
				
			}catch(Exception e) {
				System.out.println("please enter a number");
				s.nextLine();
			}
			
		}
		
	
		
	}
	
	public static void teaToCup() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("please enter teaspoon amount: ");
			try {
				Double tea = s.nextDouble();
				System.out.println(tea + " tsp = "+ df2.format(tea*0.0208333333) + " cups");
				break;
				
			}catch(Exception e) {
				System.out.println("please enter a number");
				s.nextLine();
			}
		}
		
		
	}
	
	public static void feetToMeter() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("please enter feet: ");
			try {
				Double f = s.nextDouble();
				System.out.println(f + " ft = "+ df2.format(f*0.3048) + " m");
				break;
				
			}catch(Exception e) {
				System.out.println("please enter a number");
				s.nextLine();
			}
		}
		
	
	}
	
	public static void mileToKilo() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("please enter miles: ");
			try {
				Double m = s.nextDouble();
				System.out.println(m + " mi = "+ df2.format(m*1.609344) + " km");
				break;
				
			}catch(Exception e) {
				System.out.println("please enter a number");
				s.nextLine();
			}
		}
		
		
	}
	
}
