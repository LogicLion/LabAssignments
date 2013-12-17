import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class ReadTextFile {
	
	private Scanner input = new Scanner(System.in);
	ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
	
	public  void readFile(){
		System.out.print("Please enter file name: ");
		try {
			Scanner fileReader = new Scanner(new FileReader(input.nextLine()));
			while(fileReader.hasNextLine()){
				listOfNumbers.add(Integer.parseInt((fileReader.nextLine())));
			}
			int sum = 0;
			for(int i = 0; i < listOfNumbers.size(); i++){
				sum += listOfNumbers.get(i).intValue();
			}
			System.out.println("Sum of Integers = " + sum);
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public ArrayList<Integer> getListOfValues(){
		return this.listOfNumbers;
	}
}
