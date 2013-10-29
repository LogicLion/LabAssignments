import java.util.ArrayList;

import sun.management.counter.Units;


public class Condominium {
	private ArrayList<Unit> listOfUnits;
	
	public Condominium(){
		listOfUnits = new ArrayList<Unit>();
	}
	
	public void addUnit(Unit u){
		listOfUnits.add(u);
	}
	
	public int numUnits(){
		return listOfUnits.size();
	}
	
	public int numOwners(){
		int ownerCounter = 0;
		ArrayList<String> nameOfOwners = new ArrayList<String>();
		for(int i = 0; i < listOfUnits.size(); i++){
			nameOfOwners.add(listOfUnits.get(i).getOwner().getName());
			ownerCounter++;
		}

		for(int i = 1; i < nameOfOwners.size(); i++){
			for(int j = i; j < nameOfOwners.size(); j++){
				if(nameOfOwners.get(i-1).equals(nameOfOwners.get(j))){
					ownerCounter--;
					nameOfOwners.remove(i);
				}
			}
		}

		return ownerCounter;
	}
	
	public String toString(){
		String condoToString = "";
		for(int i = 0; i < numUnits(); i++){
			condoToString += listOfUnits.get(i) + "\n";
		}
		return condoToString;
	}
}
