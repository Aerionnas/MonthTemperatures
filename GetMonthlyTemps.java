package Empty;

import java.util.Scanner;

public class GetMonthlyTemps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String [] month = {"January" , "February" , "March", "April", "May" , "June", "July", "August", "September", "October", "November", "December"
		};
		
		double [] temperature = new double[12];
		
		for(int i = 0; i < month.length; i++) {
			
			System.out.println("What was the monthly temperature for the month of " + month[i] + "?");
			temperature[i] = scanner.nextDouble();
			
		}
		
		System.out.println("Please enter the words, month or year, to view the average temperature during that time.");
		String response = scanner.next();
		
		if (response.equalsIgnoreCase("month")) {
			
			System.out.print("Which month would you like to view?");
			String monthInputted = scanner.next();
			
		
			for(int i = 0; i < month.length; i++){
				
				if(month[i].equals(monthInputted))
				
				System.out.println("The average temperature for the month of " + month[i] + " is " + temperature[i]+ ".");
				
			}
		}
		
		else if(response.equalsIgnoreCase("year")){
			
		
			double total = 0;
			double highestTemp = temperature[0];
			double lowestTemp = temperature[0];
			
			for(int i = 0; i < month.length; i++) {
				
				System.out.println("The average temperature for the month of " + month[i] + " is " + temperature[i]+ ".");
				
				if(temperature[i] > highestTemp) {
					highestTemp = temperature[i];
				}
				
				if(temperature[i] < lowestTemp) {
					lowestTemp = temperature[i];
				}
				
				total += temperature[i];
				
			}
			
			System.out.println("The highest temperature for the year was " + highestTemp + ".");
			
			System.out.println("The lowest temperature for the year was " + lowestTemp + ".");
			
			System.out.println("The average temperature for the year was " + total/12 + ".");
			
		}
		
		else {
			System.out.println("You have entered an invalid input. Try again nest time.");
		}

	}
	
}
