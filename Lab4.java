/*-------------------------------------------------------------
// AUTHOR: MORRIS, CHRIS
// FILENAME: Lab4.java
// SPECIFICATION: Arithmetic operations within switch-loops
// FOR: CSE 110- Lab #4
// TIME SPENT: 3hr 39mins
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        // Declare some variables you need
        // -->
    	Scanner input = new Scanner(System.in);
    	int option = 1;
    	
        do {
            // Display the menu
            displayMenu();
            option = input.nextInt();
            // Ask the user for one option
            // -->
            switch (option) {
                // Define four cases for different options. Don't forget "break".
                // -->
            case 1 : 
            	System.out.println("Enter a number: ");
            	int num = input.nextInt();
            	numSum(num); 
            	break;
       
            case 2 : 
            	System.out.println("Enter a number: ");
            	num = input.nextInt();
            	numFactorial(num); 
            	break;
            	
            case 3 : 
            	System.out.println("Enter a number: ");
	            num = input.nextInt(); 
	            numLeftmost(num); 
	            break;
			case 4 : 
				System.out.println("Bye"); 
				break;
			
			default : 
				System.out.println("INVALID RESPONSE");
				break;
            } 
        } while(option != 4);
        

    }
    // adds up numbers from 1 - num (user input)
    //@param num, number to be input and added
    public static int numSum(int num) {
		int passedNum = num;
		int sum = 0;
		
		for(int i = 0; i <= passedNum; i++) {
			sum += i;
		}
		System.out.println("The sum of 1 to " + passedNum + " is " + sum);
		return sum;
	}
	
    //finds factorial of a given number
    //@param num, number that will return factorial !num
	public static long numFactorial(int num) {
		int passedNum = num;
		long factorial = 1;
		
		if(passedNum >=0) {
			for (int i = 1; i <= passedNum; ++i) {
			
				factorial *= i;
			}
		}
		else {
			System.out.println("UNDEFINED. PLEASE ENTER A NUMBER >= 0");
		}
		System.out.println("The factorial of " + passedNum + " is " + factorial);
		return factorial;
		}
	
	//find the leftmost number using index position(0) after converting number to string
	//@param num, number to be converted to string; leftmost digit will be found
	public static char numLeftmost(int num) {
		String passedNum = String.valueOf(num);
		int numLength = passedNum.length();
		char leftMost = 0;
		
		if(numLength >= 1) {
			leftMost = passedNum.charAt(0);
		}
		else 
		{
			System.out.println("Please enter a number: ");
			}
		System.out.println("The leftmost digit " + passedNum + " is " + leftMost);
		return leftMost;
	}
			

		
	
	
    

    /**
     * Print the menu
     */
    private static void displayMenu() {
        System.out.println("Please choose one option from the following menu:");
        System.out.println("1) Calculate the sum of integers from 1 to m");
        System.out.println("2) Calculate the factorial of a given number");
        System.out.println("3) Display the leftmost digit of a given number");
        System.out.println("4) Quit");
    }
}