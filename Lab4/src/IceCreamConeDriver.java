import java.util.Scanner;


public class IceCreamConeDriver {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in); 
		String prompt = "Enter flavor or blank line to quit: "; 
		String flavorRequest; 

		System.out.print(prompt); 
		flavorRequest = input.nextLine(); 
		
		while ( ! flavorRequest.isEmpty()) { 
			// prompt the user for the number of scoops and read it in 
			System.out.print("How many scoops?: ");
			int numOfScoops = input.nextInt();
			input.nextLine();
			
			// instantiate a new IceCreamCone 
			IceCreamCone iceCreamCone = new IceCreamCone(flavorRequest, numOfScoops);
			
			while(iceCreamCone.getScoops() >= 1){
				System.out.print(iceCreamCone +",");
				iceCreamCone.eat();
			}
			
			System.out.println(iceCreamCone);
			
			System.out.println(prompt); 
			flavorRequest = input.nextLine(); 
		} 

		// Have the IceCreamCone class print its statistics here 
		IceCreamCone.printStatistics();
	} 

}
