package Mywork;

import java.io.*;

public class Calculator {
	public static void main(String[] args) throws Exception {
		float x,y;
		String op;
		BufferedReader object = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Enter number for operation");
		try {
			x = Float.parseFloat(object.readLine());
			System.out.println("Enter operation:(Available operations:+ - * / sin sqrt");
			op = object.readLine();
			switch (op) {
			case "+":
				System.out.println("Enter second number");
				y = Float.parseFloat(object.readLine());
				System.out.println("Result:" + (x + y));
				break;
			case "-":
				System.out.println("Enter second number");
				y = Float.parseFloat(object.readLine());
				System.out.println("Result:" + (x - y));
				break;
			case "*":
				System.out.println("Enter second number");
				y = Float.parseFloat(object.readLine());
				System.out.println("Result:" + (x * y));
				break;
			case "/":
				System.out.println("Enter second number");
				y = Float.parseFloat(object.readLine());
				if(y==0){
					System.out.println("Invalid operation.");
					System.exit(0);
				}
				System.out.println("Result:" + (x / y));
				break;
			case "sin":
				System.out.println("Result:" + Math.sin(x));
				break;
			case "sqrt":
				System.out.println("Result:" + Math.sqrt(x));
				break;
			 default:
				  System.out.println("Invalid entry.");
			}
		} catch (NumberFormatException ne) {
			System.out.println(ne.getMessage() + " is not a numeric value.");
			System.exit(0);
		}
	}

}
