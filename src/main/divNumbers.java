package main;

public class divNumbers implements chainPattern {
	private chainPattern nextInChain;

	@Override
	public void setNextChain(chainPattern nextChain) {
		this.nextInChain=nextChain;
		
	}
	
	@Override
	public void calculate(NumberClass requests) {
		if(requests.getCalculationWanted()=="div") {
			System.out.println(requests.getNumber1() + " / " + requests.getNumber2()+" = " + (requests.getNumber1()/requests.getNumber2()));
		}
		else nextInChain.calculate(requests);
	}
}
