package com.makotogroup.fraction;

import java.util.Scanner;

public class Fraction implements Comparable<Fraction>{
	private int num, den;

	public Fraction(int num, int den) {
		this.num = num;
		this.den = den;
	}

	public Fraction add(Fraction a) {
		Fraction b = new Fraction();
		b.num = this.num * a.den + a.num * this.den;
		b.den = this.den * a.den;
		b.NOD();
		return b;
	}

	public Fraction sub(Fraction a) {
		Fraction b = new Fraction();
		b.num = this.num * a.den - a.num * this.den;
		b.den = this.den * a.den;
		b.NOD();
		return b;
	}

	public Fraction mul(Fraction a) {
		Fraction b = new Fraction();
		b.num = this.num * a.num;
		b.den = this.den * a.den;
		b.NOD();
		return b;
	}

	public Fraction div(Fraction a) {
		Fraction b = new Fraction();
		b.num = this.num * a.den;
		b.den = this.den * a.num;
		b.NOD();
		return b;
	}

	public void Mixed() {
		int integer;
		Fraction resultFraction = new Fraction();
		resultFraction.den = this.den;
		resultFraction.num = this.num;
		integer = resultFraction.num / resultFraction.den;
		resultFraction.num= resultFraction.num - integer
				* resultFraction.den;
		this.NOD();
		System.out.print(integer + "+");
		resultFraction.print();
	}

	public int compareTo(Fraction a) {
		int result = a.num * this.den-a.den * this.num;
		if (result < 0)
			return -1;
		if (result == 0)
			return 0;
		if (result > 0)
			return 1;
		return -2;
	}

	private void NOD() {
		int a;
		int b;
		a = this.num;
		b = this.den;
		while ((a != 0) && (b != 0)) {
			if (a >= b)
				a = a % b;
			else
				b = b % a;
		}
		a = a + b;
		this.num = this.num / a;
		this.den = this.den / a;
		if (this.den < 0) {
			this.den = -this.den;
			this.num = -this.num;
		}
	}

	public void print() {
		System.out.println(this.getNum() + "/" + this.getDen());
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}
	
	public Fraction(){
	}
	
	public void scanFrac(){
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите числитель и знаменатель");
		num=sc.nextInt();
		den=sc.nextInt();
	}
	
}
