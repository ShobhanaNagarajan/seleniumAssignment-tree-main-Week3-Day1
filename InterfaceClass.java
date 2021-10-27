package week3.day1;

public class InterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcBusinessTax obj = new CalcBusinessTax();
		obj.calcDeductions("Unit1", 24567, 485769.89);
		obj.calcGrossIncome("Unit1", 347599.76, 4756.89);
		obj.calcBusinessSpecCalculations();
	}

}
