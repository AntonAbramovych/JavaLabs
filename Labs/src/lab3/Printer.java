package com.vtvpmc.aabramovich;

public class Printer {
	public static void askFirstNumberEqualsAnswer(double answer) {
		System.out.println("Continue as though first number is "
				+ Printer.printDouble(answer) + "? 1 = yes; 2 = no.");
		System.out.print("> ");
	}
	
	public static double enterFirstNumber(Reader scanner) {
		System.out.print("Enter first number: ");
		return scanner.nextDouble();
	}
	
	public static void printBeforeSecondNumber(double firstNumber,
			int arithmeticOperator) {
		System.out.println("-----------------------------------"
				+ "----------------------------");
		switch (arithmeticOperator) {
		case 1:
			System.out.print(printDouble(firstNumber) + " + ");
			break;
		case 2:
			System.out.print(printDouble(firstNumber) + " - ");
			break;
		case 3:
			System.out.print(printDouble(firstNumber) + " X ");
			break;
		case 4:
		/*falls through*/
		case 12:
			System.out.print(printDouble(firstNumber) + " : ");
			break;
		case 7:
			System.out.print(printDouble(firstNumber) + " to the power of ");
			break;
		}
	}
	
	public static double printAnswer(double firstNumber, double secondNumber,
			int arithmeticOperator) {
		double answer = 0;
		
			switch (arithmeticOperator) {
			case 1:
				answer = firstNumber + secondNumber;
				System.out.println(printDouble(secondNumber) + " = "
						+ printDouble(answer));
				break;
			case 2:
				answer = firstNumber - secondNumber;
				System.out.println(printDouble(secondNumber) + " = "
						+ printDouble(answer));
				break;
			case 3:
			/*falls through*/
			case 6:
				answer = firstNumber * secondNumber;
				System.out.println(printDouble(secondNumber) + " = "
						+ printDouble(answer));
				break;	
			case 4:
				answer = firstNumber / secondNumber;
				System.out.println(printDouble(secondNumber) + " = "
						+ printDouble(answer));
				break;
			case 5:
				answer = Math.sqrt(firstNumber);
				System.out.println("square root of " + printDouble(firstNumber)
						+ " = " + printDouble(answer));
				break;
			case 7:
				answer = Math.pow(firstNumber, secondNumber);
				System.out.println(printDouble(secondNumber) + " = " + printDouble(answer));
				break;
			case 8:
				answer = Math.toRadians(Math.sin(firstNumber));
				System.out.println("sin of " + printDouble(firstNumber)
					+ " = " + printDouble(answer));
				break;
			case 9:
				answer = Math.toRadians(Math.cos(firstNumber));
				System.out.println("cos of " + printDouble(firstNumber) + " = "
						+ printDouble(answer));
				break;
			case 10:
				answer = Math.tan(Math.toRadians(firstNumber));
				System.out.println("tg of " + printDouble(firstNumber) + " = "
						+ printDouble(answer));
				break;
			case 11:
				answer = Math.tan(1 / Math.toRadians(firstNumber));
				System.out.println("ctg of " + printDouble(firstNumber) + " = "
						+ printDouble(answer));
				break;
			default:
				answer = (int)firstNumber % (int)secondNumber;
				System.out.println(printDouble(secondNumber) + " = "
						+ printDouble((int)firstNumber / (int)secondNumber) 
						+ " (remainder = " + printDouble(answer) + ")");	
			}
			System.out.println("------------------------------"
					+ "--------------------------------");
			return answer;
	}
	
	public static void printMenu(double firstNumber) {
		System.out.println("What action?");
		System.out.println("----------------------------------------"
				+ "-----------------------");
		System.out.println("1 = sum;");
		System.out.println("2 = subtract;");
		System.out.println("3 = multiply;");
		System.out.println("4 = divide;");
		System.out.println("\n5 = root;");
		System.out.println("6 = " + printDouble(firstNumber) + " X "
				+ printDouble(firstNumber) + ";");
		System.out.println("7 = power(any degree);");
		System.out.println("\n8 = sin;");
		System.out.println("9 = cos;");
		System.out.println("10 = tg;");
		System.out.println("11 = ctg;");
		if (firstNumber ==(int)firstNumber) {
			System.out.println("\n12 = divide and show remainder: ");
		}
		System.out.print("> ");
	}
	
	public static String printDouble(double number) {
		if (number == (int)number) {
			return String.valueOf((int)number);
		} else if (String.valueOf(number).equals("infinity")) {
			return "-\ncan not divide by zero.";
		} else {
			return String.format("%.4f", number);
		}
	}
}
