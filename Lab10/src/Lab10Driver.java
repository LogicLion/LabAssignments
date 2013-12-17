
public class Lab10Driver {
	public static void main(String[] args){
		ReadTextFile fileReader = new ReadTextFile();
		fileReader.readFile();
		WriteTextFile fileWriter = new WriteTextFile(fileReader.getListOfValues());
		fileWriter.writeFile();
		System.out.println("Bye!");
	}
}
