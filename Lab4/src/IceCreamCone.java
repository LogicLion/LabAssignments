
public class IceCreamCone {
	private int scoops;
	private String typeOfIceCream;
	private static int numberOfChocolateScoops = 0;
	private static int numberOfVanillaScoops = 0;
	private static int numberOfOtherScoops = 0;
	
	 public IceCreamCone(String nameOfType, int numOfScoops){
		this.setTypeOfIceCream(nameOfType);
		this.setScoops(numOfScoops);
		if(nameOfType.equalsIgnoreCase("chocolate")){
			numberOfChocolateScoops += numOfScoops;
		}else if(nameOfType.equalsIgnoreCase("vanilla")){
			numberOfVanillaScoops += numOfScoops;
		}else{
			numberOfOtherScoops += numOfScoops;
		}
	}

	public int getScoops() {
		return scoops;
	}

	public void setScoops(int scoops) {
		this.scoops = scoops;
	}

	public String getTypeOfIceCream() {
		return typeOfIceCream;
	}

	public void setTypeOfIceCream(String typeOfIceCream) {
		this.typeOfIceCream = typeOfIceCream;
	}

	public static int getNumberOfChocolateScoops() {
		return numberOfChocolateScoops;
	}

	public static void setNumberOfChocolateScoops(int numberOfChocolateScoops) {
		IceCreamCone.numberOfChocolateScoops += numberOfChocolateScoops;
	}

	public static int getNumberOfVanillaScoops() {
		return numberOfVanillaScoops;
	}

	public static void setNumberOfVanillaScoops(int numberOfVanillaScoops) {
		IceCreamCone.numberOfVanillaScoops += numberOfVanillaScoops;
	}

	public static int getNumberOfOtherScoops() {
		return numberOfOtherScoops;
	}

	public static void setNumberOfOtherScoops(int numberOfOtherScoops) {
		IceCreamCone.numberOfOtherScoops += numberOfOtherScoops;
	}
	
	public String toString(){
		return this.getScoops() + " scoops of " + this.typeOfIceCream;
	}
	
	public void eat(){
		System.out.println(" MMMM " + this.typeOfIceCream);
		this.scoops--;
	}
	
	public static void printStatistics(){
		System.out.println("Number of Chocolate Scoops: " + numberOfChocolateScoops);
		System.out.println("Number of Vanilla Scoops: " + numberOfVanillaScoops);
		System.out.println("Number of Other Scoops: " + numberOfOtherScoops);
	}
}
