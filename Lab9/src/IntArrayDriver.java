import java.util.InputMismatchException;



public class IntArrayDriver {

  public static void main(String[] args) {

    IntArray a = new IntArray();

    java.util.Scanner scanner = new java.util.Scanner(System.in);

    System.out.println("Enter positive integers terminate by -1:");
    int n = 0;
    try{
    	n = scanner.nextInt();
    }catch(InputMismatchException e){
    	System.out.println("Error: Not a number!");
    }
    
    while (n > -1) {
    	try{
    		a.add(n);
    	}catch(IndexOutOfBoundsException e){
    		System.out.println("Error! To many values! Max Size: 10.");
    	}
    	try{
    		n = scanner.nextInt();
    	}catch(InputMismatchException e){
    		System.out.println("Not a number!");
    		scanner.nextLine();
    		n = scanner.nextInt();
    	}
    }

    System.out.println("You have entered " + a);
    char cont = 'n';
    System.out.print("Change a number? (y/n) ");
    cont = scanner.next().charAt(0);

    if (cont == 'y' || cont == 'Y') {
      do {
        System.out.println("Enter index of number to change:");
        int index = 0;
        
        try{
        	index = scanner.nextInt();
        }catch (InputMismatchException e){
        	System.out.println("Invalid input! Please try again.");
        	scanner.nextLine();
        	index = scanner.nextInt();
        }
    	System.out.println("What with what value?:");
    	try{
        a.replace(index, scanner.nextInt());
    	}catch(InputMismatchException e){
    		System.out.println("Not a number!");
    		scanner.nextLine();
    	}
        System.out.println(a);
        System.out.print("Change another ? (y/n) ");
        cont = scanner.next().charAt(0);
      } while (cont != 'n');

    }

    System.out.println("Divide numbers in array by : ");
    n = scanner.nextInt();
    a.divideAll(n);
    System.out.println(a);
  }
  }