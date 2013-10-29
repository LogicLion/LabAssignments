
public class Unit {
	private int number;
	private Owner owner;
	
	public Unit(int number, Owner o){
		this.number = number;
		this.owner = o;
	}
	
	public int getNumber(){
		return this.number;
	}
	
	public Owner getOwner(){
		return owner;
	}
	
	public String toString(){
		return this.number + ": " + this.owner;
	}
}
