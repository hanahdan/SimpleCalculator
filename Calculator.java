package simplecalculator;

public class Calculator implements OperationsCalc {
	double number1;
	double number2;
	public Calculator(double number1,double number2) {
		
		 this.number1=number1;
		 this.number2=number2;
	}

	public void getOperations(int value) {
		
		double result=0;
		switch(value)
		{
		case 1:
			System.out.println("Addition:" +(number1+number2));
			break;
			
			
		case 2:
			System.out.println("Subtraction:" +(number1-number2));
			break;
		case 3:
			System.out.println("Multiplication:" +(number1*number2));
			break;
		case 4:
			System.out.println("Division:" +(number1/number2));
			break;
		default:
			System.out.println("choose the correct operations");
			
		}
		System.out.println(result);
	
		
		
	}

	public void getOperations() {
		// TODO Auto-generated method stub
		
	}
}
