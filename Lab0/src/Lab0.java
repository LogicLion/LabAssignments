import java.util.Scanner;
/*
 * Author: Thomas Hocking 
 * Lab #0
 * CS 251-805
 */

public class Lab0 {
	
	public static void main(String[] args){
		
		int userDeclaredArraySize = 0;
		int result = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the array calculator!");

		do{
			System.out.print("Enter in a size of your input array, (-1 to quit): ");
			userDeclaredArraySize = input.nextInt();
			if(userDeclaredArraySize > 0)
			{
				int[] valueArray = new int[userDeclaredArraySize];
				System.out.print("Please enter in " + userDeclaredArraySize + " values: ");
			
				for(int i = 0; i < userDeclaredArraySize; i++){
				valueArray[i] = input.nextInt();
				}
			
				String operation = "";
				System.out.println("Please enter in an operation( * or +): ");
				operation = input.next();
				if(operation.equals("*"))
				{	
					result = 1;
					for(int i = 0; i < userDeclaredArraySize; i++){
						result *= valueArray[i];
					}
				}else{
					for(int i = 0; i < userDeclaredArraySize; i++){
						result += valueArray[i];
					}
				}
				System.out.println("The total is: " + result);
			}
		}while(userDeclaredArraySize > 0);
	}
	
}
