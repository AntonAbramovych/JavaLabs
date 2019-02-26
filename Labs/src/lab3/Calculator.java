package com.vtvpmc.aabramovich;

public class Calculator {
	public static void main(String[] args) {
		Reader scanner = new Reader();
		double firstNumber;
		double secondNumber;
		double answer = 0;
		int arithmeticOperator;
		boolean firstNumberNeeded = true;
		int temporary;
		
		while (true) {
			if (firstNumberNeeded) {
				firstNumber = Printer.enterFirstNumber(scanner);
			} else {
				firstNumber = answer;
			}
			
			Printer.printMenu(firstNumber);
			
			arithmeticOperator = scanner.nextInt();
			
			Printer.printBeforeSecondNumber(firstNumber, arithmeticOperator);
			
			secondNumber =
					enterAndReturnSecondNumber(firstNumber, arithmeticOperator, scanner);
			
			Printer.printBeforeSecondNumber(firstNumber, arithmeticOperator);
			answer = Printer.printAnswer(firstNumber, secondNumber, arithmeticOperator);
			
			Printer.askFirstNumberEqualsAnswer(answer);
			temporary = scanner.nextInt();
			if (temporary == 1) {
				firstNumberNeeded = false;
			} else {
				firstNumberNeeded = true;
			}
		}
		
	}
	
	private static double enterAndReturnSecondNumber(double firstNumber, int arithmeticOperator,
			Reader scanner) {
		double secondNumber;
		if ((arithmeticOperator >= 1 && arithmeticOperator <= 4)
				|| arithmeticOperator == 7 || arithmeticOperator == 12) {
			secondNumber = scanner.nextDouble();
		} else {
			secondNumber = firstNumber;
		}
		return secondNumber;
	}
	
}
