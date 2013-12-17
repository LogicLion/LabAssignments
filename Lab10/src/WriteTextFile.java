import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class WriteTextFile {
	private Scanner input = new Scanner(System.in);
	private ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();
	
	public WriteTextFile(ArrayList<Integer> values){
		listOfIntegers = values;
	}
	
	public void writeFile(){
		System.out.print("Enter filename to write to: ");
		PrintWriter fileWriter;
		try {
			fileWriter = new PrintWriter(input.nextLine());
			for(int i = listOfIntegers.size() - 1; i >= 0; i--){
				fileWriter.println(listOfIntegers.get(i));
			}
			fileWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
