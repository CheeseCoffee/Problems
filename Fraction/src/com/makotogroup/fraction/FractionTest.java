package com.makotogroup.fraction;

public class FractionTest {
	public static void main(String[] args) {
			Fraction first = new Fraction();
			Fraction second = new Fraction();
			first.scanFrac();
			second.scanFrac();
			
			first.add(second).print();
			first.sub(second).print();
			first.mul(second).print();
			first.div(second).print();
			first.Mixed();
			second.Mixed();

			System.out.println(Fractions.convertToFloat(first));
			
			Fraction[] array = Fractions.scanMass();
			Fractions.printMass(array);
			Fractions.arrSort(array);
			Fractions.printMass(array);
	}
}
