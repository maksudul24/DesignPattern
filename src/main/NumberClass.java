package main;

public class NumberClass {
	private int number1,number2;
	private String CalculationWanted;
	public NumberClass(int number1, int number2, String calculationWanted) {
		//super();
		this.number1 = number1;
		this.number2 = number2;
		this.CalculationWanted = calculationWanted;
	}
	public int getNumber1() {
		return number1;
	}
	public int getNumber2() {
		return number2;
	}
	public String getCalculationWanted() {
		return CalculationWanted;
	}

}
