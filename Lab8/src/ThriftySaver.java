
public class ThriftySaver extends SavingsAccount {

	
	private boolean hasWithdrawn;
	
	public ThriftySaver(String name, double initial) {
		super(name, initial);
	}
	
	@Override
	public boolean withdraw(double amount){
		if(balance > amount && (!hasWithdrawn)){
			balance -= amount;
			hasWithdrawn = true;
			return true;
		}
		hasWithdrawn = false;
		return false;	
	}

	@Override
	public void update() {
		balance *= 1.03;
		int bal = (int)(balance * 100);
		balance = bal/100.0;  // floor to a penny
		hasWithdrawn = false;
	}
}
