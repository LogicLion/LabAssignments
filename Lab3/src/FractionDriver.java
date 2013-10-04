
import java.util.Scanner;
public class FractionDriver {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		Fraction f1, f2;
		f1 = promptAndReadFraction(stdin, 1);
		System.out.println("Should Fraction 2 to refer to " +
				"the same object? (yes/no):");
		String response = stdin.nextLine();
		if (response.equals("yes"))
			f2 = f1;
		else
			f2 = promptAndReadFraction(stdin, 2);
	
		if(f1.equals(f2)){
			System.out.println("Values are the same.");
		}else{
			System.out.println("Not same values");
		}
		
		if(f1 == f2){
			System.out.println("Same objects");
		}else{
			System.out.println("Not same object");
		}
		
		if(f1.realValue() == f2.realValue()){
			System.out.println("Same real value");
		}else{
			System.out.println("Different real value.");
		}

	}
	public static Fraction promptAndReadFraction(Scanner sc, int fractionNum) {
		String prompt = "Enter Fraction " + fractionNum +
				" data (two integers separated by a space): ";
		System.out.println(prompt);	
		Fraction genericFrac = new Fraction(sc.nextInt(), sc.nextInt());
		sc.nextLine();
		return genericFrac;
	}
}