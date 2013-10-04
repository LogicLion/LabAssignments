import java.util.Scanner;


public class Lab1 {
	public static void main(String[] args){
		System.out.println("Name Rearranging Program.");
		System.out.println("Please enter in a name with format:");
		
		Scanner input = new Scanner(System.in);
		String userEnteredName = input.nextLine();
			
		int startingPosOfColon = userEnteredName.indexOf(':');
		String nameAfterColon = userEnteredName.substring(startingPosOfColon+1, userEnteredName.length());
		int indexOfComma = nameAfterColon.indexOf(',');
		String firstName = nameAfterColon.substring(0, indexOfComma);
		String middleName = nameAfterColon.substring(indexOfComma+1, nameAfterColon.length());
		String lastName = userEnteredName.substring(0, startingPosOfColon);
		
		System.out.println("The name is:" + firstName + " " + middleName + " " + lastName);
	}
}
