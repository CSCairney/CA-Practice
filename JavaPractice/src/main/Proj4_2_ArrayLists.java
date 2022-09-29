package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists {

	
		public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			ArrayList<Double> list = new ArrayList<>();
			double entryNumber;
			
			System.out.println("Type a number from 0, type -1 to exit application");
			
			entryNumber = keyboard.nextDouble();
			
			while(entryNumber >=0) {
				list.add(entryNumber);
				System.out.println("Type a number from 0, type -1 to exit application");
				
				entryNumber = keyboard.nextDouble();
			}
			
			for(int i= list.size()-1; i>=0; i--) {
				System.out.println(list.get(i));
			}
			
			
		}

}

