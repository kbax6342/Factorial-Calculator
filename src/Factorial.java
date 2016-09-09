import java.util.Scanner;


public class Factorial {
	
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n;
		int result;
		String cont;
		
		// Welcome the User to the Factorial Calculator
		
		System.out.println("Welcome to the Factorial Calculator");
	
		
	
	do{
		
		//Get user in input between 0 and 10
		
		System.out.println("Enter and integer that's greater that 0 but less than 10: ");
			n = input.nextInt();
			
			//result = factorial(n);
			
		if(n < 0){
			System.out.println("Please put in a positive number");
		}else{
			System.out.println("The factorial of "+ n + " is " +  factorial(n)  + ".");
		}
			
		
		
		
		//Print the Factorial to the Console (use are for loop)	
		
		
		
		System.out.println("Contintue (yes/no): ");
			cont = input.nextLine();
			cont = input.nextLine();
		
			
	}while(cont.equalsIgnoreCase("yes"));

	}

	public static int factorial(int n){
		
		int option1;
		int option2;
		
 if (n ==1){
			option1 = 1;
			return option1;
		}else{
			option2 = n * factorial(n-1);
			return option2;
		}
		
		
		
		
		
		
	}
}
