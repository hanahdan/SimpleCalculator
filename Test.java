package simplecalculator;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter first number");
		double number1=input.nextDouble();
		System.out.println("Enter second Number");
		double number2=input.nextDouble();
		Calculator obj=new Calculator(number1,number2);
		System.out.println("Choose your operations :\n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
		int value=input.nextInt();
		obj.getOperations(value);
	}

}
