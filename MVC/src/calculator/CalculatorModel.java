package calculator;

public class CalculatorModel {
	
	private int calcValue;
	
	public void addTwoNumbers(int fn,int sn)
	{
	calcValue=fn+sn;
	}

	public int getCalculationValue()
	{
	return calcValue;
	}
}
