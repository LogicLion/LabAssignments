
public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int num, int denom){
		this.setNumerator(num);
		this.setDenominator(denom);
	}
	
	public Fraction(){
		this(0, 1);
	}
	
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public boolean equals(Fraction f2){
			return this.getNumerator() == f2.getNumerator() && this.getDenominator() == f2.getDenominator();
	}
	
	public  void setValue(int num, int denom){
		this.setNumerator(num);
		this.setDenominator(denom);
	}
	
	public double realValue(){
		return(this.getNumerator()/this.getDenominator());
	}
	
	public String toString(){
		return this.getNumerator() + "," + this.getDenominator();
		
	}
	}
